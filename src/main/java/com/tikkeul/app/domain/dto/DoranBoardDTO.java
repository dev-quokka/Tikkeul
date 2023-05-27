package com.tikkeul.app.domain.dto;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class DoranBoardDTO {
/*도란보드 최보근*/
    private Long id;
    private String title;
    private String content;
    private int viewCount;
    private String registerDate;
    private String updateDate;
    private Long userId;
    private Long itemId;
    private String name;
    private String status;
    private String identification;

}
