package centrivaccinali;

import common.CentroVaccinale;
import common.Vaccinato;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 * Controller associato a <code>CvRegVaccinato</code>.
 *
 * @author Berti Davide - 740665 VA
 * @author Ivanov Aleksandar Evgeniev - 742789 VA
 * @author Mazza Serghej - 740687 VA
 * @author Rizzi Silvio - 719638 VA
 * @see CvRegVaccinato
 */
public class CvCntrlVaccinato {
    @FXML
    private DatePicker date;
    @FXML
    private RadioButton btnAstraZeneca, btnJohnsonJohnson, btnModerna, btnPfizer;
    @FXML
    private TextField txtCentreName, txtFirstName, txtLastName, txtFiscalCode, txtId;

    private CentroVaccinale CV = null;

    /**
     * Sposta la finestra corrente in background e crea una nuova istanza di <code>CvCerca</code>. Questo metodo &egrave;
     * associato al bottone per la selezione di un centro vaccinale registrato.
     *
     * @param event il riferimento all'evento associato
     * @see ActionEvent
     * @see CvCerca
     */
    public void search(ActionEvent event) {
        // APERTURA DELLA NUOVA FINESTRA
        new CvCerca(this);
    }

    /**
     * Chiude la finestra corrente e crea una nuova istanza di <code>CvHomePage</code>. Questo metodo &egrave; associato
     * al bottone per il ritorno alla pagina iniziale.
     *
     * @param event il riferimento all'evento associato
     * @see ActionEvent
     * @see CvHomePage
     */
    public void backToHomePage(ActionEvent event) {
        // CHIUSURA DELLA VECCHIA FINESTRA
        Stage oldStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        oldStage.close();
        // APERTURA DELLA NUOVA FINESTRA
        new CvHomePage();
    }

    /**
     * Chiude la finestra corrente inviando i dati correttamente inseriti a un server opportunamente collegato e crea
     * una nuova istanza di <code>CvHomePage</code>. Questo metodo &egrave; associato al bottone per la conferma dell'operazione.
     *
     * @param event il riferimento all'evento associato
     * @see ActionEvent
     * @see CvHomePage
     */
    public void confirm(ActionEvent event) {
        if(check()) {
            // ESTRAZIONE DI DATI DA TEXTFIELD
            TextField[] txt = { txtFirstName, txtLastName, txtFiscalCode, txtId };
            String[] buf = CvUtil.toStringArray(txt);
            // ESTRAZIONE DI DATI DA RADIOBUTTON
            RadioButton[] vaccine = { btnAstraZeneca, btnJohnsonJohnson, btnModerna, btnPfizer };
            String vaccineType = CvUtil.selectRadioButton(vaccine);
            if (vaccineType.contains("Johnson"))
                vaccineType = "JJ";
            // ESTRAZIONE DI DATI DA DATEPICKER
            LocalDate ddMMyyyy = date.getValue();
            // COSTRUZIONE VACCINATO
            Vaccinato vax = new Vaccinato(CV, buf[0], buf[1], buf[2], vaccineType, Integer.parseInt(buf[3]), ddMMyyyy);
            // COLLEGAMENTO A SERVER
            try {
                if (!ServerConnection.SERVER.registraVaccinato(vax)) {
                    JOptionPane.showMessageDialog(null, "Esiste gia' un vaccinato con questo codice fiscale.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (RemoteException e) {
                JOptionPane.showMessageDialog(null, "Connessione al server fallita.", "Error", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            // CHIUSURA DELLA VECCHIA FINESTRA
            Stage oldStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            oldStage.close();
            // APERTURA DELLA NUOVA FINESTRA
            new CvHomePage();

            // System.out.println(txtCentreName.getText()+" "+buf[0]+" "+buf[1]+" "+buf[2]+" "+vaccineType+" "+Integer.parseInt(buf[3])+" "+ddMMyyyy);

        }
    }

    public void setDati(CentroVaccinale cv) throws RemoteException {
        CV = cv;
        txtCentreName.setText(CV.getNome());
    }

    private boolean check() {
        if(txtCentreName.getText().isBlank() || txtFirstName.getText().isBlank() || txtLastName.getText().isBlank() || txtFiscalCode.getText().isBlank() || date.getValue() == null || txtId.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Tutti i campi devono essere compilati.", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(txtFiscalCode.getText().length() != 16) {
            JOptionPane.showMessageDialog(null,"Il codice fiscale deve contere 16 caratteri.", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(!CvUtil.isNumerical(txtId.getText())) {
            JOptionPane.showMessageDialog(null, "Il codice di identificazione deve contenere una stringa di caratteri numerici di lunghezza valida.", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(Integer.parseInt(txtId.getText()) < 0) {
            JOptionPane.showMessageDialog(null,"Il codice di identificazione non deve contenere un numero negativo.", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if(!CvUtil.isAlphabetical(txtFirstName.getText()) || !CvUtil.isAlphabetical(txtLastName.getText())) {
            JOptionPane.showMessageDialog(null, "Nome e cognome non possono contenere numeri o caratteri speciali.", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
}
