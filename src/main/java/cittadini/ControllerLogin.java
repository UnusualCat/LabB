package cittadini;

import common.Cittadino;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import server.ServerInterface;
import javax.swing.*;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ControllerLogin {

    private Cittadino user;
    private ServerInterface server;
    @FXML
    TextField textUserID;
    @FXML
    PasswordField textPax;

    public void clickIndietro(ActionEvent event)  {
        try {
            // CHIUSURA
            Stage thisWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            thisWindow.close();

            // APERTURA NUOVA SCHERMATA
            Stage schermata = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/HomeCittadini.fxml"));
            Parent root = loader.load();
            ControllerHome cc = loader.getController();
            cc.setDati(null, server);
            schermata.setTitle("Vaccinazione cittadini");
            schermata.setScene(new Scene(root));
            schermata.show();
        } catch (IOException ignored){}
    }

    public void clickAccedi(ActionEvent event) throws RemoteException, NotBoundException {

        // CHECK COMPILAZIONE
        if (textPax.getText().equals("") || textUserID.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Compilare i campi.");
            return;
        }

        // CONTROLLO ESISTENZA UTENTE
        Cittadino utente = server.login(textUserID.getText(), textPax.getText());
            //... non trovato
        if (utente == null) {
            JOptionPane.showMessageDialog(null, "Utente non trovato. Ricontrollare i dati inseriti. ");
        } else {
            //... trovato
            user = utente;
            try {
                // CHIUSURA
                Stage thisWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
                thisWindow.close();
                // APERTURA NUOVA SCHERMATA
                Stage schermata = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/HomeCittadini.fxml"));
                Parent root = loader.load();
                ControllerHome cc = loader.getController();
                cc.setDati(user, server);
                schermata.setTitle("Vaccinazione cittadini");
                schermata.setScene(new Scene(root));
                schermata.show();
            } catch (IOException ignored){}
        }
    }

    public void setDati(ServerInterface s) {
        server = s;
    }

}
