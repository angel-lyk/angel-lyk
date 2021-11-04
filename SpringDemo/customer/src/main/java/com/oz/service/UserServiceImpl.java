package com.oz.service;

import com.oz.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserFeign userFeign;

    @Override
    public String hello() {
        return userFeign.hello();
    }
}
