package net.tdc.netflixmicroservices;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class FooApp {

    public static void main(String[] args) {
        SpringApplication.run(FooApp.class, args);
    }

}
