package org.fredinc.paysage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class E04_AnchorPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        int width = 600;
        int height = 300;

        Group root = new Group();
        Scene scene = new Scene(root, width, height);
        AnchorPane anchorpane = new AnchorPane();
        anchorpane.setPrefSize(width, height);

        Button click = new Button("Cliquez ici");
        AnchorPane.setTopAnchor(click, 0.0);
        AnchorPane.setLeftAnchor(click, 0.0);
        anchorpane.getChildren().add(click);

        TextField text = new TextField();
        text.setPrefWidth(100);
        text.setPrefHeight(15);
        text.setEditable(false);
        AnchorPane.setTopAnchor(text, height / 2.0 - 7.5);
        AnchorPane.setLeftAnchor(text, width / 2.0 - 50);
        anchorpane.getChildren().add(text);

        Button valider = new Button("Valider");
        AnchorPane.setBottomAnchor(valider, 0.0);
        AnchorPane.setRightAnchor(valider, 0.0);
        anchorpane.getChildren().add(valider);

        root.getChildren().add(anchorpane);
        primaryStage.setTitle("894 Rue Armand");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
