import java.util.Comparator;

public class RatingCompare implements Comparator<MovieUsingComparator> {
    public int compare(MovieUsingComparator movie1, MovieUsingComparator movie2) {
        if (movie1.getRating() < movie2.getRating()) return -1;
        if (movie1.getRating() > movie2.getRating()) return 1;
        else return 0;
    }
}
