import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<MovieUsingComparator> movieList = new ArrayList<>();
        movieList.add(new MovieUsingComparator("Parasite", 4.8, 2000));
        movieList.add(new MovieUsingComparator("Star Wars", 4.7, 1977));
        movieList.add(new MovieUsingComparator("Return of the Jedi", 4.4, 1983));
        movieList.add(new MovieUsingComparator("Jurassic Park", 4.6, 2000));
        movieList.add(new MovieUsingComparator("Mazingga", 3.8, 1979));

        System.out.println("Sorted by rating");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(movieList, ratingCompare);
            for (MovieUsingComparator movie : movieList) {
                System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName());
            }

        System.out.println("\n");
        System.out.println("Sorted by name");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(movieList, nameCompare);
            for (MovieUsingComparator movie : movieList) {
                System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName());
            }

        System.out.println("\n");
        System.out.println("Sorted by year");
        YearCompare yearCompare = new YearCompare();
        Collections.sort(movieList, yearCompare);
            for (MovieUsingComparator movie : movieList) {
                System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName());
            }
    }
}
