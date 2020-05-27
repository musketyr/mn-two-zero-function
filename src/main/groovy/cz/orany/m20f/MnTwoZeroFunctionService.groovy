package cz.orany.m20f

import com.agorapulse.micronaut.log4aws.LogError
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import javax.inject.Singleton

@Slf4j
@Singleton
@CompileStatic
class MnTwoZeroFunctionService {

    private final MnTwoZeroFunctionConfiguration configuration

    MnTwoZeroFunctionService(
        MnTwoZeroFunctionConfiguration configuration
    ) {
        this.configuration = configuration
    }

    @LogError
    MnTwoZeroFunctionResponse handle(MnTwoZeroFunctionRequest event) {
        // TODO: implement
        log.debug "got event: $event"
        throw new UnsupportedOperationException('TODO: implement')
    }

}
