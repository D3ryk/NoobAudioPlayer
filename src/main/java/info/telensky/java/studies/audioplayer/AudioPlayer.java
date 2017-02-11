package info.telensky.java.studies.audioplayer;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AudioPlayer {

    private File soundFile;

    AudioPlayer(File file) {
        this.soundFile = file;
    }

    public void play() {
        try {
            FileInputStream fis = new FileInputStream(this.soundFile.getAbsolutePath());
            Player player = new Player(fis);
            player.play();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (JavaLayerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
