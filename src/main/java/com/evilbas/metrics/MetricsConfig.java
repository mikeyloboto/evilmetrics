package com.evilbas.metrics;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:metrics.properties")
public class MetricsConfig {
    public static String test() {
        return "Success";
    }
}
