package info.telensky.java.studies.audioplayer;


import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;

public class AudioPlayer {

    public static void main(String args[]) {

        try {
            File file = new File("src/main/resources/soundFile.mp3");
            String absolutePath = file.getAbsolutePath();
            FileInputStream fis = new FileInputStream(absolutePath);
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
