package controller.Categories;

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

public class PantsController implements Initializable{
    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
    public void TPants(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/TradPantsCO.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void toPolo(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/Polo.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void toSkirts(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/Skirts.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
     
    
    public void toWIP(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/Notavailable.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    public void toHome(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/choicepage.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
    
    public void logout(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/Login.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void toNotif(ActionEvent event)throws IOException{
         root = FXMLLoader.load(getClass().getResource("/view/notif.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void toHelp(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/help.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void toCart(ActionEvent event)throws IOException{
        ChoicepageController.cartcontroller.setValues();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(ChoicepageController.cartRoot);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void toTourPants(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/ToupantsOS.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void toCahpants(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/CahpantsOS.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
