package AdvancedJava.OOPS.Encapsulation;

public class EncapsulationChallenge2 {
    public static void main(String[] args) {
        printer p1=new printer(false);
        p1.addToner(12);
        p1.printPages(12);
        printer p2=new printer(true);
        p2.printPages(23);

        System.out.println(p2.pagesPrinted);
    }
}
class printer{
    static  int tonerLevel;
    static int pagesPrinted;
    private boolean duplex ;
    public printer(boolean duplex) {
        System.out.println(duplex);
        this.duplex = duplex;
    }
    public  int addToner(int toneramount){
        if(tonerLevel+toneramount >100 && tonerLevel+toneramount<0){
            return -1;
        }
        return tonerLevel+=toneramount;
    }
    public int printPages(int noofpages){
        if(this.duplex){
            System.out.println("Duplex Printer printing");
            pagesPrinted+=(noofpages/2) + (noofpages%2);
            printing(noofpages);
            return noofpages/2;
        }
        else{
        System.out.println("Non Duplex printer printing");
        pagesPrinted+=(noofpages/2);
        printing(noofpages);
        return noofpages;
        }
        
    }
    private void printing(int pages){
        for(int i=1;i<=pages;){
            if(this.duplex){
               System.out.println("Printing "+i+" "+(i+1));
               i=i+2;
            }
            else
            {
                System.out.println("Printing "+i);
                i++;
            }
        }
    }
}




// Implementation of Java Encapsulation
// In Java, encapsulation is implemented by declaring instance variables as private,
//  restricting direct access. 
//  Public getter methods retrieve variable values, while setter methods modify them, enabling controlled access.
//   This approach allows the class to enforce data validation and maintain a consistent internal state, enhancing security and flexibility.
// Encapsulation is defined as the wrapping up of data under a single unit.
//  It is the mechanism that binds together code and the data it manipulates.
//   Another way to think about encapsulation is, that it is a protective shield that prevents the data from being accessed by the code outside this shield. 
// In encapsulation, the variables or data of a class are hidden from any other class and can be accessed only through any member function of its own class.
// A private class can hide its members or methods from the end user, using abstraction to hide implementation details, by combining data hiding and abstraction.
// Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
// It is more defined with the setter and getter method.