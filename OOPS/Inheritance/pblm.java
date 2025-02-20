package AdvancedJava.OOPS.Inheritance;

public class pblm {
    public static void main(String[] args) {
        String st="00110";
        String t="";
        int c=0;
        while(st.contains("1") || t.contains("0")){
            if(st.contains("1")){
                int indx=st.indexOf("1");
                String str=st.substring(indx);
                t.concat(str);
                c++;
            }
            if(t.contains("0")){
                int indx=t.indexOf("0");
                String str=t.substring(indx);
                st.concat(str);
                c++;
            }
        }
        System.out.println(c);
        System.out.println("heeelo");
    }
}
