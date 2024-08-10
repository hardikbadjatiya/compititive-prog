
import java.util.ArrayList;
import java.util.Scanner;

public class Code {
public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
   
     for(int k=0;k<t;k++)
   {
     String st=new String();
       int n=sc.nextInt();
      int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           
           ar[i]=sc.nextInt();
           st=st+ar[i];
           
       }
       if(st.contains("101")||st.contains("11")||st.contains("1001")||st.contains("10001")||
               st.contains("100001"))
       {
           System.out.println("NO");
       }
       else{
           System.out.println("YES");
       }
   }
}    
}
