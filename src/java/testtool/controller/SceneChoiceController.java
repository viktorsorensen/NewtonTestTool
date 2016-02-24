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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author MKarlsson
 */
public class SceneChoiceController implements Initializable {

    @FXML private Label choiceLabel;
    @FXML private Label choiceLabelNbr;
    
    @FXML private CheckBox choiceBox1;
    @FXML private CheckBox choiceBox2;
    @FXML private CheckBox choiceBox3;
    @FXML private CheckBox choiceBox4;
    
    @FXML private Button btnPrev;
    @FXML private Button btnNext;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        choiceBox1.setSelected(false);
        choiceBox2.setSelected(false);
        choiceBox3.setSelected(false);
        choiceBox4.setSelected(false);
        
     btnNext.setOnAction(e-> {
   
        });
        
        btnPrev.setOnAction(e-> {
            
        });
    }    
    
}
