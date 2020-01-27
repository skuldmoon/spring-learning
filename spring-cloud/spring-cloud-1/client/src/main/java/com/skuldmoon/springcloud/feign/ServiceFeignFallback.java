package com.skuldmoon.springcloud.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ServiceFeignFallback implements FallbackFactory<ServiceFeign> {

    @Override
    public ServiceFeign create(Throwable throwable) {
        return new ServiceFeign() {
            @Override
            public String call() {
                System.out.println("service call fallback!");
                return "service call fallback!";
            }
        };
    }

}
