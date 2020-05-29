package com.skuldmoon.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "server", fallbackFactory = ServerFeignFallback.class)
public interface ServerFeign {

    @GetMapping("/longCall")
    String call();

}
