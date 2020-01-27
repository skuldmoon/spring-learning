package com.skuldmoon.springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "server", fallbackFactory = ServiceFeignFallback.class)
public interface ServiceFeign {

    @GetMapping("/call")
    public String call();

}
