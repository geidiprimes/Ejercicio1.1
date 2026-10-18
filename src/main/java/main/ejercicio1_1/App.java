package main.ejercicio1_1;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class App extends Application {

    @FXML private TextField txtDinero;
    @FXML private Label lbl500, lbl200, lbl100, lbl50, lbl20, lbl10, lbl5, lbl2, lbl1;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        stage.setTitle("Desglose de dinero");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void desglosar() {
        int dinero = Integer.parseInt(txtDinero.getText().trim());
        int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        Label[] etiquetas = {lbl500, lbl200, lbl100, lbl50, lbl20, lbl10, lbl5, lbl2, lbl1};

        for (int i = 0; i < denominaciones.length; i++) {
            etiquetas[i].setText(String.valueOf(dinero / denominaciones[i]));
            dinero = dinero % denominaciones[i];
        }
    }

    @FXML
    private void limpiar() {
        txtDinero.clear();
        Label[] etiquetas = {lbl500, lbl200, lbl100, lbl50, lbl20, lbl10, lbl5, lbl2, lbl1};
        for (int i = 0; i < etiquetas.length; i++) {
            etiquetas[i].setText("");
        }
        txtDinero.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
