import java.util.*;
import java.lang.*;
class man{
    int manAge;
    String manName;
    man(int age,String name){
         manAge=age;
         manName=name;
    }
    private void sayHello(){
        System.out.println("Hi Im"+this.manName);
    }
    public int getAge(){
        return this.manAge;
    }

}
class emp extends man{
    emp(int age,String name){
        super(age,name);
    }
    void sayHii(){

    }
}
class inheritance{
    public static void main(String[] args) {
        man emp1=new emp(24,"Srihari");
        System.out.println(emp1.getAge());
        
    }
}
