
import java.util.Arrays;
import java.util.Scanner;

public class BrainPhoto {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int x=0;
  char ar[][]=new char[n][m];
   for(int i=0;i<n;i++)
   {
       for(int j=0;j<m;j++)
       {
           ar[i][j]=sc.next().charAt(0);
           if(ar[i][j]=='C')
           {
               ++x;
           }
           else  if(ar[i][j]=='M')
           {
               ++x;
           }
           else if(ar[i][j]=='Y')
           {
               ++x;
           }
       }
  
   }
    if(x>0)
       {
           System.out.println("#Color");
       }
       else {
           System.out.println("#Black&White");
       }
}
    
}
