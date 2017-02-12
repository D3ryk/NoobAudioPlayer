package info.telensky.java.studies.audioplayer.player;

import info.telensky.java.studies.audioplayer.capabilities.*;

public interface NoobPlayer extends Playable, Stopable, Pauseable, Moveable, Skipable {
    void start() throws Exception;
    void close() throws Exception;
}
