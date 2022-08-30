package sda.pl.arpjavapl5.quizapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.pl.arpjavapl5.quizapp.dto.QuizDto;
import sda.pl.arpjavapl5.quizapp.entity.Quiz;
import sda.pl.arpjavapl5.quizapp.repository.QuizRepository;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class QuizService {

    private final static Random random = new Random();
    private final QuizRepository quizRepository;

    @Autowired
    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public QuizDto randomQuiz() {
        final List<Quiz> all = quizRepository.findAll();
        final Quiz quiz = all.get(random.nextInt(all.size()));
        return QuizDto.builder()
                .correctAnswer(quiz.getCorrectAnswer())
                .incorrectAnswers(
                        Stream.of(
                                quiz.getIncorrectAnswer1(),
                                quiz.getIncorrectAnswer2(),
                                quiz.getIncorrectAnswer3()
                        ).collect(Collectors.toList())
                )
                .id(quiz.getId())
                .build();
    }
}
