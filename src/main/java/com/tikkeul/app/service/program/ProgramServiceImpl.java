package com.tikkeul.app.service.program;

import com.tikkeul.app.dao.FileDAO;
import com.tikkeul.app.dao.SavingLevelDAO;
import com.tikkeul.app.dao.SavingLevelFileDAO;
import com.tikkeul.app.domain.dto.SavingLevelDTO;
import com.tikkeul.app.domain.type.FileType;
import com.tikkeul.app.domain.vo.SavingLevelFileVO;
import com.tikkeul.app.domain.vo.SavingLevelVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("program") @Primary
@Slf4j
public class ProgramServiceImpl implements ProgramService{
    private final SavingLevelDAO savingLevelDAO;
    private final SavingLevelFileDAO savingLevelFileDAO;
    private final FileDAO fileDAO;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void writeSavingLevel(SavingLevelDTO savingLevelDTO) {
        savingLevelDAO.saveSavingLevel(savingLevelDTO);
        for(int i=0; i<savingLevelDTO.getFiles().size(); i++){
            savingLevelDTO.getFiles().get(i).setSavinglevelId(savingLevelDTO.getId());
            savingLevelDTO.getFiles().get(i).setFileType(i == 0 ? FileType.REPRESENTATIVE.name() : FileType.NON_REPRESENTATIVE.name());
            fileDAO.save(savingLevelDTO.getFiles().get(i));
            log.info(savingLevelDTO.getFiles().get(i).toString());
        }
        savingLevelDTO.getFiles().forEach(savingLevelFileDTO ->
        { SavingLevelFileVO savingLevelFileVO = new SavingLevelFileVO();
            savingLevelFileVO.setId(savingLevelFileDTO.getId());
            savingLevelFileVO.setSavinglevelId(savingLevelFileDTO.getSavinglevelId());
            savingLevelFileDAO.save(savingLevelFileVO);
        });

    }

    @Override
    public List<SavingLevelVO> getSavingLevelAll() {
        return savingLevelDAO.FindSavingLevelAll();
    }
}
