package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    private List<Boolean> answers = new ArrayList<>(); // Список выбранных ответов
    private int correctAnswers = 0; // Количество правильных ответов


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("st.fxml"));
        primaryStage.setTitle("School Tests");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void addAnswer(boolean isCorrect) {
        answers.add(isCorrect);
        if (isCorrect) {
            correctAnswers++;
        }


    }
    public int getCorrectAnswersCount() {
        return correctAnswers;
    }
}
