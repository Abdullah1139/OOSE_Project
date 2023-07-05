/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Abdullah
 */
public class LoginController {
    @FXML
    private Label selectedFileLabel;

    @FXML
    private ProgressBar progressBar;
    
    @FXML
    private void handleBrowseButtonAction() {
        FileChooser fileChooser = new FileChooser();
        // Set any file chooser properties if needed
        // Show the file chooser dialog
        // Retrieve the selected file and update the selectedFileLabel
    }
    

}
