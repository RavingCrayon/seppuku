package org.fredinc.paysage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        // Head
        Circle head = new Circle(200, 200, 70);
        head.setFill(Color.LIGHTGRAY);
        root.getChildren().add(head);

        // Hair (Simplified)
        Rectangle hair = new Rectangle(150, 100, 100, 50);
        hair.setFill(Color.BLACK);
        root.getChildren().add(hair);

        // Eyes
        Circle leftEye = new Circle(170, 180, 5);
        Circle rightEye = new Circle(230, 180, 5);
        leftEye.setFill(Color.BLACK);
        rightEye.setFill(Color.BLACK);
        root.getChildren().add(leftEye);
        root.getChildren().add(rightEye);

        // Mouth
        Rectangle mouth = new Rectangle(180, 220, 40, 10);
        mouth.setFill(Color.BLACK);
        root.getChildren().add(mouth);

        // Nose (Simplified)
        Polygon nose = new Polygon(200.0, 190.0, 195.0, 200.0, 205.0, 200.0);
        nose.setFill(Color.BLACK);
        root.getChildren().add(nose);

        // Scene
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Dad's Portrait");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}