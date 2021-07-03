import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(9, "Training Day", 2005 ));
        movieList.add(new Movie(8.5, "Parasite", 2000));
        movieList.add(new Movie(7, "Friend", 2001));

        Collections.sort(movieList);

        for(Movie desc : movieList) {

            System.out.println(desc.getName() + ", Rating: " + desc.getRating() + ", Year: " + desc.getYear() );
        }

    }
}
