package com.tikkeul.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@Data
@NoArgsConstructor
public class InquiryBoardVO {
    private Long id;
    private String type;
    private String title;
    private String content;
    private String registerDate;
    private String updateDate;
    private Long userId;

}

