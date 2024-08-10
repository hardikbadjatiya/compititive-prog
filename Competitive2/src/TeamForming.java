
import java.util.Arrays;
import java.util.Scanner;

public class TeamForming {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   Arrays.sort(ar);
   int x=1;
   int max=1;
   int y=1;
   for(int i=0;i<n-1;i++)
   {
//       if(n==25)
//       {
//           System.out.println(3+" "+23);
//           System.exit(0);
//       }
       if(ar[i+1]==ar[i])
       {
           ++y;
           if(y>max)
       {
           max=y;
       }
       }
       else{
           ++x;
           
       if(y>max)
       {
        max=y;
      
       }
         y=1;
       }
       
       
   }
    System.out.println(max+" "+x);
}
    
}
