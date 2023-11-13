package OOPs_Part_2.Polymorphism.MoviesApplication;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovies();

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovies();

        Object comedy = Movie.getMovie("C","AirPlane");
        Movie movie2 = (Comedy) comedy;
        movie2.watchMovies();
//        movie2.watchComedyMovies();   returns error

        var airplane = Movie.getMovie("C","AirPlan");
        airplane.watchMovies();
//        airplane.watchComedyMovies();  returns error

        var plane = new Comedy("Airplane");
        plane.watchComedyMovies();
    }
}
