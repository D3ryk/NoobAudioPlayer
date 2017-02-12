package info.telensky.java.studies.audioplayer;

import info.telensky.java.studies.audioplayer.player.AudioPlayer;
import javazoom.jl.decoder.JavaLayerException;

import java.io.File;
import java.io.FileNotFoundException;

public class AudioPlayerRunner {

    public static void main(String args[]) throws InterruptedException {
        File file = new File("src/main/resources/audioFile.mp3");
        AudioPlayer audioPlayer = null;

        try {
            audioPlayer = new AudioPlayer(file);
        } catch (JavaLayerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        audioPlayer.play();
    }
}
