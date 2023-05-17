package com.tikkeul.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class DoranBoardVO {
    private Long doranBoardId;
    private String title;
    private String content;
    private int viewCount;
    private String registerDate;
    private String updateDate;
    private Long userId;
    private Long levelId;
}
