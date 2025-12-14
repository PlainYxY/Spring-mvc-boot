package com.yxy.service.impl;

import com.yxy.domain.User;
import com.yxy.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("User Service");
    }
}
