package entities;

import interfaces.RegolazioneLuminosità;
import interfaces.RegolazioneVolume;

public class Video extends ContenutoMultimediale implements RegolazioneLuminosità,RegolazioneVolume {
    public Video(int duration, int volume) {
        super(duration, volume);
    }
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

    @Override
    public void aumentaluminosità() {
        luminosità++;
    }

    @Override
    public void diminuisceluminosità() {
    luminosità--;
    }
}
