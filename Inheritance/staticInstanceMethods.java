import java.util.*;
//1.static method in different class 
// public class staticInstanceMethods {
//     public static void Hello(){
//         System.out.println("hello");
//     }
// }
// class maiin{
//     public static void main(String[] args) {
//         staticInstanceMethods.Hello();//since hello is a static method in other class,such methods are called directly without creating an instance of the class
//                                       //like jvm calls main function without the instance of the class we create
//     }
// }
//2.static method in same class
// class staticInstanceMethods{
//     public static void say(){
//         System.out.println("Hello");
//     }
//     public static void main(String[] args) {
//         say();
//     }
// }


//3.Instance methods:called through the instance of the class 
public class staticInstanceMethods {
    public  void Hello(){
        System.out.println("hello");
    }
}
class maiin{
    public static void main(String[] args) {
        //staticInstanceMethods.Hello();
        staticInstanceMethods s1=new staticInstanceMethods();
        s1.Hello();//since the hello is not static ,we need to create a instance of the class ,because a non staic 
                    //field cant bve accessed by a static field ,if want to accessed ,the static field must be in the same instance named with static ,called from an another staatic field
    }
}