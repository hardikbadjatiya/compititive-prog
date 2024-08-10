
import java.util.ArrayList;
import java.util.Scanner;

public class sa {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   long n=sc.nextLong();
  ArrayList <Integer> l1=new ArrayList<Integer>();
   
   for(int i=1;i<=n/2;i++)
   {
      if(n%i==0)
      {
           l1.add(i);
      }
      
   }
   
   System.out.println(l1.size());
}
    
}
