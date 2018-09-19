package com.xal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaServerApp3
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServerApp3.class,args);
    }
}
