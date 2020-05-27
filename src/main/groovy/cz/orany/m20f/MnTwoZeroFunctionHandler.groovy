package cz.orany.m20f

import groovy.transform.CompileStatic
import groovy.transform.InheritConstructors
import io.micronaut.function.FunctionBean
import io.micronaut.function.executor.FunctionInitializer
import java.util.function.Function
import javax.inject.Inject

@CompileStatic
@FunctionBean(
        value = 'mn-two-zero-function',
        method = 'apply'
)
@InheritConstructors
class MnTwoZeroFunctionHandler extends FunctionInitializer implements Function<MnTwoZeroFunctionRequest, MnTwoZeroFunctionResponse> {

    /**
     * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar
     * where the argument to echo is the JSON to be parsed.
     */
    static void main(String...args) throws IOException {
        MnTwoZeroFunctionHandler function = new MnTwoZeroFunctionHandler()
        function.run(args) { context ->
            function.apply(context.get(MnTwoZeroFunctionRequest))
        }
    }

    @Inject MnTwoZeroFunctionService mnTwoZeroFunctionService

    @Override
    MnTwoZeroFunctionResponse apply(MnTwoZeroFunctionRequest event) {
         return mnTwoZeroFunctionService.handle(event)
    }

}
