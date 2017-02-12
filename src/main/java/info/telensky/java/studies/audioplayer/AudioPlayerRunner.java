package info.telensky.java.studies.audioplayer;

import info.telensky.java.studies.audioplayer.player.AudioPlayer;

import java.io.File;

public class AudioPlayerRunner {

    public static void main(String args[]) {
        File file = new File("src/main/resources/audioFile.mp3");
        AudioPlayer audioPlayer = new AudioPlayer(file);
        audioPlayer.play();
    }
}
