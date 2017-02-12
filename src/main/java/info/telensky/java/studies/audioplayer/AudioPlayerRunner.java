package info.telensky.java.studies.audioplayer;

import info.telensky.java.studies.audioplayer.player.AudioPlayer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javazoom.jl.decoder.JavaLayerException;

import java.io.File;
import java.io.FileNotFoundException;

public class AudioPlayerRunner extends Application{

    Button playButton;
    Button stopButton;
    Button pauseButton;

    public static void main(String args[]) throws InterruptedException {
        launch(args);
        //AudioPlayerRunner.runTestSong();
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Noob Audio Player");
        this.playButton = new Button();
        this.stopButton = new Button();
        this.pauseButton = new Button();

        this.playButton.setText("Play");
        this.stopButton.setText("Stop");
        this.pauseButton.setText("Pause");

        StackPane layout = new StackPane();
        StackPane.setAlignment(this.playButton, Pos.TOP_CENTER);
        StackPane.setAlignment(this.pauseButton, Pos.CENTER);
        StackPane.setAlignment(this.stopButton, Pos.BOTTOM_CENTER);

        layout.getChildren().add(this.playButton);
        layout.getChildren().add(this.pauseButton);
        layout.getChildren().add(this.stopButton);

        Scene scene = new Scene(layout, 200, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
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
