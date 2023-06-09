package controller;

import com.sun.org.apache.bcel.internal.generic.NEW;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane loginFormContext;

    static String userName;
    public TextField txtName;


    public void JoinOnAction(ActionEvent actionEvent) throws IOException {
        userName=txtName.getText();
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(LoginFormController.class.getResource("../view/clientForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }
}
