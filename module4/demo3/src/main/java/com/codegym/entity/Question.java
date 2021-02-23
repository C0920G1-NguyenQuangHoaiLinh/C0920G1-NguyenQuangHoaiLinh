package com.codegym.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String title;

    private String question;

    private String answer;

    @ManyToOne
    @JoinColumn(name = "id_question_type", referencedColumnName = "id")
    QuestionType questionType;

    private String dateCreate;

    @ManyToOne
    @JoinColumn(name = "user_create",referencedColumnName = "id")
    User userCreate;

    @ManyToOne
    @JoinColumn(name = "user_feedback",referencedColumnName = "id")
    User userFeedback;

    private String status;

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public User getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(User userCreate) {
        this.userCreate = userCreate;
    }

    public User getUserFeedback() {
        return userFeedback;
    }

    public void setUserFeedback(User userFeedback) {
        this.userFeedback = userFeedback;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
