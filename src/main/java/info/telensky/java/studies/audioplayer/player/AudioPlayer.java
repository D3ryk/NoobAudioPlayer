package info.telensky.java.studies.audioplayer.player;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AudioPlayer implements NoobPlayer {

    private AdvancedPlayer player;
    private int startFrame;
    private int endFrame;

    public AudioPlayer(File file) throws JavaLayerException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(file.getAbsolutePath());
        this.player = new AdvancedPlayer(fis);
        this.startFrame = 0;
        this.endFrame = Integer.MAX_VALUE;
    }

    public void play() {
        this.play(this.startFrame, this.endFrame);
    }

    private void play(int startFrame, int endFrame) {
        try {
            this.player.play(startFrame, endFrame);
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        this.player.stop();
    }

    public void pause() throws Exception {
        throw new Exception("Needs to be implemented");
    }

    public void move(int seconds) throws Exception {
        throw new Exception("Needs to be implemented");
    }
}
