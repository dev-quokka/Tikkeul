package com.tikkeul.app.service.doranBoard;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("doranBoard") @Primary
public class DoranBoardServiceImpl implements DoranBoardService {
}
