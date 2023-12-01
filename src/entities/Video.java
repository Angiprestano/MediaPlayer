package entities;

import interfaces.RegolazioneLuminosità;
import interfaces.RegolazioneVolume;

public class Video extends ContenutoMultimediale implements RegolazioneLuminosità,RegolazioneVolume {
    public Video(int duration, int volume) {
        super(duration, volume);
    }
    @Override
    public void alzaVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("volume in aumento a" + volume);
        } else {
            System.out.println("Volume massimo");
        }
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume++;
            System.out.println("volume diminuito a" + volume);
        } else {
            System.out.println("Volume minimo");
        }
    }


    @Override
    public void play() {
        System.out.println("E' partita la canzone" + duration);
    }

    @Override
    public void aumentaluminosità() {
        if (luminosità < 10) {
            luminosità++;
            System.out.println("Luminosità in aumento" + luminosità);
        } else {
            System.out.println("Luminosità già al massimo");
        }
    }

    @Override
    public void diminuisceluminosità() {
        if (luminosità > 0) {
            luminosità--;
            System.out.println("Luminosità diminuita a " + luminosità);
        } else {
            System.out.println("Luminosità minima");
        }
    }
}
