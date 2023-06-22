package controller.Categories;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import controller.Checkout.CartController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.MedtechPolo;
import model.NursingPolo;
import model.PsychologyPolo;
import model.TraditionalPants;
import model.TraditionalPolo;
import model.TraditionalSkirt;
import model.ReservationInfo;

public class ChoicepageController implements Initializable{

    private Stage stage;
    private Scene scene;
    private Parent root;

    // Global
    public static Parent cartRoot;

    FXMLLoader loader = null;
    
    public static CartController cartcontroller = null;

    public static int Itemcount = 0;

    public static TraditionalPolo TP = new TraditionalPolo();
    public static NursingPolo NP = new NursingPolo();
    public static PsychologyPolo PP = new PsychologyPolo();
    public static MedtechPolo MP  = new MedtechPolo();
    public static TraditionalPants TPants = new TraditionalPants();
    public static TraditionalSkirt TS = new TraditionalSkirt();

    public static ReservationInfo rv = new ReservationInfo();
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        TP.setProductName("Traditional Polo");

        NP.setProductName("Nursing Polo");

        PP.setProductName("Psychology Polo");

        MP.setProductName("Medtech Polo");

        TPants.setProductName("Traditional Pants");

        TS.setProductName("Traditional Skirt");

        

        
        try {
            loader = new FXMLLoader(getClass().getResource("/view/Cart.fxml"));
            cartRoot = loader.load();
        
        } catch (Exception e) {
            // TODO: handle exception
        }

            // Clears all items in Checkout.fxml
            cartcontroller = loader.getController();
            cartcontroller.VboxLeft.getChildren().removeAll(cartcontroller.VboxLeft.getChildren());
            cartcontroller.VboxRight.getChildren().removeAll(cartcontroller.VboxRight.getChildren());
        
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

    public void logout(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/Login.fxml")); 
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

    public void toCart(ActionEvent event)throws IOException{
        //root = FXMLLoader.load(getClass().getResource("/view/Cart.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(cartRoot);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public void toHome(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/homepage.fxml")); 
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


}
