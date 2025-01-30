module org.fredinc.paysage {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.fredinc.paysage to javafx.fxml;
    exports org.fredinc.paysage;
}