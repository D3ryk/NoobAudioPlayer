package info.telensky.java.studies.audioplayer.player;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AudioPlayer implements NoobPlayer {

    private File soundFile;

    public AudioPlayer(File file) {
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

    public void move(int seconds) throws Exception {
        throw new Exception("Needs to be implemented");
    }

    public void skipForward() throws Exception {
        throw new Exception("Needs to be implemented");
    }

    public void stop() throws Exception {
        throw new Exception("Needs to be implemented");
    }

    public void pause() throws Exception {
        throw new Exception("Needs to be implemented");
    }

    public void skipBackward() throws Exception {
        throw new Exception("Needs to be implemented");
    }

    public void start() throws Exception {
        throw new Exception("Needs to be implemented");
    }

    public void close() throws Exception {
        throw new Exception("Needs to be implemented");
    }
}
