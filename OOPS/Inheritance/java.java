//Class object is a root of a class hierarchy,every class has a "object class" as a super class.
//all objects including arrays implements the methods of this "Object class"
//toString method is present in the object class as a parent class,so we are overriding it in the child class
//





public  class java extends Object {
    public static void main(String [] args){
      Student max=new Student("Srihari",20);
      
      primarySchoolStudent jimmy =new primarySchoolStudent("jimmy", 12, "Carol");
      System.out.println(jimmy.toString());
    }
}
class Student {
    private String name;
    private int age;
    Student(String name,int age){
     this.name=name;
     this.age=age;
    }
    @override
    public String toString(){
      return name+" is "+age;
      //return super.toString();
    }
   
    
}
class primarySchoolStudent extends Student{
  private String parentName;
  primarySchoolStudent(String name,int age,String parentName){
    super(name,age);
    this.parentName=parentName;
  }
  @Override
  public String toString(){
    return parentName+" 's kid "+super.toString();
  }
}
//methods in "Object class" are directly accessble until ,the parent class didnt overide them from the object class

