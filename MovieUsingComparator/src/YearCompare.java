import java.util.Comparator;

public class YearCompare implements Comparator<MovieUsingComparator> {
    public int compare(MovieUsingComparator movie1, MovieUsingComparator movie2) {
        if (movie1.getYear() < movie2.getYear()) {
            return -1;
        } else if (movie2.getYear() > movie2.getYear()) {
            return 1;
        } else {
            return 0;
        }
    }
}
