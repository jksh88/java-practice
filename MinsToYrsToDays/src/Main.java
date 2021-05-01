public class Main {
        public static void main(String[] args){
            printYearsAndDays(275000);
        }

        private static void printYearsAndDays(long minutes) {
            if (minutes < 0) {
                System.out.println("Invalid Value");
            }
            long years = minutes / (365 * 24 * 60);
            long days = (minutes % (365 * 24 * 60))/(24*60);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }


}
