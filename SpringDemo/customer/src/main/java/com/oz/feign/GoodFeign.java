package com.oz.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "good")
public interface GoodFeign {
    @GetMapping(value = "/good/hello")
    String hello();
}
