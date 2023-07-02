package Controllers;

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

    // Insert the registration details into the database
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:1139/AdmissionSystem", "UAS", "uas")) {
        String query = "INSERT INTO registration (first_name, last_name, email, phone_number, address, date_of_birth, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, registrationDTO.getFirstName());
        statement.setString(2, registrationDTO.getLastName());
        statement.setString(3, registrationDTO.getEmail());
        statement.setString(4, registrationDTO.getPhoneNumber());
        statement.setString(5, registrationDTO.getAddress());
        statement.setDate(6, java.sql.Date.valueOf(registrationDTO.getDateOfBirth()));
        statement.setString(7, registrationDTO.getPassword());
        statement.executeUpdate();

        // Display success message
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Registration Successful");
        alert.setContentText("Registration details have been saved.");
        alert.showAndWait();
    } catch (SQLException e) {
        e.printStackTrace();
        // Display error message
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("An error occurred while saving the registration details.");
        alert.showAndWait();
    }
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
