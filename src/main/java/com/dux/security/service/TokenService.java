package com.dux.security.service;

import com.dux.security.dto.SecurityResponse;
import com.dux.security.dto.UserDto;

public interface TokenService {

  SecurityResponse<String> verifyToken(String token);

  SecurityResponse<String> login(UserDto user);
}
