package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.FileDTO;
import com.tikkeul.app.domain.vo.FileVO;
import com.tikkeul.app.domain.vo.ItemFileVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileMapper {
//    김보령 작업공간
//    파일 조회
    public List<FileDTO> selectAll(Long itemId);

}
