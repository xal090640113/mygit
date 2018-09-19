package com.xal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class ClientApp1
{
    public static void main( String[] args )
    {
        SpringApplication.run(ClientApp1.class, args);
    }
    @Bean
    @LoadBalanced //客户端负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
