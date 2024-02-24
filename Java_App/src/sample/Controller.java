package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;


public class Controller {
    @FXML
    private Text myText;
    @FXML
    private Text Texttwo;
    @FXML
    private ImageView stella;
    @FXML
    private ImageView stellatwo;
    @FXML
    private ImageView stella11111;
    @FXML
    private ImageView stella11111111;
    @FXML
    private ImageView stella111111;
    @FXML
    private ImageView stella1111;
    @FXML
    private ImageView stella1;
    @FXML
    private ImageView stella111;
    @FXML
    private ImageView stella1111111;
    @FXML
    private ImageView stella1111111111;
    @FXML
    private ImageView stella11;
    @FXML
    private ImageView stella111111111;
    @FXML
    private ImageView chel;
    @FXML
    private Text newText;
    @FXML
    private Text frstQuestion;
    @FXML
    private Text twoQuest11111;
    @FXML
    private Text newText111111;
    @FXML
    private Button deleteButton;
    @FXML
    private Button deleteButtonTwo;
    @FXML
    private Button dalee2;
    @FXML
    private Button dalee4;
    @FXML
    private Button dalee6;
    @FXML
    private Button stoproc1111;
    @FXML
    private Button stoproc111111111;
    @FXML
    private Button stoproc11111111;
    @FXML
    private Button stoproc1111111;
    @FXML
    private Button dalee8;
    @FXML
    private Button dalee9;
    @FXML
    private RadioButton rButton;
    @FXML
    private RadioButton rButtontwo;
    @FXML
    private RadioButton rButtonthree;
    @FXML
    private RadioButton rButton1;
    @FXML
    private RadioButton rButton11;
    @FXML
    private RadioButton rButton111;
    @FXML
    private RadioButton rButton121;
    @FXML
    private RadioButton rButton1211;
    @FXML
    private RadioButton rButton12;
    @FXML
    private RadioButton rButton122;
    @FXML
    private RadioButton rButton1221;
    @FXML
    private RadioButton rButton12211;
    @FXML
    private RadioButton rButton1222;
    @FXML
    private RadioButton rButton12221;
    @FXML
    private RadioButton rButton122211;
    @FXML
    private RadioButton rButton122212;
    @FXML
    private RadioButton rButton1222121;
    @FXML
    private RadioButton rButton12221211;
    @FXML
    private RadioButton rButton1222122;
    @FXML
    private RadioButton rButton12221221;
    @FXML
    private RadioButton rButton122212211;
    @FXML
    private RadioButton rButton12221222;
    @FXML
    private RadioButton rButton122212221;
    @FXML
    private RadioButton rButton1222122211;
    @FXML
    private RadioButton rButton122212222;
    @FXML
    private RadioButton rButton1222122221;
    @FXML
    private RadioButton rButton12221222211;
    @FXML
    private RadioButton rButton1222122222;
    @FXML
    private RadioButton rButton12221222221;
    @FXML
    private RadioButton rButton122212222211;


    @FXML
    private Button dalee;
    @FXML
    private Button dalee1;
    @FXML
    private Button stoproc111;
    @FXML
    private Button stoproc1;
    @FXML
    private Button stoproc11;
    @FXML
    private Button stoproc;
    @FXML
    private Button dalee3;
    @FXML
    private Button stoproc11111;
    @FXML
    private Button dalee10;
    @FXML
    private Button dalee5;
    @FXML
    private Button stoproc111111;
    @FXML
    private Button dalee7;
    @FXML
    private Text twoQuest;
    @FXML
    private Text twoQuest111;
    @FXML
    private Text twoQuest1111111;
    @FXML
    private Text gg;
    @FXML
    private Text newText11111111;
    private Main testResult;
    @FXML
    private Text twoQuest111111;
    @FXML
    private Text newText1111111;
    @FXML
    private Text twoQuest111111111;
    @FXML
    private Text CurrentAnsw;
    @FXML
    private Text newText1111;
    @FXML
    private Text newText111;
    @FXML
    private Text twoQuest1;
    @FXML
    private Text twoQuest1111111111;
    @FXML
    private Text twoQuest11;
    @FXML
    private Text newText1;
    @FXML
    private Text newText11;
    @FXML
    private Text twoQuest1111;
    @FXML
    private Text newText11111;
    @FXML
    private Text twoQuest11111111;
    @FXML
    private Text newText111111111;
    @FXML
    private Text CurrentAnsw1;


    public void initialize() {
        testResult = new Main();
    }

    public void geography(ActionEvent actionEvent) {
        // удаление существующего текста и картинок
        myText.setVisible(false);
        Texttwo.setVisible(false);
        stella.setVisible(false);
        stellatwo.setVisible(false);
        deleteButton.setVisible(false);
        deleteButtonTwo.setVisible(false);

        // добавление нового текста
        newText.setVisible(true);
        frstQuestion.setVisible(true);
        rButton.setVisible(true);
        rButtontwo.setVisible(true);
        rButtonthree.setVisible(true);
        dalee.setVisible(true);
        chel.setVisible(true);
        stoproc.setVisible(true);

    }

    public void dalee(ActionEvent actionEvent) {

        // удаление существующего текста и картинок
        newText.setVisible(false);
        frstQuestion.setVisible(false);
        rButton.setVisible(false);
        rButtontwo.setVisible(false);
        rButtonthree.setVisible(false);
        stella1.setVisible(false);
        stoproc.setVisible(false);

        // Сохраняем выбранный вариант ответа
        if (rButton.isSelected()) {
            testResult.addAnswer(true); // Правильный ответ
        } else {
            testResult.addAnswer(false); // Неправильный ответ
        }

        // добавление нового текста
        twoQuest.setVisible(true);
        newText1.setVisible(true);
        rButton1.setVisible(true);
        rButton11.setVisible(true);
        rButton111.setVisible(true);
        dalee1.setVisible(true);
        stoproc1.setVisible(true);


    }

    public void dalee1(ActionEvent actionEvent) {
        // удаление существующего текста и картинок
        twoQuest.setVisible(false);
        newText1.setVisible(false);
        rButton1.setVisible(false);
        rButton11.setVisible(false);
        rButton111.setVisible(false);
        stoproc1.setVisible(false);
        stella11.setVisible(false);

        // Сохраняем выбранный вариант ответа
        if (rButton1.isSelected()) {
            testResult.addAnswer(true); // Правильный ответ
        } else {
            testResult.addAnswer(false); // Неправильный ответ
        }

        // добавление нового текста
        twoQuest1.setVisible(true);
        newText11.setVisible(true);
        rButton12.setVisible(true);
        rButton121.setVisible(true);
        rButton1211.setVisible(true);
        dalee2.setVisible(true);
        stoproc11.setVisible(true);

    }

    public void dalee2(ActionEvent actionEvent) {
        // удаление существующего текста и картинок
        twoQuest1.setVisible(false);
        newText11.setVisible(false);
        rButton12.setVisible(false);
        rButton121.setVisible(false);
        rButton1211.setVisible(false);
        stella111.setVisible(false);
        stoproc11.setVisible(false);

        if (rButton12.isSelected()) {
            testResult.addAnswer(true); // Правильный ответ
        } else {
            testResult.addAnswer(false); // Неправильный ответ
        }

        // добавление нового текста
        twoQuest11.setVisible(true);
        rButton122.setVisible(true);
        rButton12211.setVisible(true);
        rButton1221.setVisible(true);
        newText111.setVisible(true);
        dalee3.setVisible(true);
        stoproc111.setVisible(true);


    }

    public void dalee3(ActionEvent actionEvent) {
        // удаление существующего текста и картинок
        twoQuest11.setVisible(false);
        rButton122.setVisible(false);
        rButton12211.setVisible(false);
        rButton1221.setVisible(false);
        newText111.setVisible(false);
        stoproc111.setVisible(false);
        stella1111.setVisible(false);


        if (rButton122.isSelected()) {
            testResult.addAnswer(true); // Правильный ответ
        } else {
            testResult.addAnswer(false); // Неправильный ответ
        }

        // добавление нового текста
        twoQuest111.setVisible(true);
        newText1111.setVisible(true);
        rButton12221.setVisible(true);
        rButton1222.setVisible(true);
        rButton122211.setVisible(true);
        dalee4.setVisible(true);
        stoproc1111.setVisible(true);
    }

    public void dalee4(ActionEvent actionEvent) {
        // удаление существующего текста и картинок
        twoQuest111.setVisible(false);
        newText1111.setVisible(false);
        rButton12221.setVisible(false);
        rButton1222.setVisible(false);
        rButton122211.setVisible(false);
        dalee4.setVisible(false);
        chel.setVisible(false);
        stoproc1111.setVisible(false);
        stella11111.setVisible(false);

        if (rButton12221.isSelected()) {
            testResult.addAnswer(true); // Правильный ответ
        } else {
            testResult.addAnswer(false); // Неправильный ответ
        }
        twoQuest111111111.setVisible(true);
        twoQuest1111111111.setVisible(true);
        gg.setVisible(true);
        dalee10.setVisible(true);

        CurrentAnsw.setVisible(true);
        CurrentAnsw1.setVisible(true);

        int correctAnswersCount = testResult.getCorrectAnswersCount();
        CurrentAnsw.setText(String.valueOf(correctAnswersCount));
        // Получение результатов
        int score = testResult.getCorrectAnswersCount(); // Получаем количество правильных ответов

        // Вывод сообщения в зависимости от количества баллов
        if (score >= 0 && score <= 2) {
            CurrentAnsw1.setText("Вы очень плохо написали тест");
        } else if (score >= 3 && score <= 4) {
            CurrentAnsw1.setText("Вы хорошо написали тест");
        } else if (score == 5) {
            CurrentAnsw1.setText("Вы отлично написали тест");
        } else {
            CurrentAnsw1.setText("Некорректный результат");
        }

    }


    public void biology(ActionEvent actionEvent) {
        // удаление существующего текста и картинок
        myText.setVisible(false);
        Texttwo.setVisible(false);
        stella.setVisible(false);
        stellatwo.setVisible(false);
        deleteButton.setVisible(false);
        deleteButtonTwo.setVisible(false);

        // добавление нового текста
        twoQuest1111.setVisible(true);
        newText11111.setVisible(true);
        rButton122212.setVisible(true);
        rButton1222121.setVisible(true);
        rButton12221211.setVisible(true);
        dalee5.setVisible(true);
        chel.setVisible(true);
        stoproc11111.setVisible(true);


    }

    public void dalee5(ActionEvent actionEvent) {
        // удаление существующего текста и картинок
        twoQuest1111.setVisible(false);
        newText11111.setVisible(false);
        rButton122212.setVisible(false);
        rButton1222121.setVisible(false);
        rButton12221211.setVisible(false);
        dalee5.setVisible(false);
        stoproc11111.setVisible(false);
        stella111111.setVisible(false);


        if (rButton122212.isSelected()) {
            testResult.addAnswer(true); // Правильный ответ
        } else {
            testResult.addAnswer(false); // Неправильный ответ
        }

        // добавление нового текста
        twoQuest11111.setVisible(true);
        newText111111.setVisible(true);
        rButton1222122.setVisible(true);
        rButton12221221.setVisible(true);
        rButton122212211.setVisible(true);
        dalee6.setVisible(true);
        stoproc111111.setVisible(true);
    }

    public void dalee6(ActionEvent actionEvent) {
        // удаление существующего текста и картинок
        twoQuest11111.setVisible(false);
        newText111111.setVisible(false);
        rButton1222122.setVisible(false);
        rButton12221221.setVisible(false);
        rButton122212211.setVisible(false);
        dalee6.setVisible(false);
        stoproc111111.setVisible(false);
        stella1111111.setVisible(false);
        if (rButton1222122.isSelected()) {
            testResult.addAnswer(true); // Правильный ответ
        } else {
            testResult.addAnswer(false); // Неправильный ответ
        }
        // добавление нового текста
        twoQuest111111.setVisible(true);
        newText1111111.setVisible(true);
        rButton12221222.setVisible(true);
        rButton122212221.setVisible(true);
        rButton1222122211.setVisible(true);
        dalee7.setVisible(true);
        stoproc1111111.setVisible(true);
    }

    public void dalee7(ActionEvent actionEvent) {
        // удаление существующего текста и картинок
        twoQuest111111.setVisible(false);
        newText1111111.setVisible(false);
        rButton12221222.setVisible(false);
        rButton122212221.setVisible(false);
        rButton1222122211.setVisible(false);
        dalee7.setVisible(false);
        stoproc1111111.setVisible(false);
        stella11111111.setVisible(false);
        if (rButton12221222.isSelected()) {
            testResult.addAnswer(true); // Правильный ответ
        } else {
            testResult.addAnswer(false); // Неправильный ответ
        }
        // добавление нового текста
        twoQuest1111111.setVisible(true);
        newText11111111.setVisible(true);
        rButton122212222.setVisible(true);
        rButton1222122221.setVisible(true);
        rButton12221222211.setVisible(true);
        dalee8.setVisible(true);
        stoproc11111111.setVisible(true);
    }

    public void dalee8(ActionEvent actionEvent) {
        // удаление существующего текста и картинок
        twoQuest1111111.setVisible(false);
        newText11111111.setVisible(false);
        rButton122212222.setVisible(false);
        rButton1222122221.setVisible(false);
        rButton12221222211.setVisible(false);
        dalee8.setVisible(false);
        stoproc11111111.setVisible(false);
        stella111111111.setVisible(false);
        if (rButton122212222.isSelected()) {
            testResult.addAnswer(true); // Правильный ответ
        } else {
            testResult.addAnswer(false); // Неправильный ответ
        }
        // добавление нового текста
        twoQuest11111111.setVisible(true);
        newText111111111.setVisible(true);
        rButton1222122222.setVisible(true);
        rButton12221222221.setVisible(true);
        rButton122212222211.setVisible(true);
        dalee9.setVisible(true);
        stoproc111111111.setVisible(true);

    }

    public void dalee9(ActionEvent actionEvent) {
        // удаление существующего текста и картинок
        twoQuest11111111.setVisible(false);
        newText111111111.setVisible(false);
        rButton1222122222.setVisible(false);
        rButton12221222221.setVisible(false);
        rButton122212222211.setVisible(false);
        dalee9.setVisible(false);
        chel.setVisible(false);
        stoproc111111111.setVisible(false);
        stella1111111111.setVisible(false);
        if (rButton1222122222.isSelected()) {
            testResult.addAnswer(true); // Правильный ответ
        } else {
            testResult.addAnswer(false); // Неправильный ответ
        }
        // добавление нового текста
        twoQuest111111111.setVisible(true);
        twoQuest1111111111.setVisible(true);
        gg.setVisible(true);
        CurrentAnsw.setVisible(true);
        dalee10.setVisible(true);
        CurrentAnsw1.setVisible(true);

        int correctAnswersCount = testResult.getCorrectAnswersCount();
        CurrentAnsw.setText(String.valueOf(correctAnswersCount));


        int score = testResult.getCorrectAnswersCount(); // Получаем количество правильных ответов

        // Вывод сообщения в зависимости от количества баллов
        if (score >= 0 && score <= 2) {
            CurrentAnsw1.setText("Вы очень плохо написали тест");
        } else if (score >= 3 && score <= 4) {
            CurrentAnsw1.setText("Вы хорошо написали тест");
        } else if (score == 5) {
            CurrentAnsw1.setText("Вы отлично написали тест");
        } else {
            CurrentAnsw1.setText("Некорректный результат");
        }

    }

    public void dalee10(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void stoproc(ActionEvent actionEvent) {

        stella1.setVisible(true);
    }

    public void stoproc1(ActionEvent actionEvent) {
        stella11.setVisible(true);
    }

    public void stoproc11(ActionEvent actionEvent) {
        stella111.setVisible(true);
    }

    public void stoproc111(ActionEvent actionEvent) {
        stella1111.setVisible(true);
    }

    public void stoproc1111(ActionEvent actionEvent) {
        stella11111.setVisible(true);
    }

    public void stoproc11111(ActionEvent actionEvent) {
        stella111111.setVisible(true);
    }

    public void stoproc111111(ActionEvent actionEvent) {
        stella1111111.setVisible(true);
    }

    public void stoproc1111111(ActionEvent actionEvent) {
        stella11111111.setVisible(true);
    }

    public void stoproc11111111(ActionEvent actionEvent) {
        stella111111111.setVisible(true);
    }

    public void stoproc111111111(ActionEvent actionEvent) {
        stella1111111111.setVisible(true);
    }


}

