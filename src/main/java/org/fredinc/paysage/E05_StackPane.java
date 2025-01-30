package org.fredinc.paysage;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E05_StackPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        int width = 600;
        int height = 300;

        Group root = new Group();
        Scene scene = new Scene(root, width, height);
        StackPane stackpane = new StackPane();
        stackpane.setPrefSize(width, height);

        Text haut = new Text("En haut");
        haut.setFont(new Font(20));
        StackPane.setAlignment(haut, Pos.TOP_CENTER);
        stackpane.getChildren().add(haut);

        Rectangle rectangle = new Rectangle(200,100);
        rectangle.setFill(Color.BLUE);
        StackPane.setAlignment(rectangle, Pos.CENTER);
        stackpane.getChildren().add(rectangle);

        Text milieu = new Text("Au milieu");
        milieu.setFont(new Font(20));
        StackPane.setAlignment(milieu, Pos.CENTER);
        stackpane.getChildren().add(milieu);

        Text bas = new Text("En bas");
        bas.setFont(new Font(20));
        StackPane.setAlignment(bas, Pos.BOTTOM_CENTER);
        stackpane.getChildren().add(bas);

        root.getChildren().add(stackpane);
        primaryStage.setTitle("894 Rue Armand");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
