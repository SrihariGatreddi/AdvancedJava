 class Animal {
    protected String type ;//fields declared as protected can be accessed by its child class&classes in the sa,e packages
    private String size;
    private double weight;
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
        System.out.println("Animal parameter Constructer called ");
    }
    public Animal(){
          
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + "]"+"from parent class";
    }
    public void move(String speed){
        System.out.println(type+" moves "+speed);
    }
    public void makeNoise(){
        System.out.println(type+" makes some kind of noise ");
    }
}
class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(){
      super("Mutt","Big",50);
    }
    
    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, weight<15?"Small":(weight<35?"medium":"large"),weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String earShape, String tailShape) {
        this.earShape = earShape;
        this.tailShape = tailShape;
    }
    public Dog(String type,double weight){
        this(type,weight,"Perky","Curled");
    }
    @Override
    public String toString() {
        return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + "]"+super.toString();//super.toString() also appends the parent class details 
    }
    @override
    public void makeNoise(){
        //parent class also have the same method -makenoise ,
        //but when called through the child class ,its overridding the parent class's method
        //System.out.println("Called from child class");
        bark();
        System.out.println();
    }

    @Override//to use the parent classs method in the child class ,we need override the method in the child class 
             //when ever a child class make a call of the move method ,it first checks in the child class i.e overridden class and then in the parent class
    public void move(String speed) {
        // TODO Auto-generated method stub
        super.move(speed);
        //System.out.println("Dogs walk ,run,and wag their tail");
        if(speed=="slow"){
        walk();
        WagTial();
        }
        else{
        run();
        bark();
        }
    }
    private void bark(){
        System.out.println("Woof");
    }
    private void run(){
        System.out.print("Dog Running");
    }
    
    private void walk(){
        System.out.print("Dog Walking");
    }
    private void WagTial(){
        System.out.print("tail Wagging");
    }

}
public class Inheritance1{
    public static void main(String[] args) {
        Animal ani=new Animal("Amphibians","large",30);
        doAnimalStuff(ani,"Slow");
        Dog dog=new Dog();
        doAnimalStuff(dog, "fast");
        Dog yokkie=new Dog("Yokkie",15);
        doAnimalStuff(yokkie, "fast");
        Dog retriver=new Dog("Babotor",20,"flooppy","Swimmer");
        doAnimalStuff(retriver, "Slow");
    }                                //Animal objext may be of type Animal or Dog
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();//when type of animal ,it checks the makenoise  directly in the animal class since it is the parent class.
                           //but when it is child class ,first it checks in the child class and then in the parent class
        animal.move(speed);
        System.out.println(animal);
    }
}






//overridden method can do any of the three things below:
//1.implement completely diff behavior in the child class
//2.simply call the parent method using super(),which redundunt to do
//3.or method can call the parent method ,adding some other code to the child class method to achieve additional functionalities of the child

// ✅ Overriding Required: It only works when a child class overrides a method from the parent class.
// ✅ Method Resolution Happens at Runtime: Java determines which method to call based on the actual object type, not the reference type.
// ✅ Only Works with Instance Methods: Dynamic method dispatch does not apply to static methods, fields, or private methods.
// ✅ Helps Achieve Runtime Polymorphism: This allows flexible and extensible code where behavior is determined dynamically.

