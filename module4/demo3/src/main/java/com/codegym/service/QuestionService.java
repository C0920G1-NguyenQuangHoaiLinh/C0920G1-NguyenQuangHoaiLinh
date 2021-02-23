package com.codegym.service;

import com.codegym.entity.Question;
import com.codegym.entity.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface QuestionService {
    Page<Question> findAll(Pageable pageable);

    Question findById(Long id);

    void saveQuestion(Question question);

    void deleteQuestion(Question question);

    Page<Question> findByTitle(String title, Pageable pageable);

    Page<Question> findByTitleAndQuestionType(String title, QuestionType questionType, Pageable pageable);
}
