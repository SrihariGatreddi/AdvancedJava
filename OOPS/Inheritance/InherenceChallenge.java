import java.util.*;

class worker{
    private String name;
    private String dob;
    protected String end;

public worker(String name,String dob){//while entering the new employee details when the jooing date ,we are noT SURE WHAT THE END DATE TO BE .so we dont initiaqlize the end time
    this.name=name;
    this.dob=dob;
}
public worker(){

}

public int getAge(){
    int currentYear=2025;
    int birthYear=Integer.parseInt(dob.substring(7));
    return  (currentYear-birthYear);
}
public double  collectPay(){
    return 0.0;
}
public void  terminate(String end){
   this.end=end;
}
@Override
public String toString() {
    return "worker [name=" + name + ", dob=" + dob + ", end=" + end + "]";
}

}
class employee extends worker{
   private long empId;
    private String hireDate;
    private static int empNo=1;
    employee(String hireDate,String name,String dob){
        super(name,dob);
        this.empId=empNo++;
        this.hireDate=hireDate;
    }
    
}
class salariedEmp extends employee{
    double annualSalary;
    boolean isRetired;
 
    salariedEmp(double annualSalary,String hireDate,String name,String bod){
        super(hireDate,name,bod);
        this.annualSalary=annualSalary;
    }
    @Override
    public String toString() {
        return "salariedEmp [annualSalary=" + annualSalary + ", isRetired=" + isRetired + "]";
    }
    @Override
    public double collectPay(){
        double paycheck=annualSalary/26;
        double adjustedpay=(isRetired)?0.9*paycheck:paycheck;
        return (int) adjustedpay;
    }
    public void retire(){
        terminate("04-02-2025");
        isRetired=true;
    }
}
public class InherenceChallenge {
    public static void main(String[] args){
        salariedEmp emp1=new salariedEmp(300000,"18-12-2003","Srihari Gatreddi","18-12-98");
        //  System.out.println(emp1.collectPay());
        //  System.out.println(emp1.getAge());
        emp1.retire();
        System.out.println("emp1 pension check=$"+emp1.collectPay());
    }
}
