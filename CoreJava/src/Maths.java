
import java.util.Arrays;
import java.util.Scanner;

public class Maths {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String st=new String();
   st=sc.next();
  int l= st.length();
  char ar[]=new char[(l+1)/2];
   for (int i=0;i<(l/2)+1;i++)
   {
       ar[i]=st.charAt(2*i);
          
   }
  
//    System.out.println(l);
 Arrays.sort(ar);
   
  for(int i=0;i<ar.length-1;i++)
  {
      
      System.out.print(ar[i]+"+");
      
  }
    System.out.print(ar[ar.length-1]);
   }

   

    
}
