package controller.Reservation;

import java.io.IOException;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.ReservationInfo;
import controller.Categories.ChoicepageController;

public class ReservFormController {
    @FXML
    TextField fullname, studentNo, contact, date;

    @FXML
    TextField productname, size, style, qty;

    private Stage stage;
    private Scene scene;
    private Parent root;
     
    

    public void studentNum() {
    // Restrict input to numbers and "-"
    studentNo.addEventFilter(KeyEvent.KEY_TYPED, event -> {
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
    studentNo.setTextFormatter(textFormatter);
}


     public void contact() {
        // Restrict input to numbers
        contact.addEventFilter(KeyEvent.KEY_TYPED, event -> {
            if (!"-0123456789".contains(event.getCharacter())) {
                event.consume();
            }
        });

        // Restrict input length to 15 characters
        TextFormatter<String> textFormatter = new TextFormatter<>(change -> {
            if (change.getControlNewText().length() <= 11) {
                return change;
            }
            return null;
        });
        contact.setTextFormatter(textFormatter);
    }

    public void Qty() {
        // Restrict input to numbers
        qty.addEventFilter(KeyEvent.KEY_TYPED, event -> {
            if (!"-0123456789".contains(event.getCharacter())) {
                event.consume();
            }
        });

        // Restrict input length to 15 characters
        TextFormatter<String> textFormatter = new TextFormatter<>(change -> {
            if (change.getControlNewText().length() <= 10) {
                return change;
            }
            return null;
        });
        qty.setTextFormatter(textFormatter);
    }

    public void Continue(ActionEvent event)throws IOException{
        
        String fullname1 = fullname.getText();
        String StudentNum= studentNo.getText();
        String Contact = contact.getText();
        String Date = date.getText();
        String Productname = productname.getText();
        String Size = size.getText();
        String Style = style.getText();
        String Qty = qty.getText();


        ChoicepageController.rv.setCustomerName(fullname1);
        ChoicepageController.rv.setStudentNumber((StudentNum));
        ChoicepageController.rv.setContactNumber((Contact));
        ChoicepageController.rv.setDate(Date);
        ChoicepageController.rv.setProductName(Productname);
        ChoicepageController.rv.setsize(Size);
        ChoicepageController.rv.setstyle(Style);
        ChoicepageController.rv.setQty(Integer.valueOf(Qty));

         if (fullname1.isEmpty() || Contact.isEmpty() || StudentNum.isEmpty() || Date.isEmpty() || Productname.isEmpty()
         || Size.isEmpty() || Style.isEmpty() || Qty.isEmpty()){
            AlertMaker.showSimpleAlert("Fill-Up", "Please fill in all fields.");
            return;
        }else{
        root = FXMLLoader.load(getClass().getResource("/view/ReservationSlip.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.show();
    }
}

    public void Back(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/polo.fxml")); 
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
}
