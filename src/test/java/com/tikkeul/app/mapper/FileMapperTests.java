package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.ItemFileDTO;
import com.tikkeul.app.dao.ItemFileDAO;
import com.tikkeul.app.domain.dto.FileDTO;
import com.tikkeul.app.domain.type.FileType;
import com.tikkeul.app.domain.dto.SavingLevelFileDTO;
import com.tikkeul.app.domain.vo.FileVO;
import com.tikkeul.app.domain.vo.ItemFileVO;
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
//        fileMapper.selectAll(1L).stream().map(FileVO::toString).forEach(log::info);
        
    }
    @Test
    public void insertTest(){
        FileVO fileVO1 = new FileVO();
        fileVO1.setOriginName("씨앗");
        fileVO1.setFileType(FileType.REPRESENTATIVE.name());
        fileVO1.setFileSize(12L);
        fileVO1.setUuid(UUID.randomUUID().toString());
        fileVO1.setFilePath("2023/05/28");
        fileMapper.insertfile(fileVO1);
        FileVO fileVO = new FileVO();
        fileVO.setOriginName("새싹");
        fileVO.setFileType(FileType.REPRESENTATIVE.name());
        fileVO.setFileSize(12L);
        fileVO.setUuid(UUID.randomUUID().toString());
        fileVO.setFilePath("2023/05/28");
        fileMapper.insertfile(fileVO);
        FileVO fileVO2 = new FileVO();
        fileVO2.setOriginName("나무");
        fileVO2.setFileType(FileType.REPRESENTATIVE.name());
        fileVO2.setFileSize(12L);
        fileVO2.setUuid(UUID.randomUUID().toString());
        fileVO2.setFilePath("2023/05/28");
        fileMapper.insertfile(fileVO2);
    }

    @Test
    public void savingLevelSelectlAllTest(){
        fileMapper.savingLevelSelectlAll(21L).stream().map(SavingLevelFileDTO::toString).forEach(log::info);
    }
    
}
