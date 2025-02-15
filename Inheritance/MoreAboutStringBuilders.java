import java.util.*;
public class MoreAboutStringBuilders {
    public static void main(String[] args) {
        //stringbuilder creation ways//overloading methods 
        StringBuilder b=new StringBuilder("harry");
        System.out.println(b.append(" hmmmm"));
        System.out.println(b.delete(0, 3));
        System.out.println(b.deleteCharAt(2));

        System.out.println(b.insert(2, "KKK"));//insert a string at a specified position
        System.out.println(b.insert(4, " "));//insert a character at a specified position

        System.out.println(b.reverse());
        System.out.println(b);

        System.out.println(b.reverse());
        

    }
}
