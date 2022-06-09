package com.kursovaya2.Services;

import com.kursovaya2.Essence.Question;

import java.util.Collection;

public interface QuestionService {

    boolean add(String question, String answer);

    boolean remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();

    int getSize();

}
