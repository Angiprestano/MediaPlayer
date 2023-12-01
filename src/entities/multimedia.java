package entities;

public abstract class multimedia {
    protected String title;

    public multimedia(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void play() {
        System.out.println("Riproduzione: "+ getTitle());

    }
}
