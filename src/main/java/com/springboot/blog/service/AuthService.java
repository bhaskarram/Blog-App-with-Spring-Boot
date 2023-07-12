package com.springboot.blog.service;

import com.springboot.blog.entity.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
