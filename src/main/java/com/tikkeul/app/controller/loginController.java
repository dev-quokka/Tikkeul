package com.tikkeul.app.controller;

import com.tikkeul.app.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/login/*")
@RequiredArgsConstructor
public class loginController {

    final UserMapper userMapper;

//  로그인페이지로 이동
    @GetMapping()
    public void gotoLogin(){;}









}
