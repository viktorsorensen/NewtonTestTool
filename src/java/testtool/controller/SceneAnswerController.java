/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtontesttool;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author MKarlsson
 */
public class SceneAnswerController implements Initializable {

    @FXML Label answerLabel;
    @FXML Label answerLabelNbr;
    
    @FXML TextArea answerTextArea;
    
    @FXML Button btnPrev;
    @FXML Button btnNext;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        btnNext.setOnAction(e-> {
   
        });
        
        btnPrev.setOnAction(e-> {
            
        });
    }    
    
}     

