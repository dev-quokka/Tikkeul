package com.tikkeul.app.domain.type;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class CategoryType {
    private String sort;
    private String level;
    private String category;
    private Long count;
}
