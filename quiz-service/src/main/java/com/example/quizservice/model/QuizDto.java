package com.example.quizservice.model;

import lombok.Data;

@Data //we use this , so getters and setters are not needed
public class QuizDto {
    String categoryName;
    Integer numQuestions;
    String title;
}
