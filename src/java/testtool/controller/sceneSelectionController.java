/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtontesttool;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 *
 * @author MKarlsson
 */
public class sceneSelectionController implements Initializable {
    
    @FXML private Label selectLabel;
    @FXML private Label selectLabelNbr;
    
    @FXML private RadioButton selectRadioButton1;
    @FXML private RadioButton selectRadioButton2;
    @FXML private RadioButton selectRadioButton3;
    @FXML private RadioButton selectRadioButton4;
    
    @FXML private Button btnNext;
    @FXML private Button btnPrev;
    
    
 
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectRadioButton1.setSelected(false);
        selectRadioButton1.setOnAction(e-> {
        if (selectRadioButton1.isSelected()){
            selectRadioButton2.setSelected(false);
            selectRadioButton3.setSelected(false);
            selectRadioButton4.setSelected(false);
        }
        });
        selectRadioButton2.setSelected(false);
        selectRadioButton2.setOnAction(e-> {
        if (selectRadioButton2.isSelected()){
            selectRadioButton1.setSelected(false);
            selectRadioButton3.setSelected(false);
            selectRadioButton4.setSelected(false);
        }    
        });
        
        selectRadioButton3.setSelected(false);
        selectRadioButton3.setOnAction(e-> { 
            if (selectRadioButton3.isSelected()){
                selectRadioButton1.setSelected(false);
                selectRadioButton2.setSelected(false);
                selectRadioButton4.setSelected(false);
        }
        });
        selectRadioButton4.setSelected(false);
        selectRadioButton4.setOnAction(e-> {
            if (selectRadioButton4.isSelected()){
                selectRadioButton1.setSelected(false);
                selectRadioButton2.setSelected(false);
                selectRadioButton3.setSelected(false);
                
        }
        });
        
        btnNext.setOnAction(e-> {
   
        });
        
        btnPrev.setOnAction(e-> {
            
        });
    }    
    
}
