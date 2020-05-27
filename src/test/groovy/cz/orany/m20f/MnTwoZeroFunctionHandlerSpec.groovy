package cz.orany.m20f

import spock.lang.AutoCleanup
import spock.lang.Specification

class MnTwoZeroFunctionHandlerSpec extends Specification {

    MnTwoZeroFunctionService service = Mock(MnTwoZeroFunctionService)

    @AutoCleanup MnTwoZeroFunctionHandler handler = new MnTwoZeroFunctionHandler()

    void setup() {
        handler.mnTwoZeroFunctionService = service
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
