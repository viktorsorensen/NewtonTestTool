package se.newton.testtool.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.util.Callback;

import javax.ws.rs.core.GenericType;

import se.newton.testtool.app.*;
import se.newton.testtool.model.*;

public class ActionController implements Initializable {

    @FXML
    private ComboBox<?> typeBox;
    @FXML
    private Button btnOk;

    QuestionManager qm;
    List<Question> questions;

    ObservableList<Test> testList = FXCollections.observableArrayList(
            new Test("Test1 "),
            new Test("Test2 "),
            new Test("Test3 ")
    );

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnOk.setOnAction(ev -> {

            // make a GET request to webservice to get a list of questions
            GenericType<List<Question>> collectionType = new GenericType<List<Question>>() {
            };
            questions = Util.GetRequest("/questions", collectionType);

            // assign to QuestionManager to handle the question
            TestToolApp.qManager = new QuestionManager(questions);
            qm = TestToolApp.qManager;

            // switch to a specifik scene base om the first question
            Util.switchScene(ev, getClass().getResource(Util.getQuestionScene(qm.getCurrentQuestion().getCategory())));
        });
    }

    public void start(Stage primaryStage) {

        final ComboBox typeBox = new ComboBox(testList);
        typeBox.getSelectionModel().selectFirst();

        typeBox.setCellFactory(new Callback<ListView<Test>, ListCell<Test>>() {

            @Override
            public ListCell<Test> call(ListView<Test> p) {

                final ListCell<Test> cell = new ListCell<Test>() {

                };

                return cell;
            }
        });

    }
}
