import java.util.Comparator;

public class NameCompare implements Comparator<MovieUsingComparator> {
    public int compare(MovieUsingComparator movie1, MovieUsingComparator movie2) {
        return movie1.getName().compareTo(movie2.getName());
    }
}
