package com.tikkeul.app.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class SavingLevelFileDTO {
    private Long id;

    private Long savinglevelId;
    private String savinglevelName;
    private int goalMoney;
    private int dailyMoney;
    private String content;
    private Long fileSize;
    private String fileOriginName;
    private String fileUuid;
    private String filePath;
    private String fileType;
}