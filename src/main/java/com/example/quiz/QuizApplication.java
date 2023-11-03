package com.example.quiz;

import com.example.quiz.entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.quiz.entity.Quiz;
import com.example.quiz.repository.QuizRepository;

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args).getBean(QuizApplication.class).execute();;
	}

	@Autowired
	QuizRepository repository;

	private void execute(){
		setup();
	}


	private void setup(){
		Quiz quiz1 = new Quiz(null,"ㅇㅇㅇ", true, "ㅇㅇㅇ");
		quiz1 = repository.save(quiz1);
		System.out.println("등록한 퀴즈는" + quiz1);

	}
}

