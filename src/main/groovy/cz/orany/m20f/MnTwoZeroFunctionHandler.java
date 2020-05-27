package cz.orany.m20f;

import io.micronaut.context.ApplicationContext;
import io.micronaut.function.FunctionBean;
import io.micronaut.function.executor.FunctionInitializer;

import javax.inject.Inject;
import java.util.function.Function;

@FunctionBean(value = "mn-two-zero-function", method = "apply")
public class MnTwoZeroFunctionHandler extends FunctionInitializer implements Function<MnTwoZeroFunctionRequest, MnTwoZeroFunctionResponse> {

    @Inject private MnTwoZeroFunctionService mnTwoZeroFunctionService;

    @Override
    public MnTwoZeroFunctionResponse apply(MnTwoZeroFunctionRequest event) {
        return mnTwoZeroFunctionService.handle(event);
    }

    public MnTwoZeroFunctionHandler() {
        super();
    }

    public MnTwoZeroFunctionHandler(ApplicationContext applicationContext) {
        super(applicationContext);
    }

    public MnTwoZeroFunctionHandler(ApplicationContext applicationContext, boolean inject) {
        super(applicationContext, inject);
    }

}
