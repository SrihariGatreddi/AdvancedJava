
// 1. Why Can't Static Methods Be Overridden?
// In method overriding, the method to be executed is determined at runtime (dynamic method dispatch) based on the object type.
// Static methods belong to the class, not instances. They are resolved at compile-time, not runtime.
// Since overriding relies on polymorphism and runtime binding, and static methods use compile-time binding, overriding is not possible.
//**Overhiding in java  */
//if both the parent and child class contains same static methods,they cant be overidden in the child class ,but the method in the parent class cn be hidden
//by the method in the child class.
//unlike overriding , method selection is based on refernce type but not the object type;

//imporatant points to remember about the overriding
//only inherited methods can be overriden ,in otherwords methods can be overrridden only in the child classes
//constructors and private methods cant be overriden 
//and mrthods which are final can also be not overriden
//overloading is a compile time binding and a overriding isa runtime binding

//covariant return type 
//a overriden method in java can return the same return type  as the parent class returns or the ,child of the parent class return tpe
//for example if parent class returns Object as a return type,the the return type of the child class can be "String " which is a child of the Object class
//example for covariant return type
// Parent Class
// class Vehicle {
//     void type() {
//         System.out.println("General Vehicle");
//     }
// }

// // Child Classes
// class Car extends Vehicle {
//     @Override
//     void type() {
//         System.out.println("Car");
//     }
// }

// class Bike extends Vehicle {
//     @Override
//     void type() {
//         System.out.println("Bike");
//     }
// }

// // Factory Class
// class VehicleFactory {
//     Vehicle getVehicle() {
//         return new Vehicle(); // Default case
//     }
// }

// class CarFactory extends VehicleFactory {
//     @Override
//     Car getVehicle() {  // ✅ Covariant return type
//         return new Car();
//     }
// }

// class BikeFactory extends VehicleFactory {
//     @Override
//     Bike getVehicle() {  // ✅ Covariant return type
//         return new Bike();
//     }
// }

// // Main Class
// public class Main {
//     public static void main(String[] args) {
//         VehicleFactory factory1 = new CarFactory();
//         VehicleFactory factory2 = new BikeFactory();

//         Vehicle v1 = factory1.getVehicle();  // Calls CarFactory's method
//         Vehicle v2 = factory2.getVehicle();  // Calls BikeFactory's method

//         v1.type();  // Output: Car
//         v2.type();  // Output: Bike
//     }
// }

