package filiard;

import io.micronaut.context.annotation.Value;
import jakarta.inject.Singleton;

@Singleton
public class FlagHelper {

    @Value("${feature-flag-1.enabled}")
    boolean someValue;

    public String createMessage() {
        return "Flag Value: " + someValue;
    }
}
