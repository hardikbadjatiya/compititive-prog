
import java.util.Scanner;

public class RandomTeams {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int y=0;
   int x=0;
   if(n>1&&m==1)
   {
       y=n*(n-1)/2;
       x=n*(n-1)/2;
       
   }
   if(n>1&&m>1){
       if(n/m==2)
       {
           y=
           x=(n-m+1)*(n-m)/2;
           
           
       }
   }
   
   
}
    
}
