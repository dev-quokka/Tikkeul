package com.tikkeul.app.mapper;

import com.tikkeul.app.dao.ItemFileDAO;
import com.tikkeul.app.domain.dto.FileDTO;
import com.tikkeul.app.domain.type.FileType;
import com.tikkeul.app.domain.vo.FileVO;
import com.tikkeul.app.domain.vo.ItemFileVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
@Slf4j
public class FileMapperTests {
    @Autowired
    private FileMapper fileMapper;

    @Test
    public void selectAllTest(){
        fileMapper.selectAll(1L).stream().map(FileDTO::toString).forEach(log::info);
        
    }


}
