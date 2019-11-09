package vip.vshome.www.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "my-service", fallbackFactory = ServiceFeignFallback.class)
public interface ServiceFeign {

    @GetMapping("/call")
    public String call();

}
