package com.codegym.service;

import com.codegym.entity.Question;
import com.codegym.entity.QuestionType;
import com.codegym.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;
    @Override
    public Page<Question> findAll(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    @Override
    public Question findById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    @Override
    public void saveQuestion(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void deleteQuestion(Question question) {
        questionRepository.delete(question);
    }

    @Override
    public Page<Question> findByTitle(String title, Pageable pageable) {
        return questionRepository.findByTitle(title, pageable);
    }

    @Override
    public Page<Question> findByTitleAndQuestionType(String title, QuestionType questionType, Pageable pageable) {
        return questionRepository.findByTitleAndQuestionType(title, questionType, pageable);
    }
}
