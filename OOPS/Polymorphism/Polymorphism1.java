package AdvancedJava.OOPS.Polymorphism;

// Source: Main.java
import java.util.Scanner;

import AdvancedJava.OOPS.Inheritance.java;

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
// Why can't a Child class object (referenced by Parent) be assigned to a Child class reference before downcasting?
// In Java, "assignment compatibility" is based on "reference types", not the "actual object type". 
// Since a Parent reference does not explicitly tell Java that it points to a Child object, direct assignment is not allowed without explicit downcasting.

// Reason: Java is Strict About Type Safety
// obj is of type Parent, even though it actually refers to a Child object.
// Java doesn’t check the actual type at compile time—it only looks at the reference type.
// Since Parent is a superclass of Child, assigning a superclass reference to a subclass reference directly is unsafe because not all Parent objects are necessarily Child objects.
// Java enforces explicit downcasting to ensure that you, as the developer, are aware of what you're doing.
          
// Point 3: "Since Parent is a superclass of Child, assigning a superclass reference to a subclass reference directly is unsafe because not all Parent objects are necessarily Child objects."
// This means that a Parent reference could be pointing to an instance of Parent itself, 
// not necessarily a Child instance. If Java allowed direct assignment from Parent to Child,
//  it could lead to runtime errors.

// Example: Why Direct Assignment is Unsafe
// java
// Copy
// Edit
// Parent obj1 = new Parent(); // obj1 refers to a Parent object
// Child childObj = obj1;  // ❌ Not allowed! What if obj1 is NOT a Child?
// obj1 is of type Parent, but it is actually a Parent object, not a Child.
// If Java allowed Child childObj = obj1;, then childObj would be treated as a Child, even though it is not really a Child.
// If we then tried to call childObj.display(), there would be no display() method, causing a runtime error.
// Java prevents this mistake at compile-time by disallowing the assignment.
// What if the Parent reference actually holds a Child object?
// java
// Copy
// Edit
// Parent obj2 = new Child(); // obj2 refers to a Child object
// Child childObj = obj2;  // ❌ Compile-time error
// Even though obj2 is referring to a Child object, Java only sees it as a Parent reference, so direct assignment is still not allowed.

// How to Fix This? Use Explicit Downcasting

// Parent obj2 = new Child(); // Upcasting (Implicit)

// // ✅ Now Java knows that we are sure it's a Child object
// Child childObj = (Child) obj2; 
// childObj.display(); // Works fine
// Since we explicitly cast (Child) obj2, Java knows we are sure obj2 actually refers to a Child.
// This avoids accidental conversion errors when dealing with Parent objects.
// Final Thought:
// Java prevents direct assignment from Parent to Child to ensure type safety—it does not assume a Parent reference is always pointing to a Child object.
//  Instead, explicit downcasting is required to confirm the actual type of the object at runtime.
        Object comedy=Movie.getMovie("C","ComedyMovie");
       // comedy.watchComedy();//cant be accessed because the reference type is parentclass  but the method is in the child object  type
        //now try cast into  movie type
        Movie comedyy=Movie.getMovie("C", "comedyMovie");
        //comedyy.watchComedy();
        Comedy comedyyy=(Comedy)Movie.getMovie("C", "ComedyMovie");
        comedyyy.watchComedy();
    //     var Keyword in Java (Local Variable Type Inference)
    //    The var keyword in Java was introduced in Java 10 to enable local variable type inference. This means that the compiler automatically determines the type of the variable based on the value assigned to it.


        var airplane =Movie.getMovie("C", "ComedyMovieWithVar");
        airplane.watchMovie();
        var m=Movie.getMovie("A", "Adventure MOvie");//m is a parent refernce type and prent object type movie
        var m1=(Adventure)Movie.getMovie("A", "Adventure movie");
        



        //Runtime type Inspection 
        Object unknownObject=Movie.getMovie("S", "interstaller");
        if(unknownObject.getClass().getName()=="ScienceFiction"){
            ScienceFiction sf=(ScienceFiction)unknownObject;
            sf.watchScienceFiction();
        }
        else if( unknownObject instanceof Adventure){
            ((Adventure)unknownObject).watchAdvanture();
        }
        else if(unknownObject instanceof ScienceFiction sfiction)//auto matically casted into science ficton and creted a obj sfiction when the instance of return s true
        sfiction.watchScienceFiction();
        

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
    public void watchAdvanture(){
        System.err.println("Watching the Adventure movie");
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
    public void watchComedy(){
        System.err.println("Watching the Comedy movie");
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
    public void watchScienceFiction(){
        System.err.println("Watching the ScienceFiction movie");
    }
}
//polymorphism in java  :
//its an abiity to execute different behaviour ,for different types ,which are determined by jvm at run time 

// In Java, this.getClass().getSimpleName() is used to get the simple (unqualified) name of the class of the current object.

// Explanation
// this.getClass(): Returns the Class object of the instance.
// .getSimpleName(): Returns the simple name of the class (i.e., the class name without the package name).
