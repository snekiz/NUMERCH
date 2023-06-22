package controller.Checkout;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CartController implements Initializable{

    @FXML
    ImageView checkIMG1, checkIMG2, checkIMG3, checkIMG4, checkIMG5, checkIMG6, SelectALLimg;

    @FXML
    Button checkBtn1, checkBtn2, checkBtn3, checkBtn4, checkBtn5, checkBtn6, SelectALLbtn, remove1, remove2, remove3, remove4, remove5, remove6;

    @FXML
    public VBox VboxLeft, VboxRight;

    @FXML
    public Pane LeftPane1, LeftPane2, LeftPane3, RightPane1, RightPane2, RightPane3;

    @FXML
    Label itemsSelected, selectALLcount;

    @FXML
    Label sizelbl1, sizelbl2, sizelbl3, sizelbl4, sizelbl5, sizelbl6;

    @FXML
    Label stylelbl1, stylelbl2, stylelbl3, stylelbl4, stylelbl5, stylelbl6;

    @FXML
    Label price1, price2, price3, price4, price5, price6, OverallTotal;

    @FXML
    Button add1, less1, add2, less2, add3, less3, add4, less4, add5, less5, add6, less6;

    @FXML
    Label qty1, qty2, qty3, qty4, qty5, qty6;

    private Stage stage;
    private Scene scene;
    private Parent root;
    AlertMaker alert = new AlertMaker();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
   
    int productQty1 = ChoicepageController.TP.getProductQuantity();
    int productQty2 = ChoicepageController.TPants.getProductQuantity();
    int productQty3 = ChoicepageController.NP.getProductQuantity();
    int productQty4 = ChoicepageController.PP.getProductQuantity();
    int productQty5 = ChoicepageController.TS.getProductQuantity();
    int productQty6 = ChoicepageController.MP.getProductQuantity();


    double ItemTotal1 = 0.0;
    double ItemTotal2 = 0.0;
    double ItemTotal3 = 0.0;
    double ItemTotal4 = 0.0;
    double ItemTotal5 = 0.0;
    double ItemTotal6 = 0.0;

    

   public void add(ActionEvent event){
    Button sourceButton = (Button) event.getSource();
if(ChoicepageController.TP.getProductStatus()){
    if(sourceButton.equals(add1)){
        if(productQty1 <= 9){
        productQty1 ++;
        ChoicepageController.TP.setProductQuantity(productQty1);
        System.out.println("TP qty: " + ChoicepageController.TP.getProductQuantity());
        ChoicepageController.Itemcount++;
        ItemTotal1 = ChoicepageController.TP.getProductPrice() * productQty1;
        qty1.setText(Integer.toString(productQty1));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String price1String = decimalFormat.format(ItemTotal1);
        price1.setText("\u20B1"+price1String);
      }
    }
}
  if(ChoicepageController.TPants.getProductStatus()){
    if(sourceButton.equals(add2)){
        if(productQty2 <= 9){
        productQty2 ++;
        ChoicepageController.Itemcount++;
        ChoicepageController.TPants.setProductQuantity(productQty2);
        ItemTotal2 = ChoicepageController.TPants.getProductPrice() * productQty2;
        qty2.setText(Integer.toString(productQty2));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String price2String = decimalFormat.format(ItemTotal2);
        price2.setText("\u20B1"+price2String);
        }
    }
  }
   if(ChoicepageController.NP.getProductStatus()){
     if(sourceButton.equals(add3)){
        if(productQty3 <= 9){
        productQty3 ++;
        ChoicepageController.Itemcount++;
        ChoicepageController.NP.setProductQuantity(productQty3);
        ItemTotal3 = ChoicepageController.NP.getProductPrice() * productQty3;
        qty3.setText(Integer.toString(productQty3));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String price3String = decimalFormat.format(ItemTotal3);
        price3.setText("\u20B1"+ price3String);
        }
     }
   } 
   if(ChoicepageController.PP.getProductStatus()){
    if(sourceButton.equals(add4)){
        if(productQty4 <= 9){
        productQty4 ++;
        ChoicepageController.Itemcount++;
        ChoicepageController.PP.setProductQuantity(productQty4);
        ItemTotal4 = ChoicepageController.PP.getProductPrice() * productQty4;
        qty4.setText(Integer.toString(productQty4));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String price4String = decimalFormat.format(ItemTotal4);
        price4.setText("\u20B1"+ price4String);
        }
    }
   }
   if(ChoicepageController.TS.getProductStatus()){
    if(sourceButton.equals(add5)){
        if(productQty5 <= 9){
        productQty5 ++;
        ChoicepageController.Itemcount++;
        ChoicepageController.TS.setProductQuantity(productQty5);
        ItemTotal5 = ChoicepageController.TS.getProductPrice() * productQty5;
        qty5.setText(Integer.toString(productQty5));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String price5String = decimalFormat.format(ItemTotal5);
        price5.setText("\u20B1"+ price5String);
        }
    }
   }
if(ChoicepageController.MP.getProductStatus()){
    if(sourceButton.equals(add6)){
        if(productQty6 <= 9){
        productQty6++;
        ChoicepageController.Itemcount++;
        ChoicepageController.MP.setProductQuantity(productQty6);
        ItemTotal6 = ChoicepageController.MP.getProductPrice() * productQty6;
        qty6.setText(Integer.toString(productQty6));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String price6String = decimalFormat.format(ItemTotal6);
        price6.setText("\u20B1"+ price6String);
        }
    }
}
    itemsSelected.setText(Integer.toString(ChoicepageController.Itemcount));
    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    double overallTotal = ItemTotal1 + ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal6;
    OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));   
}
    
   public void less(ActionEvent event){
    Button sourceButton = (Button) event.getSource();

 if(ChoicepageController.TP.getProductStatus()){
    if(sourceButton.equals(less1)){
        if(productQty1 >= 1){
        productQty1 --;
        ChoicepageController.Itemcount--;
        ChoicepageController.TP.setProductQuantity(productQty1);
        System.out.println("TP qty: " + ChoicepageController.TP.getProductQuantity());
        ItemTotal1 = ChoicepageController.TP.getProductPrice() * productQty1;
        qty1.setText(Integer.toString(productQty1));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String price1String = decimalFormat.format(ItemTotal1);
        price1.setText("\u20B1"+ price1String);
        }
    }
 }
 if(ChoicepageController.TPants.getProductStatus()){
    if(sourceButton.equals(less2)){
       if(productQty2 >= 1){
        productQty2 --;
        ChoicepageController.Itemcount--;
        ChoicepageController.TPants.setProductQuantity(productQty2);
        ItemTotal2 = ChoicepageController.TPants.getProductPrice() * productQty2;
        qty2.setText(Integer.toString(productQty2));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String price2String = decimalFormat.format(ItemTotal2);
        price2.setText("\u20B1"+price2String);
        }
    }
 }
if(ChoicepageController.NP.getProductStatus()){
    if(sourceButton.equals(less3)){
        if(productQty3 >= 1){
        productQty3 --;
        ChoicepageController.Itemcount--;
        ChoicepageController.NP.setProductQuantity(productQty3);
        ItemTotal3 = ChoicepageController.NP.getProductPrice() * productQty3;
        qty3.setText(Integer.toString(productQty3));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String price3String = decimalFormat.format(ItemTotal3);
        price3.setText("\u20B1"+ price3String);
        }
    }
}  
 if(ChoicepageController.PP.getProductStatus()){
    if(sourceButton.equals(less4)){
        if(productQty4 >= 1){
        productQty4 --;
        ChoicepageController.Itemcount--;
        ChoicepageController.PP.setProductQuantity(productQty4);
        ItemTotal4 = ChoicepageController.PP.getProductPrice() * productQty4;
        qty4.setText(Integer.toString(productQty4));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String price4String = decimalFormat.format(ItemTotal4);
        price4.setText("\u20B1"+ price4String);
        }
    }
 }   
   if(ChoicepageController.TS.getProductStatus()){
    if(sourceButton.equals(less5)){
        if(productQty5 >= 1){
        productQty5 --;
        ChoicepageController.Itemcount--;
        ChoicepageController.TS.setProductQuantity(productQty5);
        ItemTotal5 = ChoicepageController.TS.getProductPrice() * productQty5;
        qty5.setText(Integer.toString(productQty5));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String price5String = decimalFormat.format(ItemTotal5);
        price5.setText("\u20B1"+ price5String);
        }
    }
   } 
    if(ChoicepageController.MP.getProductStatus()){
        if(sourceButton.equals(less6)){
        if(productQty6 >= 1){
        productQty6--;
        ChoicepageController.Itemcount--;
        ChoicepageController.MP.setProductQuantity(productQty6);
        ItemTotal6 = ChoicepageController.MP.getProductPrice() * productQty6;
        qty6.setText(Integer.toString(productQty6));
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String price6String = decimalFormat.format(ItemTotal6);
        price6.setText("\u20B1"+ price6String);
        }
    }
    }
    itemsSelected.setText(Integer.toString(ChoicepageController.Itemcount));
    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    double overallTotal = ItemTotal1 + ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal6;
    OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));  
    }

    public void addItemL(Pane pane) {
       this.VboxLeft.getChildren().add(pane);
     }

    public void addItemR(Pane pane) {
        this.VboxRight.getChildren().add(pane);
    }
    
public void check(ActionEvent event) throws IOException {
    Button sourceButton = (Button) event.getSource();
    if (sourceButton.equals(checkBtn1)) {
        if (!ChoicepageController.TP.getProductStatus()) {
            ChoicepageController.TP.setProductStatus(true);
            checkIMG1.setVisible(true);
            ChoicepageController.Itemcount += productQty1;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal1 + ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        } else {
            ChoicepageController.TP.setProductStatus(false);
            checkIMG1.setVisible(false);
            SelectALLimg.setVisible(false);
            ChoicepageController.Itemcount -= productQty1;
             DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        }
    } else if (sourceButton.equals(checkBtn2)) {
        if (!ChoicepageController.TPants.getProductStatus()) {
            ChoicepageController.TPants.setProductStatus(true);
            checkIMG2.setVisible(true);
            ChoicepageController.Itemcount += productQty2;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal1+ ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        } else {
            ChoicepageController.TPants.setProductStatus(false);
            checkIMG2.setVisible(false);
             SelectALLimg.setVisible(false);
             ChoicepageController.Itemcount -= productQty2;
             DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal1 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        }
    } else if (sourceButton.equals(checkBtn3)) {
        if (!ChoicepageController.NP.getProductStatus()) {
            ChoicepageController.NP.setProductStatus(true);
            checkIMG3.setVisible(true);
            ChoicepageController.Itemcount += productQty3;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal1+ ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        } else {
            ChoicepageController.NP.setProductStatus(false);
            checkIMG3.setVisible(false);
            SelectALLimg.setVisible(false);
            ChoicepageController.Itemcount -= productQty3;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal1+ ItemTotal2 + ItemTotal4 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        }
    } else if (sourceButton.equals(checkBtn4)) {
        if (!ChoicepageController.PP.getProductStatus()) {
            ChoicepageController.PP.setProductStatus(true);
            checkIMG4.setVisible(true);
            ChoicepageController.Itemcount += productQty4;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal1+ ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        } else {
            ChoicepageController.PP.setProductStatus(false);
            checkIMG4.setVisible(false);
             SelectALLimg.setVisible(false);
             ChoicepageController.Itemcount -= productQty4;
             DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal1+ ItemTotal2 + ItemTotal3  + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        }
    } else if (sourceButton.equals(checkBtn5)) {
        if (!ChoicepageController.TS.getProductStatus()) {
            ChoicepageController.TS.setProductStatus(true);
            checkIMG5.setVisible(true);
            ChoicepageController.Itemcount += productQty5;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal1+ ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        } else {
            ChoicepageController.TS.setProductStatus(false);
            checkIMG5.setVisible(false);
            SelectALLimg.setVisible(false);
            ChoicepageController.Itemcount -= productQty5;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal1+ ItemTotal2 + ItemTotal3 + ItemTotal4 +  ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        }
    } else if (sourceButton.equals(checkBtn6)) {
        if (!ChoicepageController.MP.getProductStatus()) {
            ChoicepageController.MP.setProductStatus(true);
            checkIMG6.setVisible(true);
            ChoicepageController.Itemcount += productQty6;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal1+ ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        } else {
            ChoicepageController.MP.setProductStatus(false);
            checkIMG6.setVisible(false);
            SelectALLimg.setVisible(false);
            ChoicepageController.Itemcount -= productQty6;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            double overallTotal = ItemTotal1+ ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5;
            OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        }
    }
    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    if (!ChoicepageController.TP.getProductStatus() && !ChoicepageController.TPants.getProductStatus()
            && !ChoicepageController.NP.getProductStatus() && !ChoicepageController.PP.getProductStatus()
            && !ChoicepageController.TS.getProductStatus() && !ChoicepageController.MP.getProductStatus()) {
            double overallTotal = 0.0;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
    }
        itemsSelected.setText(Integer.toString(ChoicepageController.Itemcount));
}   
   
    public void remove(ActionEvent event) throws IOException {
    Button sourceButton = (Button) event.getSource();
    
    if (sourceButton.equals(remove1)) {
        if (ChoicepageController.TP.getProductStatus()) {
            VboxLeft.getChildren().remove(LeftPane1);
            ChoicepageController.TP.setProductStatus(false);
            ChoicepageController.Itemcount-= productQty1;
             DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        }else{
            VboxLeft.getChildren().remove(LeftPane1);
            ChoicepageController.TP.setProductStatus(false);
        }
    } else if (sourceButton.equals(remove2)) {
        if (ChoicepageController.TPants.getProductStatus()) {
            VboxLeft.getChildren().remove(LeftPane2); 
            ChoicepageController.TPants.setProductStatus(false); 
             ChoicepageController.Itemcount-= productQty2;      
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal1 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));    
        }else{
            VboxLeft.getChildren().remove(LeftPane2);
            ChoicepageController.TPants.setProductStatus(false); 
        }
    } else if (sourceButton.equals(remove3)) {
        if (ChoicepageController.NP.getProductStatus()) {
            VboxLeft.getChildren().remove(LeftPane3);
            ChoicepageController.NP.setProductStatus(false); 
            ChoicepageController.Itemcount-= productQty3;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal1 + ItemTotal2 + ItemTotal4 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        }else{
            VboxLeft.getChildren().remove(LeftPane3);
            ChoicepageController.NP.setProductStatus(false);
        }
    } else if (sourceButton.equals(remove4)) {
        if (ChoicepageController.PP.getProductStatus()) {
            VboxRight.getChildren().remove(RightPane1);
            ChoicepageController.PP.setProductStatus(false);
             ChoicepageController.Itemcount-= productQty4;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal2 + ItemTotal3 + ItemTotal1 + ItemTotal5 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        }else {
            VboxRight.getChildren().remove(RightPane1);
            ChoicepageController.PP.setProductStatus(false);
        }
    } else if (sourceButton.equals(remove5)) {
        if (ChoicepageController.TS.getProductStatus()) {
            VboxRight.getChildren().remove(RightPane2);
            ChoicepageController.TS.setProductStatus(false);
             ChoicepageController.Itemcount-= productQty5;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal1 + ItemTotal6;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        }else{
            VboxRight.getChildren().remove(RightPane2);
            ChoicepageController.TS.setProductStatus(false);
        }
    } else if (sourceButton.equals(remove6)) {
        if (ChoicepageController.MP.getProductStatus()) {
            VboxRight.getChildren().remove(RightPane3);
            ChoicepageController.MP.setProductStatus(false);
            ChoicepageController.Itemcount-= productQty6;
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
             double overallTotal = ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal1;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        }else{
            VboxRight.getChildren().remove(RightPane3);
            ChoicepageController.MP.setProductStatus(false);
        }
    }
    DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    if (!ChoicepageController.TP.getProductStatus() && !ChoicepageController.TPants.getProductStatus()
            && !ChoicepageController.NP.getProductStatus() && !ChoicepageController.PP.getProductStatus()
            && !ChoicepageController.TS.getProductStatus() && !ChoicepageController.MP.getProductStatus()) {
            double overallTotal = 0.0;
             OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
    }
    itemsSelected.setText(Integer.toString(ChoicepageController.Itemcount));
  }
  
  
 private boolean selectAllStatus = false; // Track the current status of "Select All" button

public void selectAll() {
    selectAllStatus = !selectAllStatus;
    SelectALLimg.setVisible(selectAllStatus);
    DecimalFormat decimalFormat = new DecimalFormat("#0.00");

    boolean tpstat = ChoicepageController.TP.getProductStatus();
    boolean tpantstat = ChoicepageController.TPants.getProductStatus();
    boolean NPstat = ChoicepageController.NP.getProductStatus();
    boolean PPstat = ChoicepageController.PP.getProductStatus();
    boolean TStat = ChoicepageController.TS.getProductStatus();
    boolean MPstat = ChoicepageController.MP.getProductStatus();


    if(!checkIMG1.isVisible() && tpstat == false || !checkIMG2.isVisible() && tpantstat == false || !checkIMG3.isVisible() && NPstat == false ||
    !checkIMG4.isVisible() && PPstat == false || !checkIMG5.isVisible() && TStat == false || !checkIMG6.isVisible() && MPstat == false ){
        SelectALLimg.setVisible(false);
    }


    if(selectAllStatus == true){
        SelectALLimg.setVisible(true);
        checkIMG1.setVisible(true);
        checkIMG2.setVisible(true);
        checkIMG3.setVisible(true);
        checkIMG4.setVisible(true);
        checkIMG5.setVisible(true);
        checkIMG6.setVisible(true);     
        double overallTotal = ItemTotal2 + ItemTotal3 + ItemTotal4 + ItemTotal5 + ItemTotal1;
        OverallTotal.setText("\u20B1" + decimalFormat.format(overallTotal));
        int qty = productQty1 + productQty2+ productQty3+ productQty4 + productQty5 + productQty6;
        itemsSelected.setText(Integer.toString(qty));
    }

     if(selectAllStatus == false){
        checkIMG1.setVisible(false);
        checkIMG2.setVisible(false);
        checkIMG3.setVisible(false);
        checkIMG4.setVisible(false);
        checkIMG5.setVisible(false);
        checkIMG6.setVisible(false);
        double total = 0.0;
        OverallTotal.setText("\u20B1" + decimalFormat.format(total));
        itemsSelected.setText("0");


    }
}

   public void CancelOrder(ActionEvent event)throws IOException{
        if(!ChoicepageController.TP.getProductStatus() && !ChoicepageController.TPants.getProductStatus() && !ChoicepageController.TS.getProductStatus()
        && !ChoicepageController.NP.getProductStatus() && !ChoicepageController.PP.getProductStatus() && !ChoicepageController.MP.getProductStatus()){
            root = FXMLLoader.load(getClass().getResource("/view/choicepage.fxml")); 
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setResizable(false);
            scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
        } else{
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
    }

    public void toFillup(ActionEvent event)throws IOException{
            boolean tpstat = ChoicepageController.TP.getProductStatus();
            boolean tpantstat = ChoicepageController.TPants.getProductStatus();
            boolean NPstat = ChoicepageController.NP.getProductStatus();
            boolean PPstat = ChoicepageController.PP.getProductStatus();
            boolean TStat = ChoicepageController.TS.getProductStatus();
            boolean MPstat = ChoicepageController.MP.getProductStatus();


        if(productQty1 == 0 && tpstat == true|| productQty2 == 0 && tpantstat == true|| productQty3 == 0 && NPstat == true||
            productQty4 == 0 && PPstat == true|| productQty5 == 0 && TStat == true|| productQty6 == 0 && MPstat == true ){
            AlertMaker.showSimpleAlert("Cart", "Please select Quantity First");
        } 

        else if(!ChoicepageController.TP.getProductStatus() && !ChoicepageController.TPants.getProductStatus() && !ChoicepageController.TS.getProductStatus()
        && !ChoicepageController.NP.getProductStatus() && !ChoicepageController.PP.getProductStatus() && !ChoicepageController.MP.getProductStatus()){
            AlertMaker.showSimpleAlert("Cart", "The Cart is Empty!");
        }else if(selectAllStatus == false){
            AlertMaker.showSimpleAlert("Cart", "The select all status is unchecked");
        }

        else{
            root = FXMLLoader.load(getClass().getResource("/view/Fillup.fxml")); 
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setResizable(false);
            scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
        }
    }

    public void setValues(){
        itemsSelected.setText(Integer.toString(ChoicepageController.Itemcount));
        
       
        if(ChoicepageController.TP.getProductStatus()){
           sizelbl1.setText(ChoicepageController.TP.getProductsize());
           stylelbl1.setText(ChoicepageController.TP.getProductstyle());
           double price = ChoicepageController.TP.getProductPrice();
           DecimalFormat decimalFormat1 = new DecimalFormat("#0.00");
           String total1 = decimalFormat1.format(price);
           price1.setText("\u20B1"+total1);
           }
           

        if(ChoicepageController.TPants.getProductStatus()){
           sizelbl2.setText(ChoicepageController.TPants.getProductsize());
           stylelbl2.setText(ChoicepageController.TPants.getProductstyle());
           double price = ChoicepageController.TPants.getProductPrice();
           DecimalFormat decimalFormat2 = new DecimalFormat("#0.00");
           String total2 = decimalFormat2.format(price);
           price2.setText("\u20B1"+total2);
        }

        if(ChoicepageController.NP.getProductStatus()){
           sizelbl3.setText(ChoicepageController.NP.getProductsize());
           stylelbl3.setText(ChoicepageController.NP.getProductstyle());
           double price = ChoicepageController.NP.getProductPrice();
           DecimalFormat decimalFormat3 = new DecimalFormat("#0.00");
           String total3 = decimalFormat3.format(price);
           price3.setText("\u20B1"+total3);
        }

        if(ChoicepageController.PP.getProductStatus()){
           sizelbl4.setText(ChoicepageController.PP.getProductsize());
           stylelbl4.setText(ChoicepageController.PP.getProductstyle());
           double price = ChoicepageController.PP.getProductPrice();
           DecimalFormat decimalFormat4 = new DecimalFormat("#0.00");
           String total4 = decimalFormat4.format(price);
           price4.setText("\u20B1"+total4);
        }
        
        if(ChoicepageController.TS.getProductStatus()){
           sizelbl5.setText(ChoicepageController.TS.getProductsize());
           stylelbl5.setText(ChoicepageController.TS.getProductstyle());
           double price = ChoicepageController.TS.getProductPrice();
           DecimalFormat decimalFormat5 = new DecimalFormat("#0.00");
           String total5 = decimalFormat5.format(price);
           price5.setText("\u20B1"+total5);
        }

        if(ChoicepageController.MP.getProductStatus()){
           sizelbl6.setText(ChoicepageController.MP.getProductsize());
           stylelbl6.setText(ChoicepageController.MP.getProductstyle());
           double price = ChoicepageController.MP.getProductPrice();
           DecimalFormat decimalFormat6 = new DecimalFormat("#0.00");
           String total6 = decimalFormat6.format(price);
           price6.setText("\u20B1"+total6);
        }
        }

    }