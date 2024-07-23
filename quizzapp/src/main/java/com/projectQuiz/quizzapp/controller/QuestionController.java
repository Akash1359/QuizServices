package com.projectQuiz.quizzapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectQuiz.quizzapp.model.Question;
import com.projectQuiz.quizzapp.service.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionController {
	
	
	//reference;
	@Autowired
	QuestionService questionService;
	
	//accept the request from the user!
	@GetMapping("/allquestions")
	public ResponseEntity<List<Question>> getAllQuestion() {
		return questionService.getAllQuestion();
	}
	
	@GetMapping("/category/{category}")

	public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category) {
		return questionService.getQuestionByCategory(category);
	}
	
	
	@PostMapping("add")
	public ResponseEntity<String> addQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
		
	}

}
