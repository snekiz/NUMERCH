package controller;
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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.text.Text;



public class LoginController implements Initializable{
    @FXML
    TextField username;

    @FXML
    Text redflag;

    @FXML
    PasswordField password;

    @FXML
    private ChoiceBox<String> userChoicebox;

    @FXML
    Button loginButton;

    private String[] user = {"Admin", "Student"};

    private Stage stage;
    private Scene scene;
    private Parent root;
    private String choice;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    
        userChoicebox.getItems().addAll(user);
        userChoicebox.setOnAction(this::getChoice);
       
    }

    public void getChoice(ActionEvent event){
         choice = userChoicebox.getValue();
         redflag.setVisible(false);
         username.clear();
         password.clear();
        if(choice.equals("Admin")){
            System.out.println("Admin ang pinili");
        }else if(choice.equals("Student")){
            System.out.println("Student and pinli");
        }else{
           System.out.println("error");
        }
     }
     
     public void switchtologin(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/login.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void switchtoregister(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/register.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
     
    public void login(ActionEvent event) throws IOException {
        
        String uname = username.getText();
        String pword = password.getText();

        if (choice.equals("Admin")){
            if(uname.equals("admin") && pword.equals("pkkr")){
            System.out.println("tama");
            root = FXMLLoader.load(getClass().getResource("/view/AdminInterface.fxml")); 
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setFullScreen(true);
            stage.setScene(scene);
            stage.show();
            }else{
               redflag.setVisible(true);
            }

        }else{
            if(choice.equals("Student")){
                if(uname.equals("kurt") && pword.equals("krazy123")){
                    System.out.println("tama");
                    root = FXMLLoader.load(getClass().getResource("/view/AdminInterface.fxml")); 
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setFullScreen(true);
                    stage.setScene(scene);
                    stage.show();
                }else{
              redflag.setVisible(true);  
           }  
      }
    } 
}
}