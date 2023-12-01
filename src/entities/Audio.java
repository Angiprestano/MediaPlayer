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
            volume--;
            System.out.println("volume diminuito a" + volume);
        } else {
            System.out.println("Volume minimo");
        }
    }

    @Override
    public void play() {
System.out.println("La canzone è partita" + volume);
    }
}
