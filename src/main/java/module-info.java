module LabB {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.rmi;
    opens centrivaccinali to javafx.fxml;
    opens cittadini to javafx.fxml;
    opens common to javafx.fxml;
    exports centrivaccinali;
    exports cittadini;
    exports common;
    exports server;
    exports DBManagement;
}