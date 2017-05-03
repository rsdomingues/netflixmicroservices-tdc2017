package net.tdc.netflixmicroservices.resources;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooService {

    @RequestMapping("/info")
    public String info() {
        return "You called the Foo App";
    }

}
