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
        try {
            // Create the background
            Rectangle background = new Rectangle(0, 0, 600, 400); // Adjust size as needed
            background.setFill(Color.LIGHTBLUE);

            // Create the ground
            Rectangle ground = new Rectangle(0, 300, 600, 100); // Adjust position and size
            ground.setFill(Color.GREEN);

            // Create the sun
            Circle sun = new Circle(50, 50, 30);
            sun.setFill(Color.YELLOW);

            // Create the clouds (simplified)
            Ellipse cloud1 = new Ellipse(150, 50, 50, 20);
            Ellipse cloud2 = new Ellipse(250, 60, 30, 15);
            cloud1.setFill(Color.WHITE);
            cloud2.setFill(Color.WHITE);

            // Create the farmer (simplified)
            Rectangle farmerBody = new Rectangle(400, 250, 30, 60);
            farmerBody.setFill(Color.TAN);
            Circle farmerHead = new Circle(415, 220, 15);
            farmerHead.setFill(Color.TAN);
            Path beard = new Path();
            beard.getElements().add(new MoveTo(405, 230));
            beard.getElements().add(new CubicCurveTo(395, 240, 390, 260, 405, 270));
            beard.setFill(Color.BROWN);

            // Create the grapevine (simplified)
            Path grapevine = new Path();
            grapevine.getElements().add(new MoveTo(450, 200));
            grapevine.getElements().add(new CubicCurveTo(500, 150, 550, 250, 600, 200));
            grapevine.setStroke(Color.DARKGREEN);
            grapevine.setStrokeWidth(2);

            // Create the grapes (simplified)
            Circle grape1 = new Circle(480, 180, 5);
            Circle grape2 = new Circle(520, 220, 5);
            grape1.setFill(Color.PURPLE);
            grape2.setFill(Color.PURPLE);

            // Create a Pane to hold the shapes
            Pane root = new Pane();
            root.getChildren().addAll(background, ground, sun, cloud1, cloud2,
                    farmerBody, farmerHead, beard, grapevine,
                    grape1, grape2);

            // Create a Scene
            Scene scene = new Scene(root, 600, 400);

            // Set the scene and title for the stage
            primaryStage.setScene(scene);
            primaryStage.setTitle("Vector Landscape");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}