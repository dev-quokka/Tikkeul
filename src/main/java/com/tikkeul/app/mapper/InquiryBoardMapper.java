package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.InquiryBoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface InquiryBoardMapper {
//    관리자 페이지에서 문의 내역 조회
    public List<InquiryBoardDTO> adminSelectAllinquiry();


}
