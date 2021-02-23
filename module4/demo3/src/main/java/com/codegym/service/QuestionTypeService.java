package com.codegym.service;

import com.codegym.entity.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QuestionTypeService {
    Page<QuestionType> findAll(Pageable pageable);
    Page<QuestionType> findByQuestionType(QuestionType questionType, Pageable pageable);
}
