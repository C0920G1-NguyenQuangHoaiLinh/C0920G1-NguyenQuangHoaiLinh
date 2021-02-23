package com.codegym.repository;

import com.codegym.entity.QuestionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionTypeRepository extends JpaRepository<QuestionType, Long> {
    Page<QuestionType> findByName(QuestionType questionType, Pageable pageable);
}
