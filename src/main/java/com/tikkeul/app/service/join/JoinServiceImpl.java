package com.tikkeul.app.service.join;

import com.tikkeul.app.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Qualifier("join") @Primary
public class JoinServiceImpl implements JoinService{
    @Override
    public Optional<UserVO> selectByUserId(String identification) {
        return Optional.empty();
    }

    @Override
    public void insert(UserVO userVO) {

    }
}
