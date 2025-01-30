package org.fredinc.paysage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class E03_VBox_HBox extends Application {

    @Override
    public void start(Stage primaryStage) {
        int width = 600;
        int height = 300;

        Group root = new Group();
        Scene scene = new Scene(root, width, height);
        VBox vbox = new VBox();
        vbox.setSpacing(10);

        Button bouton_x = new Button("Bouton X");
        vbox.getChildren().add(bouton_x);

        Button bouton_y = new Button("Bouton Y");
        vbox.getChildren().add(bouton_y);

        Button bouton_z = new Button("Bouton Z");
        vbox.getChildren().add(bouton_z);

        HBox hbox = new HBox();
        hbox.setSpacing(10);

        Button ok = new Button("OK");
        hbox.getChildren().add(ok);

        Button annuler = new Button("Annuler");
        hbox.getChildren().add(annuler);

        vbox.getChildren().add(hbox);

        root.getChildren().add(vbox);
        primaryStage.setTitle("894 Rue Armand");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
