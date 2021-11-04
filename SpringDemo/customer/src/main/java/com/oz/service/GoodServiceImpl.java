package com.oz.service;

import com.oz.feign.GoodFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodFeign goodFeign;

    @Override
    public String hello() {
        return goodFeign.hello();
    }
}
