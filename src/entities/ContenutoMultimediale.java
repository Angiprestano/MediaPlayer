package entities;

public abstract class ContenutoMultimediale {
    public int duration;
    public int volume;

    public ContenutoMultimediale(int duration, int volume) {
        this.duration = duration;
        this.volume = volume;
    }

    public abstract void play();
}
