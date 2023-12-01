package entities;

import interfaces.RegolazioneVolume;

public class Audio extends ContenutoMultimediale implements RegolazioneVolume {
    public int volume;
public String Titolo = "Don't stop me now - Queen";

    public Audio(int duration, int volume) {
        super(duration, volume);
    }

    @Override
    public String toString() {
        return "Audio {" +
                "Title =" + " " + Titolo + '\'' +
                ", duration =" + " " + duration +
                ", volume =" + " " + volume +
                '}';
    }
// INCREMENTIAMO IL VOLUME
    @Override
    public void alzaVolume() {
       volume++;
    }


    @Override
    public void abbassaVolume() {
        volume--;
    }

    @Override
    public void play() {

    }
}
