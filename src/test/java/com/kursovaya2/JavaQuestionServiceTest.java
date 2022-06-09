package com.kursovaya2;

import com.kursovaya2.Services.JavaQuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Random;

import static com.kursovaya2.Constants.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceTest {
    private final JavaQuestionService out = new JavaQuestionService();

    @Test
    void shouldAddQuestion() {
        out.add(QUESTION1, ANSWER1);
        assertTrue(out.getAll().contains(FULL_QUESTION1));
    }

    @Test
    void remove() {
        out.remove(QUESTION1, ANSWER1);
        assertFalse(out.getAll().contains(FULL_QUESTION1));
    }

    @Test
    void getAll() {
        out.add(QUESTION1, ANSWER1);
        out.add(QUESTION2, ANSWER2);
        out.add(QUESTION3, ANSWER3);
        out.add(QUESTION4, ANSWER4);
        out.add(QUESTION5, ANSWER5);
        assertTrue(out.getAll().contains(List.of(FULL_QUESTION1, FULL_QUESTION2, FULL_QUESTION3, FULL_QUESTION4, FULL_QUESTION5)));

    }

    @Test
    void getRandomQuestion() {
        out.add(QUESTION1, ANSWER1);
        Random random = mock(Random.class, withSettings().withoutAnnotations());
        when(random.nextInt(anyInt())).thenReturn(0);
        out.setRandom(random);
        assertEquals(FULL_QUESTION1, out.getRandomQuestion());
    }
}

