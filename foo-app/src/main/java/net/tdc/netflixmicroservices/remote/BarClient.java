package net.tdc.netflixmicroservices.remote;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "bar", fallback = BarFallback.class)
public interface BarClient {

    @RequestMapping(method = RequestMethod.GET, value = "/name")
    Info getInfo();
}
