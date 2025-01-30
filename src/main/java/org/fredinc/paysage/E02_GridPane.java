package org.fredinc.paysage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class E02_GridPane extends Application {
    @Override
    public void start(Stage primaryStage){
        int width = 600;
        int height = 300;

        Group root = new Group();
        Scene scene = new Scene(root, width, height);
        GridPane gridpane = new GridPane();
        gridpane.setHgap(10);
        gridpane.setVgap(10);

        Button bouton_a = new Button("Bouton A");
        gridpane.add(bouton_a, 0, 0);

        Button bouton_b = new Button("Bouton B");
        gridpane.add(bouton_b, 1, 0);

        Button bouton_c = new Button("Bouton C");
        gridpane.add(bouton_c, 0, 1);

        root.getChildren().add(gridpane);
        primaryStage.setTitle("894 Rue Armand");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
