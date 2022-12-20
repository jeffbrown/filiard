package filiard;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.annotation.*;

@Controller("/demo")
public class DemoController {

    @Value("${feature-flag-1.enabled}")
    boolean someValue;

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Flag Value: " + someValue;
    }
}