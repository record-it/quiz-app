package sda.pl.arpjavapl5.quizapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sda.pl.arpjavapl5.quizapp.entity.Quiz;
import sda.pl.arpjavapl5.quizapp.repository.QuizRepository;

@SpringBootApplication
public class QuizAppApplication implements CommandLineRunner {
    final QuizRepository quizRepository;

    public QuizAppApplication(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(QuizAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        quizRepository.save(
//                Quiz.builder()
//                        .correctAnswer("Java")
//                        .incorrectAnswer1("C#")
//                        .incorrectAnswer2("Haskell")
//                        .incorrectAnswer3("JavaScript")
//                        .question("Który z języków wymaga JVM?")
//                        .build()
//        );
//        quizRepository.save(
//                Quiz.builder()
//                        .correctAnswer("Spring")
//                        .incorrectAnswer1("Express")
//                        .incorrectAnswer2("")
//                        .incorrectAnswer3("JavaScript")
//                        .question("Który z frameworków pracuje w Java?")
//                        .build()
//        );
//        quizRepository.save(
//                Quiz.builder()
//                        .correctAnswer("1993")
//                        .incorrectAnswer1("2001")
//                        .incorrectAnswer2("2005")
//                        .incorrectAnswer3("1996")
//                        .question("Kiedy powstała Java?")
//                        .build()
//        );
    }
}
