package entities;

public abstract class ContenutoMultimediale {
    public int duration;
    public int volume;
    public int luminosità;

    public ContenutoMultimediale(int duration, int volume) {
        this.duration = 0;
        this.volume = 0;
        this.luminosità = 60;

    }

    public abstract void play();
}
