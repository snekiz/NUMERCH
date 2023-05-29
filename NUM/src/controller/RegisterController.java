package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class RegisterController {
    @FXML
    Button registerbtn, loginbtn;



    private Stage stage;
    private Scene scene;
    private Parent root;


    public void switchtologin(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/login.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
