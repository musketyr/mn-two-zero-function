package cz.orany.m20f

import groovy.transform.CompileStatic
import groovy.transform.ToString
import io.micronaut.context.annotation.ConfigurationProperties

@ToString
@CompileStatic
@ConfigurationProperties('mn.two.zero.function')
class MnTwoZeroFunctionConfiguration {

    String value

}
