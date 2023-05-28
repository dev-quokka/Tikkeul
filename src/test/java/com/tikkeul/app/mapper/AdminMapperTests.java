package com.tikkeul.app.mapper;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class AdminMapperTests {

    @Autowired
    private AdminMapper adminMapper;

//    @Test
//    public void adminSelectUserAllTest(Search search){
//        assertThat(adminMapper.adminSelectUserAll()).hasSize(2);
//        log.info(adminMapper.adminSelectUserAll(search).toString());

//    }

    @Test
    public void adminDeleteUserTest(){
//        adminMapper.adminDeleteUser(12L);
    }
//
    @Test
    public void adminMainSelectItem(){
        log.info(adminMapper.adminMainSelectItem().toString());
    }
}




