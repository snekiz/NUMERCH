import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage stage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/homepage.fxml"));
            Scene scene = new Scene(root);
            stage.getIcons().add(new Image("/images/ProductIMG/NUM logo.png"));
            stage.setResizable(false);
            stage.setTitle("NU MERCHANDISE");
            scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
