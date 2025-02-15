import java.util.*;
public class MoreAboutStrings {
    public static void main(String[] args) {
        String str="Print bullet text:\n"+"\t\u2022 First point\n"+"\t\t\u2022 Second point";
        System.out.println(str);
        String textblock="""
                Print Bullet text:
                  hey hii
                       hello
                    jikill
                """;
                System.out.println(textblock);
        //formatting numbers in text
        System.out.printf("age is %d%n",20);

        String formatteddString=String.format("YourAge is"+20);
        System.out.println(formatteddString);





        //1.Inspection methods in String
        //indexOf(),lastIndexOf()-->returns index of the character
        String s="Srihari";
        String st=" ";
        System.out.println(s.indexOf('r'));//can also be used with strings s.indexOf("hari");
        System.out.println(s.lastIndexOf("r"));
        System.out.println(s.indexOf('r',1));
        
        System.out.println(s.lastIndexOf("i",7));
        
        System.out.println(s.lastIndexOf("r"));
        System.out.println(st.isEmpty());//space is there
        System.out.println(st.isBlank());//contains no character and string size is 0
        System.out.println(st.length());

        //2.String Comparision Methods
        //1.contentEquals() returns true if any character sequence type conatins the same value as String 
        StringBuilder stb= new StringBuilder("Srihari");
        String name="Srihari";
        System.out.println(name.contentEquals(stb));
        //2.equals() comaparision possible btw Strings only
        System.out.println(name.equals(stb));  
        //equals() in String performs strict type checking, which causes the comparison to fail when comparing a String with a StringBuilder.
        String m="SriHari";
        System.out.println(m.equalsIgnoreCase(name));//compares to Strings by ignoring the case
        
        System.out.println(m.contains("Hari"));
        System.out.println(s.endsWith("ar"));
        System.out.println(s.endsWith("ari"));
        System.out.println(s.startsWith("Sri"));
        System.out.println(s.startsWith("hari",3));
        
        System.out.println(m.regionMatches(3, s, 3, 4));//compares Hari in m and hari in s returs false
        System.out.println(m.regionMatches(true,3,s,3,4));//boolean value true is to ignore the case and campare the strings

        System.out.println(m.toLowerCase());//gives String with lowercase
        System.out.println(m);//original String is nnor modified whrn used toLower or to Uppercase

        //3.String Manupulation
        String indentt=" HelllloworldHellllo\u2003 ";
        System.out.println(indentt.indent(6));//adds 6spaces at the beginneing of the string
          
        System.out.println(indentt.trim());//removes only whitespaces
        System.out.println(indentt.strip());//removes also unicodes along with 
        
        System.out.println(indentt.stripLeading());
        System.out.println(indentt.stripTrailing());
        
        System.out.println(indentt.toLowerCase());
        System.out.println(indentt.toUpperCase());
         
        System.out.println(indentt.concat(" World"));//concates an another string and returns an new string
        System.out.println(indentt.join(" ","How are you","doing?"));//udes to appenf m ultiple strings with a delimeter (seperatable string like spaces )

        //System.out.println("hello\n".repeat(3));
        System.out.println("hello\n".repeat(3).indent(20));
        for(int i=1;i<=5;i++)
        System.out.println("* ".repeat(i));
        //used for indentation in patterns
        int level=4;
        System.out.println(" ".repeat(level*4)+"indented text");
        
        System.out.println(indentt.replace('l', 'a'));//for single char replcement 
        System.out.println(indentt.replace("Hellllo", "gello"));//used for all substring replce ment  
        System.out.println(indentt.replaceFirst("Hellllo","Yallllo"));//replces the first occurance of the string 
        
        System.out.println(indentt.substring(4));
        System.out.println(indentt.substring(0, 4));
        System.out.println(indentt.subSequence(0, 8));//returns a charSequence instead a string 
      
        CharSequence ch="Heyyyyy how are ?";//cant directly modify the content as it is a interface
        
        


        

    }
}




