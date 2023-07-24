/**
 * The EurekaConfiguration class is a Spring `@Configuration` class in the `com.cloudconfig.test package`. 
 * It is used to configure the properties of the Eureka instance for a microservice that is intended to be 
 * a Eureka client.
 * 
 * Author:  Ioannis Tsouvalas
 *          https://github.com/itsouvalas/
 * 
 */
package com.cloudconfig.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.annotation.Configuration;
import javax.annotation.PostConstruct;

@Configuration
public class EurekaConfiguration {

    @Autowired
    private EurekaInstanceConfigBean eurekaInstanceConfig;

    @PostConstruct
    public void init() {
        // Set the instance name, which will appear in Eureka
        eurekaInstanceConfig.setAppname("sc-config-test");
        // Set other fields as desired...
    }
    
}
