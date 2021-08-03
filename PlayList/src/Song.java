public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public Double getDuration() {
        return duration;
    }

    //All classes inherit from java.lang.Object class
    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
