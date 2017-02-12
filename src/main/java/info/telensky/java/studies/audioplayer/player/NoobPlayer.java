package info.telensky.java.studies.audioplayer.player;

public interface NoobPlayer {
    void play();
    void stop();
    void pause() throws Exception;
    void move(int seconds) throws Exception;
}
