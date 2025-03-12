package AdvancedJava.OOPS.Polymorphism;

import java.util.*;
import java.util.Scanner;

class Car{
    private String title;
    private String description;
    public Car(String title)
    {
        this.title=title;
    }
    public static Car getcar(String carType ,String carName){
        switch (carType) {
            case "G":
               return new GasPoweredcar(carName);
            case "E":
                return new ElecticCar(carName);
                
            case "H":
                return new HybridCar(carName);
                
            default:
                return new Car(carName);
                
        }
    }
    public void  startEngine(){
        String carType=this.getClass().getName();
        System.out.println("Strarting "+carType+"'s Engine");
    }
    protected void drive(){

        System.out.println("Driving");
    }
    public void carDestricption(double milage){
        this.description=this.getClass().getName();
        System.out.println("Starting "+title+" 's Engine \n Its Type is "+description+" gives milage "+milage);
    }
}
class ElecticCar extends Car{
            double avgKmPLit=9.0;
            int batterysize=8;
           public ElecticCar(String title) {
                   super(title);
                   //TODO Auto-generated constructor stub
               }
           
        public void  startEngine(){
            super.startEngine();
           }
        public void GiveDescirption(){
            super.carDestricption(this.avgKmPLit);
        }
}
class GasPoweredcar extends Car{
    double avgKmPLit=11.0;
    int batterysize=5;
   public GasPoweredcar(String title) {
           super(title);
           //TODO Auto-generated constructor stub
       }
   
public void  startEngine(){
    super.startEngine();
   }
   public void GiveDescirption(){
    super.carDestricption(this.avgKmPLit);
}
}
class HybridCar extends Car{
    double avgKmPLit=9.0;
    int batterysize=11;
   public HybridCar(String title) {
           super(title);
           //TODO Auto-generated constructor stub
       }
   
public void  startEngine(){
    super.startEngine();
   }
   public void GiveDescirption(){
    super.carDestricption(this.avgKmPLit);
}
}
class PolymorphismChallenge{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter type of car to be manufactured\n 1.G \n2.E \n3.H");
        String carType=sc.nextLine();
        System.out.println("Enter Car name ");
        String carname=sc.nextLine();
        var Objecttype=Car.getcar(carType,carname);
        if(Objecttype instanceof GasPoweredcar ){
          GasPoweredcar GCar=(GasPoweredcar)Objecttype;
          GCar.startEngine();
          GCar.GiveDescirption();
        }
        
        else if(Objecttype instanceof ElecticCar ){
        ElecticCar ECar=(ElecticCar)Objecttype;
        ECar.startEngine();
        ECar.GiveDescirption();
        }
        else if(Objecttype instanceof HybridCar HCar){
        HCar.startEngine();
        HCar.GiveDescirption();
        }
        else{
            Objecttype.startEngine();
            Objecttype.carDestricption(90.0);
        }   
    }
}