package alert;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AlertMaker {

    public static void showSimpleAlert(String title, String content) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        Image icon = new Image("/images/ProductIMG/NUM logo.png");

        // Create an ImageView with the icon
        ImageView imageView = new ImageView(icon);
        imageView.setFitWidth(48); // Set the desired width
        imageView.setFitHeight(48); // Set the desired height

        // Set the custom graphic (icon) for the dialog pane
        alert.getDialogPane().setGraphic(imageView);
        alert.showAndWait();
    }


    public static boolean showConfirmationAlert(String header, String content) {
        Alert alert = new Alert(AlertType.CONFIRMATION, content, ButtonType.YES, ButtonType.NO);
        alert.setTitle("Confirmation");
        alert.setHeaderText(header);
        alert.setContentText(content);
        Image icon = new Image("/images/ProductIMG/NUM logo.png");

        // Create an ImageView with the icon
        ImageView imageView = new ImageView(icon);
        imageView.setFitWidth(48); // Set the desired width
        imageView.setFitHeight(48); // Set the desired height

        // Set the custom graphic (icon) for the dialog pane
        alert.getDialogPane().setGraphic(imageView);
        alert.showAndWait();


        if (alert.getResult() == ButtonType.YES) {
            return true;
        }

        return false;
    }
}