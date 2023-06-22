package controller.Checkout;

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
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ReceiptController implements Initializable{

    @FXML
    Label Name, Address, Payment, dp;

    @FXML
    Label TradPolo, TradSkirt, TradPants, NursePolo, PsycPolo, MedTPolo, ss1, ss2, ss3, ss4, ss5, ss6;

    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6, price1, price2, price3, price4, price5, price6, TotalPrice, SF;

    @FXML
    VBox receiptVbox;

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6;

    double total1, total2, total3, total4, total5, total6;
    private Stage stage;
    private Scene scene;
    private Parent root;


     @Override
    public void initialize(URL location, ResourceBundle resources) {
    System.out.println(FillupController.ci.getCustomerName());


    int st1 = ChoicepageController.TP.getProductStocks() - ChoicepageController.TP.getProductQuantity();
    int st2 = ChoicepageController.TPants.getProductStocks() - ChoicepageController.TPants.getProductQuantity();
    int st3 = ChoicepageController.TS.getProductStocks() - ChoicepageController.TS.getProductQuantity();
    int st4 = ChoicepageController.PP.getProductStocks() - ChoicepageController.PP.getProductQuantity();
    int st5= ChoicepageController.NP.getProductStocks() - ChoicepageController.NP.getProductQuantity();
    int st6 = ChoicepageController.MP.getProductStocks() - ChoicepageController.MP.getProductQuantity();

        if(ChoicepageController.TP.getProductStatus()){
            TradPolo.setText(ChoicepageController.TP.getProductName());

            if(ChoicepageController.TP.getProductstyle().equals("M")){
                if(ChoicepageController.TP.getProductsize().equals("S")){
                    ss1.setText("(" + "Male" +" , "+ "Small" + ")" );
                }
                else if(ChoicepageController.TP.getProductsize().equals("M")){
                    ss1.setText("(" + "Male" +" , "+ "Medium" + ")" );
                } 
                else if(ChoicepageController.TP.getProductsize().equals("L")){
                    ss1.setText("(" + "Male" +" , "+ "Large" + ")" );
                }
                else{
                    ss1.setText("(" + "Male" +" , "+ ChoicepageController.TP.getProductsize() + ")" );
                }
            }
            if(ChoicepageController.TP.getProductstyle().equals("F")){
                if(ChoicepageController.TP.getProductsize().equals("S")){
                    ss1.setText("(" + "Female" +" , "+ "Small" + ")" );
                }
                else if(ChoicepageController.TP.getProductsize().equals("M")){
                    ss1.setText("(" + "Female" +" , "+ "Medium" + ")" );
                } 
                else if(ChoicepageController.TP.getProductsize().equals("L")){
                    ss1.setText("(" + "Female" +" , "+ "Large" + ")" );
                }
                else{
                    ss1.setText("(" + "Female" +" , "+ ChoicepageController.TP.getProductsize() + ")" );
                }
            }

            qty1.setText(Double.toString(ChoicepageController.TP.getProductQuantity()));
            double price1Value = ChoicepageController.TP.getProductPrice() * ChoicepageController.TP.getProductQuantity();
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            String price1String = decimalFormat.format(price1Value);
            price1.setText("\u20B1"+price1String);

            total1 = ChoicepageController.TP.getProductPrice() * ChoicepageController.TP.getProductQuantity();
            
        }

        if(ChoicepageController.TS.getProductStatus()){
            TradSkirt.setText(ChoicepageController.TS.getProductName());

            if(ChoicepageController.TS.getProductstyle().equals("M")){
                if(ChoicepageController.TS.getProductsize().equals("S")){
                    ss2.setText("(" + "Male" +" , "+ "Small" + ")" );
                }
                else if(ChoicepageController.TS.getProductsize().equals("M")){
                    ss2.setText("(" + "Male" +" , "+ "Medium" + ")" );
                } 
                else if(ChoicepageController.TS.getProductsize().equals("L")){
                    ss2.setText("(" + "Male" +" , "+ "Large" + ")" );
                }
                else{
                    ss2.setText("(" + "Male" +" , "+ ChoicepageController.TS.getProductsize() + ")" );
                }
            }
            if(ChoicepageController.TS.getProductstyle().equals("F")){
                if(ChoicepageController.TS.getProductsize().equals("S")){
                    ss2.setText("(" + "Female" +" , "+ "Small" + ")" );
                }
                else if(ChoicepageController.TS.getProductsize().equals("M")){
                    ss2.setText("(" + "Female" +" , "+ "Medium" + ")" );
                } 
                else if(ChoicepageController.TS.getProductsize().equals("L")){
                    ss2.setText("(" + "Female" +" , "+ "Large" + ")" );
                }
                else{
                    ss2.setText("(" + "Female" +" , "+ ChoicepageController.TS.getProductsize() + ")" );
                }
            }
            qty2.setText(Double.toString(ChoicepageController.TS.getProductQuantity()));
            double price2Value = ChoicepageController.TS.getProductPrice() * ChoicepageController.TS.getProductQuantity();
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            String price2String = decimalFormat.format(price2Value);
            price2.setText("\u20B1"+price2String);

            total2 = ChoicepageController.TS.getProductPrice() * ChoicepageController.TS.getProductQuantity();
        }

         if(ChoicepageController.TPants.getProductStatus()){
            TradPants.setText(ChoicepageController.TPants.getProductName());
           

            if(ChoicepageController.TPants.getProductstyle().equals("M")){
                if(ChoicepageController.TPants.getProductsize().equals("S")){
                    ss3.setText("(" + "Male" +" , "+ "Small" + ")" );
                }
                else if(ChoicepageController.TPants.getProductsize().equals("M")){
                    ss3.setText("(" + "Male" +" , "+ "Medium" + ")" );
                } 
                else if(ChoicepageController.TPants.getProductsize().equals("L")){
                    ss3.setText("(" + "Male" +" , "+ "Large" + ")" );
                }
                else{
                    ss3.setText("(" + "Male" +" , "+ ChoicepageController.TPants.getProductsize() + ")" );
                }
            }
            if(ChoicepageController.TPants.getProductstyle().equals("F")){
                if(ChoicepageController.TPants.getProductsize().equals("S")){
                    ss3.setText("(" + "Female" +" , "+ "Small" + ")" );
                }
                else if(ChoicepageController.TPants.getProductsize().equals("M")){
                    ss3.setText("(" + "Female" +" , "+ "Medium" + ")" );
                } 
                else if(ChoicepageController.TPants.getProductsize().equals("L")){
                    ss3.setText("(" + "Female" +" , "+ "Large" + ")" );
                }
                else{
                    ss3.setText("(" + "Female" +" , "+ ChoicepageController.TPants.getProductsize() + ")" );
                }
            }
            qty3.setText(Double.toString(ChoicepageController.TPants.getProductQuantity()));
            double price3Value = ChoicepageController.TPants.getProductPrice() * ChoicepageController.TPants.getProductQuantity();
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            String price3String = decimalFormat.format(price3Value);
            price3.setText("\u20B1"+price3String);   

            total3 = ChoicepageController.TPants.getProductPrice() * ChoicepageController.TPants.getProductQuantity();
        }

         if(ChoicepageController.NP.getProductStatus()){
            NursePolo.setText(ChoicepageController.NP.getProductName());

            if(ChoicepageController.NP.getProductstyle().equals("M")){
                if(ChoicepageController.NP.getProductsize().equals("S")){
                    ss4.setText("(" + "Male" +" , "+ "Small" + ")" );
                }
                else if(ChoicepageController.NP.getProductsize().equals("M")){
                    ss4.setText("(" + "Male" +" , "+ "Medium" + ")" );
                } 
                else if(ChoicepageController.NP.getProductsize().equals("L")){
                    ss4.setText("(" + "Male" +" , "+ "Large" + ")" );
                }
                else{
                    ss4.setText("(" + "Male" +" , "+ ChoicepageController.NP.getProductsize() + ")" );
                }
            }
            if(ChoicepageController.NP.getProductstyle().equals("F")){
                if(ChoicepageController.NP.getProductsize().equals("S")){
                    ss4.setText("(" + "Female" +" , "+ "Small" + ")" );
                }
                else if(ChoicepageController.NP.getProductsize().equals("M")){
                    ss4.setText("(" + "Female" +" , "+ "Medium" + ")" );
                } 
                else if(ChoicepageController.NP.getProductsize().equals("L")){
                    ss4.setText("(" + "Female" +" , "+ "Large" + ")" );
                }
                else{
                    ss4.setText("(" + "Female" +" , "+ ChoicepageController.NP.getProductsize() + ")" );
                }
            }
            qty4.setText(Double.toString(ChoicepageController.NP.getProductQuantity()));
            double price4Value = ChoicepageController.NP.getProductPrice() * ChoicepageController.NP.getProductQuantity();
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            String price4String = decimalFormat.format(price4Value);
            price4.setText("\u20B1"+price4String);   

            total4 = ChoicepageController.NP.getProductPrice() * ChoicepageController.NP.getProductQuantity();
        }
 
        if(ChoicepageController.PP.getProductStatus()){
            PsycPolo.setText(ChoicepageController.PP.getProductName());
            ss5.setText(ChoicepageController.PP.getProductstyle() +" "+ ChoicepageController.PP.getProductsize());

            if(ChoicepageController.PP.getProductstyle().equals("M")){
                if(ChoicepageController.PP.getProductsize().equals("S")){
                    ss5.setText("(" + "Male" +" , "+ "Small" + ")" );
                }
                else if(ChoicepageController.PP.getProductsize().equals("M")){
                    ss5.setText("(" + "Male" +" , "+ "Medium" + ")" );
                } 
                else if(ChoicepageController.PP.getProductsize().equals("L")){
                    ss5.setText("(" + "Male" +" , "+ "Large" + ")" );
                }
                else{
                    ss5.setText("(" + "Male" +" , "+ ChoicepageController.PP.getProductsize() + ")" );
                }
            }
            if(ChoicepageController.PP.getProductstyle().equals("F")){
                if(ChoicepageController.PP.getProductsize().equals("S")){
                    ss5.setText("(" + "Female" +" , "+ "Small" + ")" );
                }
                else if(ChoicepageController.PP.getProductsize().equals("M")){
                    ss5.setText("(" + "Female" +" , "+ "Medium" + ")" );
                } 
                else if(ChoicepageController.PP.getProductsize().equals("L")){
                    ss5.setText("(" + "Female" +" , "+ "Large" + ")" );
                }
                else{
                    ss5.setText("(" + "Female" +" , "+ ChoicepageController.PP.getProductsize() + ")" );
                }
            }
            qty5.setText(Double.toString(ChoicepageController.PP.getProductQuantity()));
            double price5Value = ChoicepageController.PP.getProductPrice() * ChoicepageController.PP.getProductQuantity();
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            String price5String = decimalFormat.format(price5Value);
            price5.setText("\u20B1"+price5String);

            total5 = ChoicepageController.PP.getProductPrice() * ChoicepageController.PP.getProductQuantity();
        }

        if(ChoicepageController.MP.getProductStatus()){
            MedTPolo.setText(ChoicepageController.MP.getProductName());
            
            if(ChoicepageController.MP.getProductstyle().equals("M")){
                if(ChoicepageController.MP.getProductsize().equals("S")){
                    ss6.setText("(" + "Male" +" , "+ "Small" + ")" );
                }
                else if(ChoicepageController.MP.getProductsize().equals("M")){
                    ss6.setText("(" + "Male" +" , "+ "Medium" + ")" );
                } 
                else if(ChoicepageController.MP.getProductsize().equals("L")){
                    ss6.setText("(" + "Male" +" , "+ "Large" + ")" );
                }
                else{
                    ss6.setText("(" + "Male" +" , "+ ChoicepageController.MP.getProductsize() + ")" );
                }
            }
            if(ChoicepageController.MP.getProductstyle().equals("F")){
                if(ChoicepageController.MP.getProductsize().equals("S")){
                    ss6.setText("(" + "Female" +" , "+ "Small" + ")" );
                }
                else if(ChoicepageController.MP.getProductsize().equals("M")){
                    ss6.setText("(" + "Female" +" , "+ "Medium" + ")" );
                } 
                else if(ChoicepageController.MP.getProductsize().equals("L")){
                    ss6.setText("(" + "Female" +" , "+ "Large" + ")" );
                }
                else{
                    ss6.setText("(" + "Female" +" , "+ ChoicepageController.MP.getProductsize() + ")" );
                }
            }
            qty6.setText(Double.toString(ChoicepageController.MP.getProductQuantity()));
            double price6Value = ChoicepageController.MP.getProductPrice() * ChoicepageController.MP.getProductQuantity();
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            String price6String = decimalFormat.format(price6Value);
            price6.setText("\u20B1"+price6String);

            total6 = ChoicepageController.MP.getProductPrice() * ChoicepageController.MP.getProductQuantity();
        }
        
        double sum = total1 + total2 + total3 + total4 + total5 + total6;
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String total = decimalFormat.format(sum);
        TotalPrice.setText("\u20B1"+ total);
        ChoicepageController.TP.setProductStocks(st1);
        ChoicepageController.TPants.setProductStocks(st2);
        ChoicepageController.TS.setProductStocks(st3);
        ChoicepageController.PP.setProductStocks(st4);
        ChoicepageController.NP.setProductStocks(st5);
        ChoicepageController.MP.setProductStocks(st6);
    }

    public void rVbox(Pane pane) {
        this.receiptVbox.getChildren().add(pane);
     }

    public void logout(ActionEvent event)throws IOException{
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

     public void toNotif(ActionEvent event)throws IOException{
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


    public void toHelp(ActionEvent event)throws IOException{
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

     public void toHome(ActionEvent event)throws IOException{
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
     
    public void setValueRe(){
       Name.setText(FillupController.ci.getCustomerName());
       Address.setText(FillupController.ci.getCustomerAddress());
        
       if(FillupController.ci.getCustomercod()){
            SF.setText("50.00");
            double sum = total1 + total2 + total3 + total4 + total5 + total6 + 50.00;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            String total = decimalFormat.format(sum);
            TotalPrice.setText("\u20B1"+ total);
            Payment.setText(FillupController.ci.getCustomerMop());
            dp.setText("June 26, 2023");
        }
        else{
            SF.setText("00.00");
            Payment.setText("Pick-Up");
        }
    }

   
}
