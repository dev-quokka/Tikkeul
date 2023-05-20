package com.tikkeul.app.service.join;

import com.tikkeul.app.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface JoinService {
    //    아이디 중복검사
    public Optional<UserVO> selectByUserId(String identification);

    //    회원가입
    public void insert(UserVO userVO);
}
