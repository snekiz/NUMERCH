package controller.AccountControllers;

import java.io.IOException;
import java.util.ArrayList;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class RegisterController {
   @FXML
   TextField email, idnum, studentName;

   @FXML
   Button registerbtn;

   @FXML
   PasswordField password;
   
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String tempemail;
    private String temppass; 

    static ArrayList<String> Emails = new ArrayList<>();
    static ArrayList<String> Passwords = new ArrayList<>();



    public void idInputChecker() {
        // Restrict input to numbers
        idnum.addEventFilter(KeyEvent.KEY_TYPED, event -> {
            if (!"-0123456789".contains(event.getCharacter())) {
                event.consume();
            }
        });

        // Restrict input length to 15 characters
        TextFormatter<String> textFormatter = new TextFormatter<>(change -> {
            if (change.getControlNewText().length() <= 15) {
                return change;
            }
            return null;
        });
        idnum.setTextFormatter(textFormatter);
    }

    public void register(ActionEvent event) throws IOException {
        Button sourceButton = (Button) event.getSource();
        tempemail = email.getText();
        temppass = password.getText();
        String ID = idnum.getText(); 
        String studentname = studentName.getText(); 
        boolean isUsernameValid = UsernameChecker();
        boolean isPasswordValid = PasswordChecker();
           //checks if all the fields are filled up
        if (tempemail.isEmpty() || temppass.isEmpty() || ID.isEmpty() || studentname.isEmpty()) {
            AlertMaker.showSimpleAlert("REGISTER", "Please fill in all fields.");
            return;
        }
           
        if (sourceButton.equals(registerbtn)) {
             if (isUsernameValid && isPasswordValid) {
            Emails.add(tempemail);
            Passwords.add(temppass);
            AlertMaker.showSimpleAlert("REGISTER", "Account created!");
            root = FXMLLoader.load(getClass().getResource("/view/Login.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        }
        }
        System.out.println("Accounts: " + Emails + Passwords);
    }
    

    public boolean UsernameChecker() {
        for (String compUsername : Emails) {
            if (tempemail.equals(compUsername)) {
                AlertMaker.showSimpleAlert("REGISTER", "Email already taken!");
                System.out.println("Username already taken");
                email.clear();
                return false; 
            }
        }
        return true; 
    }
    
    public boolean PasswordChecker() {

        if(temppass.isEmpty()){
           AlertMaker.showSimpleAlert("REGISTER", "Please enter your name.");
           return false;
        }
        if (temppass.length() < 5) {
            AlertMaker.showSimpleAlert("REGISTER", "Password too short");
            System.out.println("Password too short");
            password.clear();
            return false; 
        }
        return true; 
    }
    
    public void toLogin(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/Login.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
  }

