package net.tdc.netflixmicroservices.resources;


import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarService {

    @RequestMapping("/info")
    public String info() {
        return "You called the Bar App";
    }

    @RequestMapping(value = "/name", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public String name() {
        return "{\"name\":\"Bar\"}";
    }

}
