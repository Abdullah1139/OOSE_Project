import Controllers.StudentController;
import javafx.application.Application;
import static javafx.application.Application.launch;
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
   FXMLLoader loader = new FXMLLoader(getClass().getResource("UI/MainGUI.fxml"));
        Parent root = loader.load();

        StudentController controller = loader.getController();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("University Admission System");
        stage.show();
    }
    }
    

