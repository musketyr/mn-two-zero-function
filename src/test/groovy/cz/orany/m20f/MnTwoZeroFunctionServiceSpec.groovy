package cz.orany.m20f

import io.micronaut.context.ApplicationContext
import spock.lang.AutoCleanup
import spock.lang.Specification

class MnTwoZeroFunctionServiceSpec extends Specification {

    @AutoCleanup ApplicationContext context

    MnTwoZeroFunctionService service

    void setup() {
        context = ApplicationContext.build('test').build()
        // TODO: register mock collaborators
        // context.registerSingleton(Foo, fooMock)
        context.start()

        service = context.getBean(MnTwoZeroFunctionService)
    }

    void 'handle event'() {
        given:
            MnTwoZeroFunctionRequest event = new MnTwoZeroFunctionRequest()
            // MnTwoZeroFunctionResponse expectedOutput = new MnTwoZeroFunctionResponse()
        when:
            /* MnTwoZeroFunctionResponse output = */ service.handle(event)
        then:
            thrown UnsupportedOperationException

            // TODO: verify output
            // output == expectedOutput
    }

}
