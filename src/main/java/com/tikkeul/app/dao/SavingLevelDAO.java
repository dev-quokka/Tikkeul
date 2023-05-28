package com.tikkeul.app.dao;

import com.tikkeul.app.domain.dto.ItemFileSavingLevelDTO;
import com.tikkeul.app.domain.dto.SavingLevelDTO;
import com.tikkeul.app.domain.dto.SavingLevelFileDTO;
import com.tikkeul.app.domain.vo.SavingLevelVO;
import com.tikkeul.app.mapper.SavingLevelMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class SavingLevelDAO {
    private final SavingLevelMapper savingLevelMapper;


    public void saveSavingLevel(SavingLevelDTO savingLevelDTO){
        savingLevelMapper.insertSavingLevel(savingLevelDTO);
    }

    public List<SavingLevelVO> FindSavingLevelAll(){
        return savingLevelMapper.admminSelectSavingLevelAll();
    }

    public List<SavingLevelFileDTO> findAll() {
        log.info( savingLevelMapper.savingLevelFileAll().toString());
        return savingLevelMapper.savingLevelFileAll();
    }
}
