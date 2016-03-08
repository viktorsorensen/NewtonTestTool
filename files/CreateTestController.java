    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.newton.testtool.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import se.newton.testtool.model.*;

/**
 * FXML Controller class
 *
 * @author HampusBolin
 */
public class CreateTestController implements Initializable {
    
    @FXML private ObservableList<Question> questionList;
    @FXML private ObservableList<Test> testList;
    @FXML private ObservableList<Answer> answerList;
    
    @FXML private TableColumn<Test, Integer> testId;
    @FXML private TableColumn<Test, String> testTitle;
    @FXML private TableColumn<Test, Integer> testOpenDate;
    @FXML private TableColumn<Test, Integer> testCloseDate;
    @FXML private TableColumn<Test, Integer> testScore;
    @FXML private TableColumn<Test, Integer> testGrade;
    @FXML private TableColumn<Test, Integer> testTimer;
    @FXML private TableColumn<Test, boolean> testShowAnswer;
    
    @FXML private TableColumn<Question, Integer> questionId;
    @FXML private TableColumn<Question, String> questionTitle;
    @FXML private TableColumn<Question, Integer> questionScore; 
    @FXML private TableColumn<Question, enum> questionCategory;
    
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
    @FXML private TextField testShowAnswer;
    @FXML private Button btnSaveQuestion;
    @FXML private Button btnSaveAnswer;
    @FXML private Button btnSaveTest;
    
        /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    
    
}
