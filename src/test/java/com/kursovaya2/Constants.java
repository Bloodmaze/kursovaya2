package com.kursovaya2;

import com.kursovaya2.Essence.Question;

import java.util.Set;

public class Constants {
    public static final String QUESTION1 = "One";
    public static final String QUESTION2 = "Two";
    public static final String QUESTION3 = "Three";
    public static final String QUESTION4 = "Four";
    public static final String QUESTION5 = "Five";

    public static final String ANSWER1 = "AnswerOne";
    public static final String ANSWER2 = "AnswerTwo";
    public static final String ANSWER3 = "AnswerThree";
    public static final String ANSWER4 = "AnswerFour";
    public static final String ANSWER5 = "AnswerFive";

    public static final Question FULL_QUESTION1 = new Question(QUESTION1, ANSWER1);
    public static final Question FULL_QUESTION2 = new Question(QUESTION2, ANSWER2);
    public static final Question FULL_QUESTION3 = new Question(QUESTION3, ANSWER3);
    public static final Question FULL_QUESTION4 = new Question(QUESTION4, ANSWER4);
    public static final Question FULL_QUESTION5 = new Question(QUESTION5, ANSWER5);

    public static final Set<Question> TEST_QUESTIONS_SET_1 = Set.of(FULL_QUESTION1, FULL_QUESTION2, FULL_QUESTION3, FULL_QUESTION4, FULL_QUESTION5);
    public static final Set<Question> TEST_QUESTIONS_SET_2 = Set.of(FULL_QUESTION1);

    public static final String EMPTY_ANSWER = null;

}
