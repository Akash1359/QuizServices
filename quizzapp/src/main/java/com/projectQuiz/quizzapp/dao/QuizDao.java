package com.projectQuiz.quizzapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectQuiz.quizzapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
