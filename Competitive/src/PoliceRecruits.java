
import java.util.Scanner;

public class PoliceRecruits {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar;
   int x=0;
   int z=0;
   for(int i=0;i<n;i++)
   {
       ar=sc.nextInt();
       
       if(x+ar<0)
       {
           z++;
       }
       else{
           x=x+ar;
       }
       
       
   }
    System.out.println(z);
 
   
}
    
}
