package com.oz.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user")
public interface UserFeign {
    @GetMapping(value = "/user/hello")
    String hello();
}
