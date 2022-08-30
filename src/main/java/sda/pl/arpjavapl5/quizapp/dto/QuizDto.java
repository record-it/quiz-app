package sda.pl.arpjavapl5.quizapp.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class QuizDto {
    private long id;
    private List<String> incorrectAnswers;
    private String correctAnswer;
}
