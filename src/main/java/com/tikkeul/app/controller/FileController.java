package com.tikkeul.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/files/*")
public class FileController {
//    파일 불러오기
    @GetMapping("display")
    @ResponseBody
    public byte[] display(String originName) throws IOException{
        return FileCopyUtils.copyToByteArray(new File("C:/upload/", originName));
    }


}
