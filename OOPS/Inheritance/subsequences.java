import java.util.*;
public class subsequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int size=sc.nextInt();
          int[] arr=new int[size];
          for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
          }
          int range=(1<<size);
          for(int i=1;i<range;i++){
            for(int j=0;j<size;j++){
                if(((i>>j)&1)==1)
                  System.out.print(arr[j]);
               
            }
            System.out.println();
          }
    }
}
