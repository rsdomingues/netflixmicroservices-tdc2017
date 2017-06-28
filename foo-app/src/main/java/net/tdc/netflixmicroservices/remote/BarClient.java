package net.tdc.netflixmicroservices.remote;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "bar-app", fallback = BarFallback.class)
public interface BarClient {

    @RequestMapping(method = RequestMethod.GET, value = "/detail")
    Detail getInfo();
}
