package com.tikkeul.app.domain.vo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class SavingVO {
    private Long savingId;
    private String date;
    private int money;
    private String status;
    private String startDate;
    private String endDate;
    private Long userId;
    private Long levelId;


}
