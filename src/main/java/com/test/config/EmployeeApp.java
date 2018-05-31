package com.test.config;

import com.ulisesbocchio.jasyptspringboot.environment.StandardEncryptableEnvironment;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 */


@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.test.controller" })
public class EmployeeApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder().environment(new StandardEncryptableEnvironment()).sources(EmployeeApp.class).run(args);
    }
}
