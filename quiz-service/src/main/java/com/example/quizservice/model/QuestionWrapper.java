package com.example.quizservice.model;

import lombok.Data;

@Data //dont need to define getters and setters
public class QuestionWrapper { //note that there is no answer here
    private Integer id;
    private String questionTitle; //the ORM framework, JPA will take care of the casing
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public QuestionWrapper(Integer id, String questionTitle, String option1, String option2, String option3, String option4) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
}
