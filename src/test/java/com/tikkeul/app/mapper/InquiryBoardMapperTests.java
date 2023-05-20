package com.tikkeul.app.mapper;


import com.tikkeul.app.domain.dto.InquiryBoardDTO;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class InquiryBoardMapperTests {

    @Autowired
    private InquiryBoardMapper inquiryBoardMapper;

    @Test
    public void adminSelectinquiryAllTest(){
        Assertions.assertThat(inquiryBoardMapper.adminSelectAllinquiry()).hasSize(2);

    }


}
