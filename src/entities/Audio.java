package entities;

import interfaces.RegolazioneVolume;

public class Audio extends ContenutoMultimediale implements RegolazioneVolume {
public String Titolo = "Don't stop me now - Queen";

    public Audio(int duration, int volume) {
        super(duration, volume);
    }

    @Override
    public String toString() {
        return "Audio{" +
                "Titolo =" + " " + Titolo + '\'' +
                ", duration =" + " " + duration +
                ", volume =" + " " + volume +
                '}';
    }

    @Override
    public void alzaVolume() {

    }


    @Override
    public void abbassaVolume() {

    }

    @Override
    public void play() {

    }
}
