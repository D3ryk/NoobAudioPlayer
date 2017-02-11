package info.telensky.java.studies.audioplayer;

import java.io.File;

public class AudioPlayerStarter {

    public static void main(String args[]) {
        File file = new File("src/main/resources/soundFile.mp3");
        AudioPlayer audioPlayer = new AudioPlayer(file);
        audioPlayer.play();
    }
}
