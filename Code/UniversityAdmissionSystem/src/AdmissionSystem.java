import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Abdullah
 */
public class AdmissionSystem extends Application {
    

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
   FXMLLoader loader = new FXMLLoader(getClass().getResource("MainGUI.fxml"));
        Parent root = loader.load();

        FXMLController controller = loader.getController();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    }
    

