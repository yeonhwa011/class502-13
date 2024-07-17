package config;

import exam03.RecCalculator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

    public RecCalculator recCalculator(){
        return new RecCalculator();
    }
}

