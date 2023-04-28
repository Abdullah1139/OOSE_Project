import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class FXMLController implements Initializable {
    public void LoginBtn(ActionEvent actionEvent) {
    try {
        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DashBoard.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DashBoard.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RegForm.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainGUI.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("profile.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Apply.fxml"));
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