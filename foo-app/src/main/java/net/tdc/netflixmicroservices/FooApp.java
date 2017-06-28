package net.tdc.netflixmicroservices;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "net.tdc.netflixmicroservices.remote")
@EnableHystrix
@EnableCircuitBreaker
public class FooApp {

    public static void main(String[] args) {
        SpringApplication.run(FooApp.class, args);
    }

}
