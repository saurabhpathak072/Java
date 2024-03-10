package OOPs_Part_2.Polymorphism.MoviesApplication;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovies(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title+" is a "+instanceType+" film.");
    }

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovies() {
        super.watchMovies();
        System.out.printf("..  %s%n".repeat(3),"Pleasant Movies","Scary Music","Something Bad Happens");
    }

    public void watchAdventureMovies(){
        System.out.println("Watching an Adventure Movies!!");
    }
}

class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovies() {
        super.watchMovies();
        System.out.printf("..  %s%n".repeat(3),"Happy Ending","Something very Funny Happens","Something Funny Happens");
    }

    public void watchComedyMovies(){
        System.out.println("Watching a Comedy Movies!!");
    }
}

class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovies() {
        super.watchMovies();
        System.out.printf("..  %s%n".repeat(3),"Bad aliens do Bad stuff","Space guys chase aliens","Planet blows up");
    }

    public void watchScienceFictionMovies(){
        System.out.println("Watching a Science Fiction Movies!!");
    }
}
