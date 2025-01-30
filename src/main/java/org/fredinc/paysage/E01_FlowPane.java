package org.fredinc.paysage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class E01_FlowPane extends Application {
    @Override
    public void start(Stage primaryStage){
        int width = 600;
        int height = 300;

        Group root = new Group();
        Scene scene = new Scene(root, width, height);
        FlowPane flowpane = new FlowPane(width, height);
        flowpane.setHgap(10);

        Button bouton1 = new Button("Bouton 1");
        flowpane.getChildren().add(bouton1);

        Button bouton2 = new Button("Bouton 2");
        flowpane.getChildren().add(bouton2);

        Button bouton3 = new Button("Bouton 3");
        flowpane.getChildren().add(bouton3);

        root.getChildren().add(flowpane);
        primaryStage.setTitle("894 Rue Armand");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
