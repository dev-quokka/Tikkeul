package com.tikkeul.app.domain.vo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class SavingVO {
    private Long id;
    private int title;
    private String status;
    private String content;
    private String start;
    private String end;
    private Long userId;
}
