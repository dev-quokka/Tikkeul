package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.ItemFileDTO;
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
        fileMapper.selectAll(1L).stream().map(ItemFileDTO::toString).forEach(log::info);
        
    }


}
