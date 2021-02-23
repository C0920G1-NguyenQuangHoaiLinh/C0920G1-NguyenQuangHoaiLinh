package com.codegym.repository;

import com.codegym.entity.Question;
import com.codegym.entity.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotEmpty;

public interface QuestionRepository extends JpaRepository<Question,Long> {
    Page<Question> findByTitle(String title, Pageable pageable);

    Page<Question> findByTitleAndQuestionType(String title, QuestionType questionType, Pageable pageable);

}
