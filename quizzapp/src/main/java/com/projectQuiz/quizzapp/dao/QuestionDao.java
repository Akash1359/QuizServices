package com.projectQuiz.quizzapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projectQuiz.quizzapp.model.Question;

@Repository

//Question:- class name which maps to the data/table
//Integer:- primary key type
public interface QuestionDao extends JpaRepository<Question, Integer> {
	
	List<Question> findByCategory(String category);
	
	@Query(value = "SELECT * FROM question q Where q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)

	List<Question>findRandomQuestionsByCategory(@Param("category") String category, @Param("numQ") int numQ);
}
