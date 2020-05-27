package cz.orany.m20f

import io.micronaut.context.ApplicationContext
import spock.lang.AutoCleanup
import spock.lang.Specification

class MnTwoZeroFunctionHandlerSpec extends Specification {

    MnTwoZeroFunctionService service = Mock(MnTwoZeroFunctionService)

    @AutoCleanup ApplicationContext context
    @AutoCleanup MnTwoZeroFunctionHandler handler

    void setup() {
        context = ApplicationContext.build().build()
        context.registerSingleton(MnTwoZeroFunctionService, service)
        context.start()
        handler = new MnTwoZeroFunctionHandler(context)
    }

    void 'handle event'() {
        given:
            MnTwoZeroFunctionRequest event = new MnTwoZeroFunctionRequest()
            MnTwoZeroFunctionResponse expectedOutput = new MnTwoZeroFunctionResponse()
        when:
            MnTwoZeroFunctionResponse output = handler.apply(event)
        then:
            output.is expectedOutput

            1 * service.handle(event) >> expectedOutput
    }

}
