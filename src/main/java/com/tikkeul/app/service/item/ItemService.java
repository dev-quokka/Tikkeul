package com.tikkeul.app.service.item;

import com.tikkeul.app.domain.dto.ItemDTO;
import com.tikkeul.app.domain.dto.OrderDTO;

import java.util.List;
import java.util.Optional;

public interface ItemService {
//    김보령 작업공간
//    열매샵 제품 목록 가져오기 : list.html
//    public List<ItemDTO> getList(CategoryType categoryType);

//    열매샵 제품 상세 보기 : readDetail.html
    public Optional<ItemDTO> readDetail(Long id);

//    후기 수, 별점 가져오기
    public Optional<OrderDTO> readScoreAndCountOfReview(Long id);

    public void writeItem(ItemDTO itemDTO);


    public List<ItemDTO> getOptionItemList(Long savingLevelId);

    public List<ItemDTO> getitemList();
}
