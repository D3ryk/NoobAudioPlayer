package info.telensky.java.studies.audioplayer;

import info.telensky.java.studies.audioplayer.player.AudioPlayer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javazoom.jl.decoder.JavaLayerException;

import java.io.File;
import java.io.FileNotFoundException;

public class AudioPlayerRunner extends Application implements EventHandler<ActionEvent> {

    private final Button PLAY_BUTTON = new Button();
    private final Button STOP_BUTTON = new Button();
    private final Button PAUSE_BUTTON = new Button();

    public static void main(String args[]) throws InterruptedException {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Noob Audio Player");

        PLAY_BUTTON.setText("Play");
        STOP_BUTTON.setText("Stop");
        PAUSE_BUTTON.setText("Pause");

        PLAY_BUTTON.setOnAction(this);
        STOP_BUTTON.setOnAction(this);
        PAUSE_BUTTON.setOnAction(this);

        StackPane layout = new StackPane();
        StackPane.setAlignment(PLAY_BUTTON, Pos.TOP_CENTER);
        StackPane.setAlignment(PAUSE_BUTTON, Pos.CENTER);
        StackPane.setAlignment(STOP_BUTTON, Pos.BOTTOM_CENTER);

        layout.getChildren().add(PLAY_BUTTON);
        layout.getChildren().add(PAUSE_BUTTON);
        layout.getChildren().add(STOP_BUTTON);

        Scene scene = new Scene(layout, 200, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public void handle(ActionEvent event) {
        if (event.getSource() == PLAY_BUTTON) {
            System.out.println("Play button");
            AudioPlayerRunner.runTestSong();
        }

        if (event.getSource() == PAUSE_BUTTON) {
            System.out.println("Pause button");
        }

        if (event.getSource() == STOP_BUTTON) {
            System.out.println("Stop button");
        }
    }

    private static void runTestSong() {
        File file = new File("src/main/resources/Red-Hot-Chili-Peppers---Otherside.mp3");
        AudioPlayer audioPlayer = null;

        try {
            audioPlayer = new AudioPlayer(file);
            audioPlayer.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
