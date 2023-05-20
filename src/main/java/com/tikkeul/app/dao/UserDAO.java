package com.tikkeul.app.dao;

import com.tikkeul.app.domain.vo.UserVO;
import com.tikkeul.app.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserDAO {

    private final UserMapper userMapper;


//    홍윤기의 작업공간
    //    아이디 중복검사
    public Optional<UserVO> selectByUserId(String identification){
        return userMapper.selectByUserId(identification);
    };

    //    회원가입
    public RedirectView insert(UserVO userVO){
        userMapper.insert(userVO);
        return new RedirectView("/login");
    };

    //    로그인
    public Optional<Long> selectByUserIdAndUserPassword(@Param("id") String id, @Param("password") String password){
        return userMapper.selectByUserIdAndUserPassword(id,password);
    };

    public Optional<UserVO> selectMypage() {
        return;

    }

}
