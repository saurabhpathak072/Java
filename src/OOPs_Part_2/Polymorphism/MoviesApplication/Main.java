package OOPs_Part_2.Polymorphism.MoviesApplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie theMovies = new Adventure("Star Wars");
        theMovies.watchMovies();

        Movie theMovie1 = Movie.getMovie("Adventure","Star Wars");
        theMovie1.watchMovies();

        Movie theSciMovie = Movie.getMovie("Science","Star Wars");
        theSciMovie.watchMovies();

        while (true){
            System.out.println("Enter Type ( %nA for Adventure, %nC for Comedy, %nS for Science Fiction"+
                    "%n or Q to quit): ");
            String type = scanner.nextLine();
            if("Qq".contains(type))
                break;
            System.out.println("Enter movie Title: ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovies();
        }
    }
}
