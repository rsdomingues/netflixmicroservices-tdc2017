package net.tdc.netflixmicroservices.remote;

import org.springframework.stereotype.Component;

@Component
public class BarFallback implements BarClient{

    @Override
    public Info getInfo() {
        return new Info("Bar[Fallback]");
    }
}
