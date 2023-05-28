package com.tikkeul.app.service.item;

import com.tikkeul.app.dao.ItemDAO;
import com.tikkeul.app.domain.dto.ItemDTO;
import com.tikkeul.app.domain.dto.OrderDTO;
import com.tikkeul.app.domain.type.CategoryType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemDAO itemDAO;
//    김보령 작업공간
//    열매샵 제품 목록 가져오기 : list.html
    @Override
    public List<ItemDTO> getList(CategoryType categoryType) {
        return itemDAO.findAll(categoryType);
    }

//    열매샵 제품 상세 보기 : readDetail.html
    @Override
    public Optional<ItemDTO> readDetail(Long id) {
        return itemDAO.readDetail(id);
    }

//    후기 수 별점
    @Override
    public Optional<OrderDTO> readScoreAndCountOfReview(Long id) {
        return itemDAO.readScoreAndCountOfReview(id);
    }
}
