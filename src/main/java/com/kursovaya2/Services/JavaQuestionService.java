package com.kursovaya2.Services;

import com.kursovaya2.Essence.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private final Set<Question> questionSet = new HashSet<>();

    private Random random = new Random();

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public boolean add(String question, String answer) {
        return questionSet.add(new Question(question, answer));
    }

    @Override
    public boolean remove(String question, String answer) {
        return questionSet.remove(new Question(question, answer));
    }

    @Override
    public Collection<Question> getAll() {
        return Set.copyOf(questionSet);
    }

    @Override
    public Question getRandomQuestion() {
        return List.copyOf(questionSet).get(random.nextInt(questionSet.size()));
    }

    @Override
    public int getSize() {
        return questionSet.size();
    }
}
