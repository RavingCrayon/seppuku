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

        // Ciel
        Rectangle ciel = new Rectangle(0, 0, 600, 300);
        ciel.setFill(Color.LIGHTBLUE);
        root.getChildren().add(ciel);

        // Sol
        Rectangle sol = new Rectangle(0, 300, 600, 100);
        sol.setFill(Color.GREEN);
        root.getChildren().add(sol);

        // Soleil
        Circle soleil = new Circle(50, 50, 30);
        soleil.setFill(Color.YELLOW);
        root.getChildren().add(soleil);

        // Nuages
        Ellipse nuage1 = new Ellipse(150, 50, 50, 20);
        Ellipse nuage2 = new Ellipse(250, 60, 30, 15);
        nuage1.setFill(Color.WHITE);
        nuage2.setFill(Color.WHITE);
        root.getChildren().addAll(nuage1, nuage2);

        // Fermier
        Rectangle fermierCorps = new Rectangle(400, 250, 30, 60);
        fermierCorps.setFill(Color.TAN);
        Circle fermierTete = new Circle(415, 220, 15);
        fermierTete.setFill(Color.TAN);
        Path barbe = new Path();
        barbe.getElements().add(new MoveTo(405, 230));
        barbe.getElements().add(new CubicCurveTo(395, 240, 390, 260, 405, 270));
        barbe.setFill(Color.BROWN);
        root.getChildren().addAll(fermierCorps, fermierTete, barbe);

        // Vigne
        Path vigne = new Path();
        vigne.getElements().add(new MoveTo(450, 200));
        vigne.getElements().add(new CubicCurveTo(500, 150, 550, 250, 600, 200));
        vigne.setStroke(Color.DARKGREEN);
        vigne.setStrokeWidth(2);
        root.getChildren().add(vigne);

        // Raisins
        Circle raisin1 = new Circle(480, 180, 5);
        Circle raisin2 = new Circle(520, 220, 5);
        raisin1.setFill(Color.PURPLE);
        raisin2.setFill(Color.PURPLE);
        root.getChildren().addAll(raisin1, raisin2);

        // Bananes
        Path bananeTige = new Path();
        bananeTige.getElements().add(new MoveTo(550, 200));
        bananeTige.getElements().add(new LineTo(550, 250));
        bananeTige.setStroke(Color.BROWN);
        bananeTige.setStrokeWidth(5);
        Circle banane1 = new Circle(550, 260, 10);
        Circle banane2 = new Circle(560, 270, 10);
        Circle banane3 = new Circle(540, 280, 10);
        banane1.setFill(Color.YELLOW);
        banane2.setFill(Color.YELLOW);
        banane3.setFill(Color.YELLOW);
        root.getChildren().addAll(bananeTige, banane1, banane2, banane3);

        // Oranges
        Circle orange1 = new Circle(420, 270, 15);
        Circle orange2 = new Circle(400, 290, 10);
        orange1.setFill(Color.ORANGE);
        orange2.setFill(Color.ORANGE);
        root.getChildren().addAll(orange1, orange2);

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Mon Paysage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}