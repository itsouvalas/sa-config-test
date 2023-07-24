/**
 * The `TestApplication` class is a Spring Boot application in the `com.cloudconfig.test package`. 
 * It serves as a RESTful web service that interacts with the Spring Cloud Config server and 
 * is registered as a Eureka client for service discovery. 
 * The class is also enabled for dynamic property refreshing using Spring Cloud Config and 
 * the `@RefreshScope` annotation.
 * 
 * Author:  Ioannis Tsouvalas
 *          https://github.com/itsouvalas/
 * 
 */
package com.cloudconfig.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@RestController

public class TestApplication {

    @Value("${message:Default message Value-Property not retrieved}")
    String welcomeText;

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

    @RequestMapping(value = "/")
    public String welcomeText() {
        return welcomeText;
    }

}
