package controller.AccountControllers;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable{

    @FXML
    private ChoiceBox<String> choiceBOX;

    @FXML
    TextField email;

    @FXML
    PasswordField password;

    @FXML
    Button loginBtn;
    AlertMaker alert = new AlertMaker();

    private String[] branch = {"NU Manila", "NU MOA", "NU Fairview", "NU Laguna", "NU Lipa", "NU Baliwag", "NU Dasmariñas", "NU Clark"};
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String choice;

     @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceBOX.getItems().addAll(branch);
        choiceBOX.getStyleClass().add("choiceBOX");
        choiceBOX.setOnAction(this::getChoice);
    }

    public void getChoice(ActionEvent event){
        choice = choiceBOX.getValue();
    }

    public void forgotPass(ActionEvent event){
        alert.showSimpleAlert("Forgot Password", "Calm down, Try to remember your password");
    }

    String uname;
    String pword;
    public void login(ActionEvent event) throws IOException {
        uname = email.getText();
        pword = password.getText();
        choice = choiceBOX.getValue();
        boolean isValid = validateLogin();
        
        if (uname.isEmpty() || pword.isEmpty() || choice == null) {
            AlertMaker.showSimpleAlert("LOGIN", "Please fill in all fields.");
            return;
        }
        
        if (isValid) {
        root = FXMLLoader.load(getClass().getResource("/view/choicepage.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        } else {
            AlertMaker.showSimpleAlert("LOGIN", "Login unsuccessful, Check your password or email.");
            email.clear();
            password.clear();
        }
    }
    

    public  boolean validateLogin() {
       for (int i = 0; i < RegisterController.Emails.size(); i++) {
         String username = RegisterController.Emails.get(i);
         String password = RegisterController.Passwords.get(i);
        
        if (Objects.equals(uname, username) && Objects.equals(pword, password)) {
            return true; 
        }
    }
    return false; 
}
    
    
    public void toRegister(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/Register.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

}
