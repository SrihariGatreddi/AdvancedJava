public class bankAccont {
    private  String accnum;
    private double bal=0;
    private String cusName;
    private long phno;
    private String email;


   
    // public bankAccont(String accnum, double bal, String cusName, long phno, String email) {
    //     this.accnum = accnum;
    //     this.bal = bal;
    //     this.cusName = cusName;
    //     this.phno = phno;
    //     this.email = email;
    // }

 
    public  void setAccnum(String accnum) {
        this.accnum = accnum;
    }


    public  void setBal(double bal) {
       this. bal = bal;
    }


    public  void setCusName(String cusName) {
        this.cusName = cusName;
    }


    public  void setPhno(long phno) {
       this. phno = phno;
    }


    public  void setEmail(String email) {
        this.email = email;
    }


    public  String getAccnum() {
        return accnum;
    }


    public   double getBal() {
        return bal;
    }


    public  String getCusName() {
        return cusName;
    }


    public  long getPhno() {
        return phno;
    }


    public  String getEmail() {
        return email;
    }
    public double deposit(double depositAmount){
        
      return   this.bal=this.bal+depositAmount;
    }
    public String withdraw(double withdrawAmount){
        if(this.bal-withdrawAmount<0.0){
            return "No Suffienct balance to withdraw";
        }
        else
        {
        this.bal-=withdrawAmount;
        return "Balance after withdrawl is "+ this.bal;
        }
    }
    public static void main(String[] args) {
        bankAccont b1=new bankAccont();
        b1.setAccnum("22981A4241");
        b1.setEmail("gatreddisrihari9550@gmail.com");
        b1.setPhno(9182860457L);
        b1.setCusName("");
        System.out.println("Amount after deposit "+b1.deposit(0));
        System.out.println(b1.withdraw(5000));
        System.out.println(b1.getAccnum());
    }
}
