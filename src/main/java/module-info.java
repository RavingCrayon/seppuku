module org.fredinc.paysage {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.fredinc.paysage to javafx.fxml;
    exports org.fredinc.paysage;
}