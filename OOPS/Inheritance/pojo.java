import java.lang.*;
class pojo1 {//pojo=plain old java object=code that follows certain rules and repitative 
    private String name;
    private String id;
    private String dob;
    private String course;
    public pojo1(String name, String id, String dob, String course) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.course = course;
    }
    @Override
    public String toString() {
        return "pojo [name=" + name + ", id=" + id + ", dob=" + dob + ", course=" + course + ", toString()="
                + super.toString() + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}
public class pojo{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            //instead of pojo1 p=new pojo1(.......);//41 lines of code .Using record, record implicitly creates the code that the 42 lines of code have
            //like getters setters,constructor 

            LpaStudent p=new LpaStudent(switch(i){
                case 1->"Srihari";
                case 2-> "Satwik";
                case 3->"Indu";
                case 4->"Harry";
                case 5-> "Sanyasi";
                default->"Anonymous";
            }, "22981A424"+i, "18.12.2003", "NPTEl");
            System.out.println(p);
            p.name();
        }
        pojo1 p1=new pojo1("Srihari", "0098", "19989", "NPTEL");
        LpaStudent l1=new LpaStudent("Sri", "0091", "19989", "NPTEL");
        System.out.println(p1.getName());
        System.out.println(l1.course());
    }
}
record LpaStudent(String name, String id, String dob, String course){
    //() above is called record header ,
    //each component in the header is declared as final and private(cant be modified )
    //each component will gave getter and setter methods implicitly
    //it also generates the to String method 
    //it generates the public accessor method for each components
    //for example to get the components using instance of the class: student.name(),instead student.getName();
    //public record Person(String name, int age) {
    // No need to manually define fields, constructor, or getters
    //for example internal implemententation is as follows:
//     public record Person(String name, int age) {
//     // No need to manually define fields, constructor, or getters
// }
      //for above  record implementation internally is as follows:
    //   public final class Person {
    //     private final String name;
    //     private final int age;
    
    //     // Compact constructor
    //     public Person(String name, int age) {
    //         this.name = name;
    //         this.age = age;
    //     }
    
    //     // Public accessor methods
    //     public String name() {
    //         return name;
    //     }
    
    //     public int age() {
    //         return age;
    //     }
    
    //     // Overridden toString method
    //     @Override
    //     public String toString() {
    //         return "Person[name=" + name + ", age=" + age + "]";
    //     }
    
    //     // Overridden equals method
    //     @Override
    //     public boolean equals(Object o) {
    //         if (this == o) return true;
    //         if (o == null || getClass() != o.getClass()) return false;
    //         Person person = (Person) o;
    //         return age == person.age && name.equals(person.name);
    //     }
    
    //     // Overridden hashCode method
    //     @Override
    //     public int hashCode() {
    //         return Objects.hash(name, age);
    //     }
    // }
    
}

