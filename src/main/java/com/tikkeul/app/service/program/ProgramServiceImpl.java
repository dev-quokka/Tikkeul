package com.tikkeul.app.service.program;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("program") @Primary
public class ProgramServiceImpl implements ProgramService{
}
