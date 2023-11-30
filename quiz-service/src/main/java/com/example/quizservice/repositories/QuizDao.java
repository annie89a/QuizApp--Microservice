package com.example.quizservice.repositories;


import com.example.quizservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> { //type of table and type of quiz

}
