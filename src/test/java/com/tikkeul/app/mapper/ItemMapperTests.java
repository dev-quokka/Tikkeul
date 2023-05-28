package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.OrderDTO;
import com.tikkeul.app.domain.type.CategoryType;
import com.tikkeul.app.service.item.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@Slf4j
public class ItemMapperTests {
    @Autowired
    private ItemService itemService;

    //    상품페이지
    @Test
    public void selectAllTest(CategoryType categoryType){
        log.info(itemService.getList(categoryType).get());
    }
}

