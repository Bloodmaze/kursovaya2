package com.kursovaya2.Services;

import com.kursovaya2.Essence.Question;
import com.kursovaya2.Exceptions.InvalidQuestionRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private static final Logger log = LoggerFactory.getLogger(ExaminerServiceImpl.class);
    private final QuestionService questionServices;

    public ExaminerServiceImpl(QuestionService questionServices) {
        this.questionServices = questionServices;
    }

    @Override
    public Collection<Question> getQuestions(int amount) throws InvalidQuestionRequestException {
        Set<Question> questions = new HashSet<>();
        int size = questionServices.getSize();
        if (amount <= 0 || size < amount) {
            log.error("Ошибка,некорректное количество запросов!>" + size);
            throw new InvalidQuestionRequestException(amount, size);
        }
        while (questions.size() < amount) ;
        {
            questions.add(questionServices.getRandomQuestion());
        }
        log.info("Вопросы получены" + questions);

        return questions;
    }
}
