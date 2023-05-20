package com.tikkeul.app.service.login;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface LoginService {
    //    로그인
    public Optional<Long> selectByUserIdAndUserPassword(@Param("id") String id, @Param("password") String password);
}
