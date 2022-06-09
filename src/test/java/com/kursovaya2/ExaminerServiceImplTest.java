package com.kursovaya2;

import com.kursovaya2.Services.ExaminerServiceImpl;
import com.kursovaya2.Services.QuestionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.kursovaya2.Constants.FULL_QUESTION1;
import static com.kursovaya2.Constants.TEST_QUESTIONS_SET_2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {
    @Mock
    QuestionService mock;
    @InjectMocks
    ExaminerServiceImpl out;

    @Test
    public void getQuestionTest() {
        when(mock.getSize()).thenReturn(1);
        when(mock.getRandomQuestion()).thenReturn(FULL_QUESTION1);
        assertEquals(TEST_QUESTIONS_SET_2, out.getQuestions(1));
    }

}
