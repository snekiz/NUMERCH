package controller.Reservation;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import controller.Categories.ChoicepageController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ReservSlipController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
     
    @FXML
    Label name, studentnum, contact, date;

    @FXML
    Label productname, size, style, qty, price, TotalPrice;


     @Override
    public void initialize(URL location, ResourceBundle resources) {
       name.setText(ChoicepageController.rv.getCustomerName());
       studentnum.setText((ChoicepageController.rv.getStudentNumber()));
       contact.setText((ChoicepageController.rv.getContactNumber()));
       date.setText(ChoicepageController.rv.getDate());
       double price1= 0.0;
       double price2 = 0.0;
       int Quantity = ChoicepageController.rv.getQty();
       double totalPrice = 0.0; 
       double totalPrice2 = 0.0;
       qty.setText(Integer.toString(Quantity));
       productname.setText(ChoicepageController.rv.getProductName());
       style.setText(ChoicepageController.rv.getstyle());
       size.setText(ChoicepageController.rv.getsize());


       if(ChoicepageController.rv.getProductName().equalsIgnoreCase("Traditional Polo")){
        if (ChoicepageController.rv.getstyle().equalsIgnoreCase("Male")){
            if (ChoicepageController.rv.getsize().equalsIgnoreCase("XS") || ChoicepageController.rv.getsize().equalsIgnoreCase("S") || ChoicepageController.rv.getsize().equalsIgnoreCase("M")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 520.0;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
            else if(ChoicepageController.rv.getsize().equalsIgnoreCase("L")||ChoicepageController.rv.getsize().equalsIgnoreCase("XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("2XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("3XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1= 560.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
            else if(ChoicepageController.rv.getsize().equalsIgnoreCase("4XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("5XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("6XL")){
             DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 700.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
            
    }  
        }
       }
    if(ChoicepageController.rv.getProductName().equalsIgnoreCase("Traditional Polo")){
    if (ChoicepageController.rv.getstyle().equalsIgnoreCase("Female")){
        if (ChoicepageController.rv.getsize().equalsIgnoreCase("XS") || ChoicepageController.rv.getsize().equalsIgnoreCase("S") || ChoicepageController.rv.getsize().equalsIgnoreCase("M")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 500.00;
           price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();     
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
            else if(ChoicepageController.rv.getsize().equalsIgnoreCase("L")||ChoicepageController.rv.getsize().equalsIgnoreCase("XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("2XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("3XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 560.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty(); 
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
            else if(ChoicepageController.rv.getsize().equalsIgnoreCase("4XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("5XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("6XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 700.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
    }
    }
      
    


        if(ChoicepageController.rv.getProductName().equalsIgnoreCase("Traditional Pants")){
        if (ChoicepageController.rv.getstyle().equalsIgnoreCase("Male")){
            if (ChoicepageController.rv.getsize().equalsIgnoreCase("XS") || ChoicepageController.rv.getsize().equalsIgnoreCase("S") || ChoicepageController.rv.getsize().equalsIgnoreCase("M")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price2 = 440.0;
            price.setText("\u20B1" + decimalFormat.format(price2));
            totalPrice2 = price2 * ChoicepageController.rv.getQty();  
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice2));
            System.out.println(totalPrice2);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("L")||ChoicepageController.rv.getsize().equalsIgnoreCase("XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("2XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("3XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price2 = 470.00;
            price.setText("\u20B1" + decimalFormat.format(price2));
            totalPrice2 = price2 * ChoicepageController.rv.getQty();           
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice2));
            System.out.println(totalPrice2);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("4XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("5XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("6XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price2 = 700.00;
            price.setText("\u20B1" + decimalFormat.format(price2));
            totalPrice2 = price2 * ChoicepageController.rv.getQty();     
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice2));
            System.out.println(totalPrice2);
        }
       }  
       else if (ChoicepageController.rv.getstyle().equalsIgnoreCase("Female")){
        if (ChoicepageController.rv.getsize().equalsIgnoreCase("XS") || ChoicepageController.rv.getsize().equalsIgnoreCase("S") || ChoicepageController.rv.getsize().equalsIgnoreCase("M")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price2 = 500.00;
            price.setText("\u20B1" + decimalFormat.format(price2));
            totalPrice2 = price2 * ChoicepageController.rv.getQty();           
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice2));
            System.out.println(totalPrice2);
        }
            else if(ChoicepageController.rv.getsize().equalsIgnoreCase("L")||ChoicepageController.rv.getsize().equalsIgnoreCase("XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("2XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("3XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price2 = 560.00;
            price.setText("\u20B1" + decimalFormat.format(price2));
            totalPrice2 = price2 * ChoicepageController.rv.getQty();       
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice2));
            System.out.println(totalPrice2);
        }
            else if(ChoicepageController.rv.getsize().equalsIgnoreCase("4XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("5XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("6XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price2 = 700.00;
            price.setText("\u20B1" + decimalFormat.format(price2));
            totalPrice2 = price2 * ChoicepageController.rv.getQty();           
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice2));
            System.out.println(totalPrice2);
        }
    }
        }


        if(ChoicepageController.rv.getProductName().equalsIgnoreCase("Traditional Skirt")){
            if (ChoicepageController.rv.getsize().equalsIgnoreCase("XS") || ChoicepageController.rv.getsize().equalsIgnoreCase("S") || ChoicepageController.rv.getsize().equalsIgnoreCase("M")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 270.0;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("L")||ChoicepageController.rv.getsize().equalsIgnoreCase("XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("2XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("3XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 310.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();          
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("4XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("5XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("6XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 500.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();          
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
         }

         if(ChoicepageController.rv.getProductName().equalsIgnoreCase("MedTech Polo")){
        if (ChoicepageController.rv.getstyle().equalsIgnoreCase("Male")){
            if (ChoicepageController.rv.getsize().equalsIgnoreCase("XS") || ChoicepageController.rv.getsize().equalsIgnoreCase("S") || ChoicepageController.rv.getsize().equalsIgnoreCase("M")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 570.0;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();        
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("L")||ChoicepageController.rv.getsize().equalsIgnoreCase("XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("2XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("3XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 600.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();          
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("4XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("5XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("6XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 800.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
       }  
       else if (ChoicepageController.rv.getstyle().equalsIgnoreCase("Female")){
        if (ChoicepageController.rv.getsize().equalsIgnoreCase("XS") || ChoicepageController.rv.getsize().equalsIgnoreCase("S") || ChoicepageController.rv.getsize().equalsIgnoreCase("M")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 570.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
            else if(ChoicepageController.rv.getsize().equalsIgnoreCase("L")||ChoicepageController.rv.getsize().equalsIgnoreCase("XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("2XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("3XL")){
             DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 600.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
            else if(ChoicepageController.rv.getsize().equalsIgnoreCase("4XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("5XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("6XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 800.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
    }
        }


        if(ChoicepageController.rv.getProductName().equalsIgnoreCase("Nursing Polo")){
          if (ChoicepageController.rv.getstyle().equalsIgnoreCase("Male")){
            if (ChoicepageController.rv.getsize().equalsIgnoreCase("XS") || ChoicepageController.rv.getsize().equalsIgnoreCase("S") || ChoicepageController.rv.getsize().equalsIgnoreCase("M")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 570.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();          
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("L")||ChoicepageController.rv.getsize().equalsIgnoreCase("XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("2XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("3XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 600.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();            
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("4XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("5XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("6XL")){
           DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 800.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
    }  else if (ChoicepageController.rv.getstyle().equalsIgnoreCase("Female")){
            if (ChoicepageController.rv.getsize().equalsIgnoreCase("XS") || ChoicepageController.rv.getsize().equalsIgnoreCase("S") || ChoicepageController.rv.getsize().equalsIgnoreCase("M")){
             DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 570.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();           
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("L")||ChoicepageController.rv.getsize().equalsIgnoreCase("XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("2XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("3XL")){
             DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 600.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("4XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("5XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("6XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 800.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
    }
}
  
    
    if(ChoicepageController.rv.getProductName().equalsIgnoreCase("Psychology Polo")){
        if (ChoicepageController.rv.getstyle().equalsIgnoreCase("Male")){
            if (ChoicepageController.rv.getsize().equalsIgnoreCase("XS") || ChoicepageController.rv.getsize().equalsIgnoreCase("S") || ChoicepageController.rv.getsize().equalsIgnoreCase("M")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 570.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("L")||ChoicepageController.rv.getsize().equalsIgnoreCase("XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("2XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("3XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 600.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("4XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("5XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("6XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 800.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
    }  else if (ChoicepageController.rv.getstyle().equalsIgnoreCase("Female")){
            if (ChoicepageController.rv.getsize().equalsIgnoreCase("XS") || ChoicepageController.rv.getsize().equalsIgnoreCase("S") || ChoicepageController.rv.getsize().equalsIgnoreCase("M")){
             DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 570.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("L")||ChoicepageController.rv.getsize().equalsIgnoreCase("XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("2XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("3XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 600.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
        else if(ChoicepageController.rv.getsize().equalsIgnoreCase("4XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("5XL") || ChoicepageController.rv.getsize().equalsIgnoreCase("6XL")){
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price1 = 800.00;
            price.setText("\u20B1" + decimalFormat.format(price1));
            totalPrice = price1 * ChoicepageController.rv.getQty();
            TotalPrice.setText("\u20B1" + decimalFormat.format(totalPrice));
            System.out.println(totalPrice);
        }
    }
}
       }
    

        
    public void Ok(ActionEvent event)throws IOException{
        ChoicepageController.rv.setCustomerName(null);
        ChoicepageController.rv.setStudentNumber(null);
        ChoicepageController.rv.setContactNumber(null);
        ChoicepageController.rv.setDate(null);
        ChoicepageController.rv.setProductName(null);
        ChoicepageController.rv.setsize(null);
        ChoicepageController.rv.setstyle(null);
        ChoicepageController.rv.setQty(0);

        root = FXMLLoader.load(getClass().getResource("/view/Polo.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
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
