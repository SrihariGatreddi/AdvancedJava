package AdvancedJava.OOPS.Polymorphism;
// Typecasting is the assessment of the value of one primitive data type to another type. In java, there are two types of casting namely upcasting and downcasting as follows:

// Upcasting is casting a subtype to a super type in an upward direction to the inheritance tree.
// It is an automatic procedure for which there are no efforts poured in to do so where a sub-class object is referred by a superclass reference variable.
// One can relate it with dynamic polymorphism.
// Implicit casting means class typecasting done by the compiler without cast syntax.
// Explicit casting means class typecasting done by the programmer with cast syntax.


//Downcasting refers to the procedure when subclass type refers to the object of the parent class is known as downcasting.
// If it is performed directly compiler gives an error as ClassCastException is thrown at runtime.
// It is only achievable with the use of instanceof operator The object which is already upcast, 
//that object only can be performed downcast.

public class ObjectCasting {
    public static void main(String[] args) {
        parent obj1=new child();//its actually 
        obj1.sayNamaste();
        //obj.sayHello();
        //obj1 is here of reference type parent and child obj

        child obj2=(child)obj1;
        //obj1 reference type is downcasted to child reference from parent refernce 
        //the new obj formed is of refernce type child and obj is also child
        // it is done to access the child specific methods
        obj2.sayHello();
        obj2.sayNamaste();


        //why child parent class refernce obj cant be stored in the child class refernce 
        
    }
}
class parent {
    void sayNamaste(){
        System.out.println("Namaste");
    }
}
class child extends parent{
    void sayHello(){
        System.out.println("Hello");
    }

}