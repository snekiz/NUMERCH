package controller.Uniforms;

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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TradSkirtController implements Initializable{
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Button heartBtn;

    @FXML
    Label PriceLBL, stock;
    
    @FXML
    ImageView heartIMG;

    @FXML
    private ChoiceBox<String> sizeChoicebox, styleChoicebox;
    private String[] sizes = {"XS", "S", "M", "L", "XL", "2XL", "3XL", "4XL", "5XL", "6XL"};
    private String[] styles = {"F"};

    @FXML
    private Spinner<Integer> quantity;

    private boolean isLiked = false;
    private Image like = new Image("images/ProductSelectionIMG/like.png");
    private Image unlike = new Image("images/ProductSelectionIMG/unlike.png");
    private String sizechoice;
    private String stylechoice;
    private String price;
 
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        stock.setText(Integer.toString(ChoicepageController.TS.getProductStocks()));

        sizeChoicebox.getItems().addAll(sizes);
        sizeChoicebox.setValue("Please select sizes");
        sizeChoicebox.setOnAction(this::getsizechoice);
        sizeChoicebox.getStyleClass().add("sizeChoicebox");

        styleChoicebox.getItems().addAll(styles);
        styleChoicebox.setValue("Please select styles");
        styleChoicebox.getStyleClass().add("styleChoicebox");
        styleChoicebox.setOnAction(this::getStylechoice);
    }

     public void addToCart(ActionEvent event){
 if (sizeChoicebox.getValue().equals("Please select sizes") || styleChoicebox.getValue().equals("Please select styles")) {
             PriceLBL.setText("Please Select First");
        }
        else {
        ChoicepageController.cartcontroller.addItemR(ChoicepageController.cartcontroller.RightPane2);
        ChoicepageController.TS.setProductStatus(true);
        AlertMaker.showSimpleAlert("CART", "Item Added!");
    }
}
    public void getsizechoice(ActionEvent event){
        sizechoice = sizeChoicebox.getValue();
        calculateProductPrice();
        ChoicepageController.TS.setProductsize(sizechoice);
        
    }

    public void getStylechoice(ActionEvent event){
        stylechoice = styleChoicebox.getValue();
        calculateProductPrice();
        ChoicepageController.TS.setProductstyle(stylechoice);
    }

    private void calculateProductPrice(){
        
     if (stylechoice == "F"){
        if (sizechoice == "XS" || sizechoice == "S" || sizechoice == "M"){
            ChoicepageController.TS.setProductPrice(270.0);
            price = Double.toString(ChoicepageController.TS.getProductPrice());
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price = decimalFormat.format(ChoicepageController.TS.getProductPrice());
            PriceLBL.setText("\u20B1"+price);
        }
            else if(sizechoice == "L" || sizechoice == "XL" || sizechoice == "2XL" || sizechoice == "3XL"){
            ChoicepageController.TS.setProductPrice(310.0);
            price = Double.toString(ChoicepageController.TS.getProductPrice());
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price = decimalFormat.format(ChoicepageController.TS.getProductPrice());
            PriceLBL.setText("\u20B1"+price);
        }
            else if(sizechoice == "4XL" || sizechoice == "5XL" || sizechoice == "6XL"){
            ChoicepageController.TS.setProductPrice(500.0);
            price = Double.toString(ChoicepageController.TS.getProductPrice());
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            price = decimalFormat.format(ChoicepageController.TS.getProductPrice());
            PriceLBL.setText("\u20B1"+price);
        }
    }
}
          public void Like(ActionEvent event)throws IOException{

               if (isLiked) {
                heartIMG.setImage(like);
                isLiked = false;
                AlertMaker.showSimpleAlert("Hi", "The product has been put as your favorite item!");
              } else {
                heartIMG.setImage(unlike);
                 isLiked = true;
            }
            }

        public void Reserve(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("/view/ReservationFillUp.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.show();
        
    }

 public void toPants(ActionEvent event)throws IOException{
     root = FXMLLoader.load(getClass().getResource("/view/Pants.fxml")); 
     stage = (Stage)((Node)event.getSource()).getScene().getWindow();
     scene = new Scene(root);
     stage.setResizable(false);
     stage.setScene(scene);
     scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
     stage.show();
     System.out.println(ChoicepageController.TS.getProductPrice());
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

 public void toSkirts(ActionEvent event)throws IOException{
     root = FXMLLoader.load(getClass().getResource("/view/Skirts.fxml")); 
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

 public void backbutton(ActionEvent event)throws IOException{
    root = FXMLLoader.load(getClass().getResource("/view/Skirts.fxml")); 
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setResizable(false);
    stage.setScene(scene);
    scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
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

public void toCart(ActionEvent event)throws IOException{
        ChoicepageController.cartcontroller.setValues();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(ChoicepageController.cartRoot);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        }

    public void buy(ActionEvent event)throws IOException{
        if (sizeChoicebox.getValue().equals("Please select sizes") || styleChoicebox.getValue().equals("Please select styles")) {
             PriceLBL.setText("Please Select First");
        }
        else {
        ChoicepageController.TS.setProductStatus(true);
        ChoicepageController.TS.setProductQuantity(1);
        root = FXMLLoader.load(getClass().getResource("/view/Fillup.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setResizable(false);
        scene.getStylesheets().add(getClass().getResource("/css/krazy.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        }
    }
    }

