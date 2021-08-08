import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public int compareTo(Movie mov) {
        return this.year - mov.year;
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie("Parasite", 4.8, 2000));
        movieList.add(new Movie("Star Wars", 4.7, 1977));
        movieList.add(new Movie("Return of the Jedi", 4.4, 1983));
        movieList.add(new Movie("Jurassic Park", 4.6, 2000));
        movieList.add(new Movie("Mazingga", 3.8, 1979));

        Collections.sort(movieList);
        System.out.println("Movies after sorting");
        for(Movie movie : movieList) {
            System.out.println(movie.getName() + " rated " + movie.getRating() + " released in " + movie.getYear());
        }
    }
}
