package net.tdc.netflixmicroservices.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Feign;
import feign.hystrix.HystrixFeign;

@Configuration
@EnableFeignClients(basePackages = "net.tdc.netflixmicroservices.remote")
public class FeignConfig {

    @Bean
    public Feign.Builder feignBuilder() {
        return HystrixFeign.builder();
    }
}
