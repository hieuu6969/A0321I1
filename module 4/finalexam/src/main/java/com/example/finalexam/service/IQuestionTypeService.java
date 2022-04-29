package com.example.finalexam.service;

import com.example.finalexam.model.QuestionType;

import java.util.List;

public interface IQuestionTypeService {
    List<QuestionType> findAll();
    void save(QuestionType questionType);
    void deleteById(Long id);
}
