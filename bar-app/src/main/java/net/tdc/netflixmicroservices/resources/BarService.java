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

    @RequestMapping(value = "/detail", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public Detail name() {
        return new Detail("Bar");
    }

}
