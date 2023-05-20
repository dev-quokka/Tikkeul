package com.tikkeul.app.service.login;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Qualifier("login") @Primary
public class LoginServiceImpl implements LoginService{
    @Override
    public Optional<Long> selectByUserIdAndUserPassword(String id, String password) {
        return Optional.empty();
    }
}
