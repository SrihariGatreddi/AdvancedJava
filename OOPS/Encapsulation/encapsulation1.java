package AdvancedJava.OOPS.Encapsulation;

public class encapsulation1 {
    public static void main(String[] args) {
    
    }
}
//encapsulation means hiding things by making them 'private or 'inaccessible 
//why encapsulation: 
//to make the interface simpler ,we may hide or restrict unnecessary details 
//to protect the integrity of data on an object,we may hide or restrict access to some of the data and operations 

//problems may face if class is  not encapsulated:
//1.initializing the values of the attributes and members of the class ,which may results in invariant checks based on the values 
//2.changing the field names may results in errors while deploying 
//3.data acceptancy is always done without checking the conditions ,it can be achieved through implementing constructer and condition checks for data acceptancey



// to create encapsulatesd class we need to
//create a constructrues for object initialization ,which enforces that only objects with valid data will get created
//use private access modifier for your fields
//use access modifiers that arent private only for the methods that the callind code needs to use
