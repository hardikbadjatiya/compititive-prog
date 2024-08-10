
import java.util.Scanner;

public class Oasas {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int r=sc.nextInt();
   int c=sc.nextInt();
   int x=sc.nextInt();
   int y=sc.nextInt();
   int ro=2*x+1;
   int co=2*y+1;
   int ar[][]=new int[ro][co];
   String st[]=new String[co];
   for(int i=0;i<=x;i++)
   {
       st[i]="";
           
          if(i<=x)
       {
           for(int j=0;j<=i;j++)
       {
           ar[i][j]=(y-j);
          st[i]=st[i]+ar[i][j]+" ";
       }
           for(int  j=i+1;j<=y;j++)
           {
               ar[i][j]=(y-i);
           st[i]=st[i]+ar[i][j]+" ";
           }
       }
   }
   for(int i=0;i<=x;i++)
   {
       for(int j=y+1;j<co;j++)
       {
       
        ar[i][j]=ar[i][co-j-1];
       st[i]=st[i]+ar[i][j]+" ";
       }
       st[ro-i-1]=st[i];
   }
   for(int i=0;i<r;i++)
   {
       if(2*c<st[i].length())
       System.out.println(st[i].substring(0,2*c));
   else
       System.out.println(st[i].substring(0,co));
      }
}
    
}
