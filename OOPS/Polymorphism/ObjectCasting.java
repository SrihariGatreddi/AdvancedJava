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
