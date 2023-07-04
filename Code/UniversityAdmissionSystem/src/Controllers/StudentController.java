package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
public class StudentController implements Initializable {
    
    
    
    public void LoginBtn(ActionEvent actionEvent) {
    try {
        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/UI/DashBoard.fxml"));
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
    
    public void adBtn(ActionEvent actionEvent) {
    try {
        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/UI/aLogin.fxml"));
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
        public void logout(ActionEvent actionEvent) {
    try {
        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/UI/MainGUI.fxml"));
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
        
    public void profileBtn(ActionEvent actionEvent) {
    try {
        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/UI/profile.fxml"));
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

public void applyBtn(ActionEvent actionEvent) {
    try {
        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/UI/Apply.fxml"));
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
    public void aBtn(ActionEvent actionEvent) {
    try {
        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/UI/aDashBoard.fxml"));
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
        public void updateBtn(ActionEvent actionEvent) {
    try {
        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/UI/Update.fxml"));
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
