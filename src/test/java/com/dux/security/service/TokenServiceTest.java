package com.dux.security.service;

import com.dux.security.dto.SecurityResponse;
import com.dux.security.service.impl.TokenServiceImpl;
import com.dux.security.utils.TestUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class TokenServiceTest {

  @InjectMocks TokenServiceImpl tokenService;

  @Test
  void whenDecodeTokenThenOk() {
    SecurityResponse<String> response = new SecurityResponse<>();
    response.setCode(TestUtils.STATUS_CODE_OK);

    assertEquals(response.getCode(), this.tokenService.verifyToken(TestUtils.SUCCESS_TOKEN).getCode());
  }

  @Test
  void whenDecodeTokenThenError() {
    SecurityResponse<String> response = new SecurityResponse<>();
    response.setCode(TestUtils.STATUS_CODE_INTERNAL_SERVER_ERROR);

    assertEquals(response.getCode(), this.tokenService.verifyToken(TestUtils.ERROR_TOKEN).getCode());
  }
}
