
import java.util.Scanner;

public class FafaAndCompany {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int x=0;
   for(int i=1;i<n;i++)
   {
       if(n%i==0)
       {
           if((n-i)%i==0)
           ++x; 
       }
   }
    System.out.println(x);
}
    
}
