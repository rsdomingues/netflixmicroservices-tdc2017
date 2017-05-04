package net.tdc.netflixmicroservices.remote;

import org.springframework.stereotype.Component;

@Component
public class BarFallback implements BarClient{

    @Override
    public Detail getInfo() {
        return new Detail("Bar[Fallback]");
    }
}
