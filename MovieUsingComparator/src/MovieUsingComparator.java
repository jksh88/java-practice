    public class MovieUsingComparator {
        private String name;
        private double rating;
        private int year;

        public int compareTo(MovieUsingComparator movie) {
            return this.year - movie.year;
        }

        public MovieUsingComparator(String name, double rating, int year) {
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


    }
