import java.util.*;
public class compositionChallaenge {
     public static void main(String[] args) {
        refrigirator fridge=new refrigirator();
        dishWasher washer=new dishWasher();
        coffeeMaker coffe=new coffeeMaker();
        smartKitchen sKitchen=new smartKitchen(fridge, coffe, washer);
        sKitchen.setKitchenState(true, true, false);
        sKitchen.performTasks();
     }
}
class smartKitchen{
    private refrigirator refrigirator;
    private coffeeMaker coffeeMaker;
    private dishWasher dishWasher;
    smartKitchen(refrigirator refrigirator,coffeeMaker coffeeMaker,dishWasher dishWasher){
        this.refrigirator=refrigirator;
        this.coffeeMaker=coffeeMaker;
        this.dishWasher=dishWasher;
    }
    private void addWater(boolean addWaterStatus){
          coffeeMaker.hasWorktodo=addWaterStatus;

    }
    private void pourMilk(boolean pourMilkStatus){
        refrigirator.hasWorktodo=pourMilkStatus;

    }
    private void loadDishwasher(boolean loadDishwasherStatus){
        dishWasher.hasWorktodo=loadDishwasherStatus;
    }
    void setKitchenState(boolean addWaterStatus,boolean pourMilkStatus,boolean loadDishwasherStatus){
        addWater(addWaterStatus);
        pourMilk(pourMilkStatus);
        loadDishwasher(loadDishwasherStatus);
    }
    void performTasks(){
        refrigirator.orderFood();
        dishWasher.doDishes();
        coffeeMaker.brewCoffee();
    }
}

class refrigirator{
    boolean hasWorktodo;
    refrigirator(){
    
    }
    void orderFood(){
        if(hasWorktodo==true)
        System.out.println("Food is being ordered");
    }
}
class dishWasher{
    boolean hasWorktodo;
    dishWasher( ){
    }
    void doDishes(){
        if(hasWorktodo==true)
        System.out.println("dishes are being washed");
    } 
}
class  coffeeMaker {
    boolean hasWorktodo;
    coffeeMaker( ){
    }
    void brewCoffee(){
        if(hasWorktodo){
        System.out.println("coffe is being made");
        hasWorktodo=false;
        }
    }
}
