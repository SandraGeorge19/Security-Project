/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Security;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import security_project.*;

/**
 *
 * @author ELFAROUQ
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
      @FXML
    private TextField textF;
    @FXML
    private void handleButtonAction(MouseEvent event) {
        System.out.println("You clicked me!");
        label.setText("iam search button");
    }
    @FXML
    
     private void handleButtonAction2(MouseEvent event) {
       Patient a=new Patient();
       a.deletePatient(Integer.parseInt(textF.getText().toString()));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
