package com.dux.security.service.impl;

import com.dux.security.dto.SecurityResponse;
import com.dux.security.dto.UserDto;
import com.dux.security.service.TokenService;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

  public SecurityResponse<String> verifyToken(String token) {
    return null;
  }

  @Override public SecurityResponse<String> login(UserDto user) {
    return null;
  }
}
