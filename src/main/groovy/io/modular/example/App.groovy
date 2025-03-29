package io.modular.example

import java.io.IOException
import javafx.application.Platform
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.scene.layout.VBox;
import javafx.stage.Stage
import javafx.scene.control.Label;
import javafx.geometry.Pos;

enum Mode {
    EDIT, SELECT
}


public class App extends Application {

    Mode mode = Mode.EDIT

    @Override
    public void start(Stage stage) throws Exception {
        var vbox = new VBox(new Label("Hello"));
        vbox.setAlignment(Pos.CENTER);
        var scene = new Scene(vbox, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException {
        Application.launch(App, args)
        Platform.exit()
        println "stopped"
        System.exit(0)
    }

}
