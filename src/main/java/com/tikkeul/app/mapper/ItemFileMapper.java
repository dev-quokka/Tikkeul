package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.vo.ItemFileVO;
import com.tikkeul.app.domain.vo.SavingLevelFileVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemFileMapper {

    public void insertItem(ItemFileVO itemFileVO);
}
