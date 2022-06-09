package com.kursovaya2.Services;
import com.kursovaya2.Essence.Question;
import com.kursovaya2.Exceptions.InvalidQuestionRequestException;
import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount) throws InvalidQuestionRequestException;
}
