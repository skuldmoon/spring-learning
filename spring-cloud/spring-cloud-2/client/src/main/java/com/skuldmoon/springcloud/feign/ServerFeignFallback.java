package com.skuldmoon.springcloud.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ServerFeignFallback implements FallbackFactory<ServerFeign>{

    @Override
    public ServerFeign create(Throwable throwable) {
        return new ServerFeign() {
            @Override
            public String call() {
                System.out.println("call fallback");
                return "call fallback";
            }
        };
    }
}
