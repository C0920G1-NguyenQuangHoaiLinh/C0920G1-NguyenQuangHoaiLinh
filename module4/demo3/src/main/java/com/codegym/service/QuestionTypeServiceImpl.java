package com.codegym.service;

import com.codegym.entity.QuestionType;
import com.codegym.repository.QuestionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {
    @Autowired
    QuestionTypeRepository questionTypeRepository;

    @Override
    public Page<QuestionType> findAll(Pageable pageable) {
        return questionTypeRepository.findAll(pageable);
    }

    @Override
    public Page<QuestionType> findByQuestionType(QuestionType questionType, Pageable pageable) {
        return questionTypeRepository.findByName(questionType, pageable);
    }
}
