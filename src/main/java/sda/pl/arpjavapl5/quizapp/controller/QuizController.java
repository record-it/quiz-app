package sda.pl.arpjavapl5.quizapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sda.pl.arpjavapl5.quizapp.dto.QuizDto;
import sda.pl.arpjavapl5.quizapp.service.QuizService;

@RestController
public class QuizController {

    private final QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/quiz/random")
    public ResponseEntity<QuizDto> randomQuiz(){
        final QuizDto quizDto = quizService.randomQuiz();
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(quizDto);
    }

    @GetMapping("/")
    public String test(){
        return "TEST";
    }
}
