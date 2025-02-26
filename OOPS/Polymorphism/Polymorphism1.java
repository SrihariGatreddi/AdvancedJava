package AdvancedJava.OOPS.Polymorphism;

// Source: Main.java
import java.util.Scanner;

public class  Polymorphism1{

    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            // Movie movie = Movie.getMovie(type, title);
            // movie.watchMovie();


            //casting with classes and objects 
            // if i try to create instaces as below:
            //Adventure movie=Movie.getMovie(type,tiltle);
            //it will give error ,static method getMovie returns a parent reference type with child obj,
            //the parent refernce type should be stored in the parent referce obj;
            //here in the above example the reference type is of child but return type obj refernces parent
            //so error occurs !
        

            //to overcome:
            //casting is done:Down Casting 
            //like casting premitives ,we can cast instances as follows:
            Adventure movie=(Adventure)Movie.getMovie(type,title);//works only if type is ADVENTURE 
            //means the static method grtMovie returns a MOVIE type reference i.e parent type....that is type casted
            //to get desired object type;
            movie.watchMovie();
            //if the movie type is of comedy and we try to cast into of type adventure ,it gives ClassCastException error
            //i.e Adventure movie=(Adventure)Movie.getMovie(type,title);
            //gives error;


            //whats really happening?
            //
            
        }
    }
}



// Source: Movie.java
 class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}

class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }
}
//polymorphism in java  :
//its an abiity to execute different behaviour ,for different types ,which are determined by jvm at run time 

// In Java, this.getClass().getSimpleName() is used to get the simple (unqualified) name of the class of the current object.

// Explanation
// this.getClass(): Returns the Class object of the instance.
// .getSimpleName(): Returns the simple name of the class (i.e., the class name without the package name).
