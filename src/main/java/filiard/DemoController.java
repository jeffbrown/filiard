package filiard;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/demo")
public class DemoController {

    private final FlagHelper flagHelper;

    public DemoController(FlagHelper flagHelper) {
        this.flagHelper = flagHelper;
    }

    @Get(uri="/", produces="text/plain")
    public String index() {
        return flagHelper.createMessage();
    }
}