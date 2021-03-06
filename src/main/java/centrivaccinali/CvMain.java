package centrivaccinali;

import cittadini.ControllerConnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Il punto di ingresso dell'applicazione destinata all'uso da parte di centri vaccinali e cittadini vaccinati.
 *
 * @author Berti Davide - 740665 VA
 * @author Ivanov Aleksandar Evgeniev - 742789 VA
 * @author Mazza Serghej - 740687 VA
 * @author Rizzi Silvio - 719638 VA
 * @see Application
 */
public class CvMain extends Application {

    /**
     * Il metodo <code>main</code>.
     * @param args non richiesto
     */
    public static void main(String[] args) {
        if (System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // AVVIO APPLICAZIONE CITTADINI
        Stage schermata = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/CvConnection.fxml"));
        Parent root = loader.load();
        // ... SET DATI
        CvCntrlConnection cc = loader.getController();
        schermata.setTitle("Connection");
        schermata.setScene(new Scene(root));
        schermata.show();
    }
}
