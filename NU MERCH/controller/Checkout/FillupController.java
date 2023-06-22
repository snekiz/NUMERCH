package controller.Checkout;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
import controller.Categories.ChoicepageController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.CustomerInfo;

public class FillupController implements Initializable{
    @FXML
    TextField fullname, contact, addH, addC, addR, addPro, addPo, addSt;

    @FXML
    RadioButton rButton1, rButton2;

    AlertMaker alert = new AlertMaker();
    private Stage stage;
    private Scene scene;
    private Parent root;

    public static Parent receiptRoot;

    FXMLLoader loader = null;
    
    public static ReceiptController receiptcontroller = null;

    public static CustomerInfo ci = new CustomerInfo();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       

         try {
            loader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
            receiptRoot = loader.load();
        
        } catch (Exception e) {
            // TODO: handle exception
        }

            // Clears all items in Checkout.fxml
            receiptcontroller = loader.getController();
            receiptcontroller.receiptVbox.getChildren().removeAll(receiptcontroller.receiptVbox.getChildren());

    }
    public void RB(ActionEvent event)throws IOException{
       
        if(rButton1.isSelected()){
            ci.setCustomercod(true);
            ci.setCustomerMop("Cash on Delivery");
        }
        else if(rButton1.isSelected()){
            ci.setCustomercod(false);
            ci.setCustomerMop("Pick-Up");
        }
    }
    

     public void contactChecker() {
        // Restrict input to numbers
        contact.addEventFilter(KeyEvent.KEY_TYPED, event -> {
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
        contact.setTextFormatter(textFormatter);
    }

     public void postal() {
        // Restrict input to numbers
        addPo.addEventFilter(KeyEvent.KEY_TYPED, event -> {
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
        addPo.setTextFormatter(textFormatter);
    }


    public void CancelOrder(ActionEvent event)throws IOException{
        boolean result = alert.showConfirmationAlert("Are you sure you want to cancel?", "This will remove all the items in your cart.");

        if(result){
        ChoicepageController.Itemcount = 0;
        ChoicepageController.TP.setProductStatus(false);
        ChoicepageController.TPants.setProductStatus(false);
        ChoicepageController.TS.setProductStatus(false);
        ChoicepageController.NP.setProductStatus(false);
        ChoicepageController.MP.setProductStatus(false);
        ChoicepageController.PP.setProductStatus(false);
        ChoicepageController.TP.setProductQuantity(0);
        ChoicepageController.TPants.setProductQuantity(0);
        ChoicepageController.TS.setProductQuantity(0);
        ChoicepageController.NP.setProductQuantity(0);
        ChoicepageController.MP.setProductQuantity(0);
        ChoicepageController.PP.setProductQuantity(0);
        ChoicepageController.TP.setProductPrice(0);
        ChoicepageController.TPants.setProductPrice(0);
        ChoicepageController.TS.setProductPrice(0);
        ChoicepageController.NP.setProductPrice(0);
        ChoicepageController.PP.setProductPrice(0);
        ChoicepageController.MP.setProductPrice(0);
        root = FXMLLoader.load(getClass().getResource("/view/choicepage.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        }  
    }

     public void Confirm(ActionEvent event)throws IOException{
        
        String name = fullname.getText();
        ci.setCustomerName(name);
        String address = (addH.getText() + " " + addSt.getText() + " " + addC.getText());
        ci.setCustomerAddress(address);

        if(rButton1.isSelected()){
            ci.setCustomercod(true);
            ci.setCustomerMop("Cash on Delivery");
        }
        else if(rButton2.isSelected()){
            ci.setCustomercod(false);
            ci.setCustomerMop("Pick-Up");
        }

        String tfullname = fullname.getText();
        String tcontact = contact.getText();
        String taddH = addH.getText();
        String taddR = addR.getText();
        String taddPro = addPro.getText();
        String taddPo = addPo.getText();
        String taddSt = addSt.getText();

    
        if (tfullname.isEmpty() || tcontact.isEmpty() || taddH.isEmpty() || taddR.isEmpty() || taddPro.isEmpty() || taddPo.isEmpty() || taddSt.isEmpty()) {
            AlertMaker.showSimpleAlert("Fill-Up", "Please fill in all fields.");
            return;
        }else{
         if(ChoicepageController.TP.getProductStatus()){
           FillupController.receiptcontroller.rVbox(FillupController.receiptcontroller.pane1);       
        }
        if(ChoicepageController.TS.getProductStatus()){
            FillupController.receiptcontroller.rVbox(FillupController.receiptcontroller.pane2);
        } 
        if(ChoicepageController.TPants.getProductStatus()){
            FillupController.receiptcontroller.rVbox(FillupController.receiptcontroller.pane3);
        }
         if(ChoicepageController.NP.getProductStatus()){
            FillupController.receiptcontroller.rVbox(FillupController.receiptcontroller.pane4);
        }
         if(ChoicepageController.PP.getProductStatus()){
            FillupController.receiptcontroller.rVbox(FillupController.receiptcontroller.pane5);
        }
         if(ChoicepageController.MP.getProductStatus()){
            FillupController.receiptcontroller.rVbox(FillupController.receiptcontroller.pane6);
        }
        FillupController.receiptcontroller.setValueRe();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(receiptRoot);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        }
    }


    public void logout(ActionEvent event)throws IOException{
        boolean result = alert.showConfirmationAlert("Are you sure you want to Log-out?", "This will remove all the items in your cart.");
        if(result){
        ChoicepageController.Itemcount = 0;
        ChoicepageController.TP.setProductStatus(false);
        ChoicepageController.TPants.setProductStatus(false);
        ChoicepageController.TS.setProductStatus(false);
        ChoicepageController.NP.setProductStatus(false);
        ChoicepageController.MP.setProductStatus(false);
        ChoicepageController.PP.setProductStatus(false);
        ChoicepageController.TP.setProductQuantity(0);
        ChoicepageController.TPants.setProductQuantity(0);
        ChoicepageController.TS.setProductQuantity(0);
        ChoicepageController.NP.setProductQuantity(0);
        ChoicepageController.MP.setProductQuantity(0);
        ChoicepageController.PP.setProductQuantity(0);
        ChoicepageController.TP.setProductPrice(0);
        ChoicepageController.TPants.setProductPrice(0);
        ChoicepageController.TS.setProductPrice(0);
        ChoicepageController.NP.setProductPrice(0);
        ChoicepageController.PP.setProductPrice(0);
        ChoicepageController.MP.setProductPrice(0);
        root = FXMLLoader.load(getClass().getResource("/view/Login.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        }
        
    }

     public void toNotif(ActionEvent event)throws IOException{
        boolean result = alert.showConfirmationAlert("Are you sure you want to go to Notification?", "This will remove all the items in your cart.");
        if(result){
       ChoicepageController.Itemcount = 0;
        ChoicepageController.TP.setProductStatus(false);
        ChoicepageController.TPants.setProductStatus(false);
        ChoicepageController.TS.setProductStatus(false);
        ChoicepageController.NP.setProductStatus(false);
        ChoicepageController.MP.setProductStatus(false);
        ChoicepageController.PP.setProductStatus(false);
        ChoicepageController.TP.setProductQuantity(0);
        ChoicepageController.TPants.setProductQuantity(0);
        ChoicepageController.TS.setProductQuantity(0);
        ChoicepageController.NP.setProductQuantity(0);
        ChoicepageController.MP.setProductQuantity(0);
        ChoicepageController.PP.setProductQuantity(0);
        ChoicepageController.TP.setProductPrice(0);
        ChoicepageController.TPants.setProductPrice(0);
        ChoicepageController.TS.setProductPrice(0);
        ChoicepageController.NP.setProductPrice(0);
        ChoicepageController.PP.setProductPrice(0);
        ChoicepageController.MP.setProductPrice(0);
        root = FXMLLoader.load(getClass().getResource("/view/notif.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        }
    }

    public void toHelp(ActionEvent event)throws IOException{
        boolean result = alert.showConfirmationAlert("Are you sure you want to go to Help?", "This will remove all the items in your cart.");
        if(result){
      ChoicepageController.Itemcount = 0;
        ChoicepageController.TP.setProductStatus(false);
        ChoicepageController.TPants.setProductStatus(false);
        ChoicepageController.TS.setProductStatus(false);
        ChoicepageController.NP.setProductStatus(false);
        ChoicepageController.MP.setProductStatus(false);
        ChoicepageController.PP.setProductStatus(false);
        ChoicepageController.TP.setProductQuantity(0);
        ChoicepageController.TPants.setProductQuantity(0);
        ChoicepageController.TS.setProductQuantity(0);
        ChoicepageController.NP.setProductQuantity(0);
        ChoicepageController.MP.setProductQuantity(0);
        ChoicepageController.PP.setProductQuantity(0);
        ChoicepageController.TP.setProductPrice(0);
        ChoicepageController.TPants.setProductPrice(0);
        ChoicepageController.TS.setProductPrice(0);
        ChoicepageController.NP.setProductPrice(0);
        ChoicepageController.PP.setProductPrice(0);
        ChoicepageController.MP.setProductPrice(0);
        root = FXMLLoader.load(getClass().getResource("/view/help.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        }
    }

     public void toHome(ActionEvent event)throws IOException{
       boolean result = alert.showConfirmationAlert("Are you sure you want to go to Homepage?", "This will remove all the items in your cart.");
        if(result){
       ChoicepageController.Itemcount = 0;
        ChoicepageController.TP.setProductStatus(false);
        ChoicepageController.TPants.setProductStatus(false);
        ChoicepageController.TS.setProductStatus(false);
        ChoicepageController.NP.setProductStatus(false);
        ChoicepageController.MP.setProductStatus(false);
        ChoicepageController.PP.setProductStatus(false);
        ChoicepageController.TP.setProductQuantity(0);
        ChoicepageController.TPants.setProductQuantity(0);
        ChoicepageController.TS.setProductQuantity(0);
        ChoicepageController.NP.setProductQuantity(0);
        ChoicepageController.MP.setProductQuantity(0);
        ChoicepageController.PP.setProductQuantity(0);
        ChoicepageController.TP.setProductPrice(0);
        ChoicepageController.TPants.setProductPrice(0);
        ChoicepageController.TS.setProductPrice(0);
        ChoicepageController.NP.setProductPrice(0);
        ChoicepageController.PP.setProductPrice(0);
        ChoicepageController.MP.setProductPrice(0);
            root = FXMLLoader.load(getClass().getResource("/view/choicepage.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        }  
    }

   
}
