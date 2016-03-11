/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package se.newton.testtool.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import se.newton.testtool.model.*;

/**
 * FXML Controller class
 *
 * @author HampusBolin
 */
public class CreateTestController implements Initializable {

    private ObservableList<Question> questionList;
    private ObservableList<Test> testList;
    private ObservableList<Answer> answerList;

    @FXML private TableView<Test> testView;
    @FXML private TableView<Question> questionView;
    @FXML private TableView<Answer> answerView;

    @FXML private TableColumn<Test, Integer> testId;
    @FXML private TableColumn<Test, String> testTitle;
    @FXML private TableColumn<Test, Integer> testOpenDate;
    @FXML private TableColumn<Test, Integer> testCloseDate;
    @FXML private TableColumn<Test, Integer> testScore;
    @FXML private TableColumn<Test, Integer> testGrade;
    @FXML private TableColumn<Test, Integer> testTimer;
    @FXML private TableColumn<Test, Integer> testShowAnswer;

    @FXML private TableColumn<Question, Integer> questionId;
    @FXML private TableColumn<Question, String> questionTitle;
    @FXML private TableColumn<Question, Integer> questionScore;
    //@FXML private TableColumn<Question, enum> questionCategory;

    @FXML private TableColumn<Answer, Integer> answerId;
    @FXML private TableColumn<Answer, String> answerAnswer;

    @FXML private TextField testFieldTitle;
    @FXML private TextField testFieldCloseDate;
    @FXML private TextField testFieldOpenDate;
    @FXML private TextField testFieldScore;
    @FXML private TextField testFieldGrade;
    @FXML private TextField testFieldTimer;
    @FXML private TextField questionFieldTitle;
    @FXML private TextField questionFieldScore;
    @FXML private TextField anserField;

    @FXML private Button btnSaveQuestion;
    @FXML private Button btnSaveAnswer;
    @FXML private Button btnSaveTest;

    /**+
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        testList = FXCollections.observableArrayList(
                new Test(1, "Test 1", 5, 6, 7, 8, 9, 0),
                new Test(2, "Test 2", 3, 3, 5, 7, 8, 1));
        
        questionList = FXCollections.observableArrayList(
                new Question(1, "Test", 3),
                new Question(2, "Teeeest", 4));
        
        answerList = FXCollections.observableArrayList(
                new Answer(1, "Answer"),
                new Answer(2, "Answeeer"));

        testId.setCellValueFactory(new PropertyValueFactory<Test, Integer>("testId"));
        testTitle.setCellValueFactory(new PropertyValueFactory<Test, String>("testTitle"));
        testOpenDate.setCellValueFactory(new PropertyValueFactory<Test, Integer>("testOpenDate"));
        testCloseDate.setCellValueFactory(new PropertyValueFactory<Test, Integer>("testCloseDate"));
        testScore.setCellValueFactory(new PropertyValueFactory<Test, Integer>("testScore"));
        testGrade.setCellValueFactory(new PropertyValueFactory<Test, Integer>("testGrade"));
        testTimer.setCellValueFactory(new PropertyValueFactory<Test, Integer>("testTimer"));
        testShowAnswer.setCellValueFactory(new PropertyValueFactory<Test, Integer>("testShowAnswer"));
        
        questionId.setCellValueFactory(new PropertyValueFactory<Question, Integer>("questionId"));
        questionTitle.setCellValueFactory(new PropertyValueFactory<Question, String>("questionTitle"));
        questionScore.setCellValueFactory(new PropertyValueFactory<Question, Integer>("questionScore"));
        
        answerId.setCellValueFactory(new PropertyValueFactory<Answer, Integer>("answerId"));
        answerAnswer.setCellValueFactory(new PropertyValueFactory<Answer, String>("answerAnswer));



        testView.setItems(testList);
        questionView.setItems(questionList);
        answerView.setItems(answerList);

        btnSaveQuestion.setOnAction(ev -> {

            Question q1 = new Question(1, "Question", 3);
            Question q2 = new Question(2, "Questionnnn", 4);
            questionList.add(q1);
            questionList.add(q2);

        });
                                                                                  
        btnSaveAnswer.setOnAction(ev -> {
            
            Answer a1 = new Answer(1, "Answer");
            Answer a2 = new Answer(2, "Answeeer");
            answerList.add(a1);
            answerList.add(a2);
            
        });

        btnSaveTest.setOnAction(ev -> {

            Test t1 = new Test(1, "Hej", 5, 5, 5, 5, 5, 5);
            Test t2 = new Test(2, "Hee", 6, 4, 3, 2, 1, 0);
            testList.add(t1);
            testList.add(t2);

        });
    }
}
