package org.fredinc.paysage;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class E06_BorderPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        int width = 900;
        int height = 500;

        Group root = new Group();
        Scene scene = new Scene(root, width, height);
        BorderPane borderpane = new BorderPane();
        borderpane.setPrefSize(width, height);

        MenuBar menubar = new MenuBar();
        Menu file = new Menu("Fichier");
        Menu edit = new Menu("Édition");
        Menu format = new Menu("Format");
        menubar.getMenus().addAll(file, edit, format);
        borderpane.setTop(menubar);

        TextArea text = new TextArea();
        text.setWrapText(true);
        borderpane.setCenter(text);

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setPadding(new Insets(10));
        hbox.setAlignment(Pos.CENTER_RIGHT);
        Button gras= new Button("Gras");
        Button italique = new Button("Italique");
        Button souligne = new Button("Souligné");
        hbox.getChildren().addAll(gras, italique, souligne);
        borderpane.setBottom(hbox);

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(10);
        Text police = new Text("Police :");
        String[] typePolice = {"Arial", "Times New Roman", "Courier New"};
        ComboBox police2 = new ComboBox(FXCollections.observableArrayList(typePolice));
        police2.getSelectionModel().selectFirst();
        Text taille = new Text("Taille :");
        String[] typeTaille = {"12", "14", "16", "18", "20"};
        ComboBox taille2 = new ComboBox(FXCollections.observableArrayList(typeTaille));
        taille2.getSelectionModel().selectFirst();
        Text couleur = new Text("Couleur du texte :");
        ColorPicker couleur2 = new ColorPicker();
        couleur2.setValue(Color.BLACK);
        vbox.getChildren().addAll(police, police2, taille, taille2, couleur, couleur2);
        borderpane.setLeft(vbox);

        root.getChildren().add(borderpane);
        primaryStage.setTitle("894 Rue Armand");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
