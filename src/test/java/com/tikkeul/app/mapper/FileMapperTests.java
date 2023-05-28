package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.SavingLevelFileDTO;
import com.tikkeul.app.domain.vo.FileVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class FileMapperTests {
    @Autowired
    private FileMapper fileMapper;

    @Test
    public void selectAllTest(){
        fileMapper.selectAll(1L).stream().map(FileVO::toString).forEach(log::info);
        
    }

    @Test
    public void savingLevelSelectlAllTest(){
        fileMapper.savingLevelSelectlAll(21L).stream().map(SavingLevelFileDTO::toString).forEach(log::info);
    }
    
}
