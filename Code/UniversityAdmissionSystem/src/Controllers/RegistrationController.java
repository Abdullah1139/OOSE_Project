package Controllers;

import DAL.Registration;
import dto.RegistrationDTO;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.*;



public class RegistrationController implements Initializable {

    @FXML
    private DatePicker Date_of_Birth;

    @FXML
    private TextField address;

    @FXML
    private TextField email;

    @FXML
    private TextField first_name;

    @FXML
    private TextField last_name;

    @FXML
    private PasswordField password;

    @FXML
    private TextField phone_number;
    

 @FXML
public void submitRegistration(ActionEvent actionEvent) {
    // Retrieve the registration details from the form
    String firstName = first_name.getText();
    String lastName = last_name.getText();
    String emailValue = email.getText();
    String phoneNumber = phone_number.getText();
    String addressValue = address.getText();
    LocalDate dateOfBirth = Date_of_Birth.getValue();
    String passwordValue = password.getText();

    RegistrationDTO registrationDTO = new RegistrationDTO(firstName, lastName, emailValue, phoneNumber, addressValue, dateOfBirth, passwordValue);

    
    Registration.saveRegistration(registrationDTO);
  
}

    public void RegBtn(ActionEvent actionEvent) {
        try {
            // Load the FXML file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/UI/RegForm.fxml"));
            Parent root = fxmlLoader.load();

            // Create a new scene with the loaded FXML file
            Scene scene = new Scene(root);

            // Get the stage information
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stBtn(ActionEvent actionEvent) {
        try {
            // Load the FXML file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/UI/Login.fxml"));
            Parent root = fxmlLoader.load();

            // Create a new scene with the loaded FXML file
            Scene scene = new Scene(root);

            // Get the stage information
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
