
import java.util.Scanner;

public class AntiSoduko {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       int x=0;
       String st[]=new String[9];
       for(int j=0;j<9;j++)
       {
           st[j]=sc.next();
       }
       
       for(int j=0;j<=2;j++)
       {
           char c=st[j].charAt(j);
           char d=st[j+1].charAt(j+1);
           
           st[j]=st[j].replace(c,d);
           st[j+1]=st[j+1].replace(d,c);
           j++;
           ++x;
       }
       for(int j=5;j<8;j++)
       {
           char c=st[j].charAt(j);
           char d=st[j+1].charAt(j+1);
           
           st[j]=st[j].replace(c,d);
           st[j+1]=st[j+1].replace(d,c);
           j++;
           ++x;
       }
      
       for(int j=0;j<=2;j++)
       {
           if(j!=4)
           {
           char c=st[j].charAt(8-j);
           char d=st[(j+1)].charAt(8-(j+1));
           
           st[j]=st[j].replace(c,d);
           st[j+1]=st[j+1].replace(d,c);
           j++;
           ++x;
       }
           
       }
       for(int j=5;j<8;j++)
       {
           if(j!=4)
           {
           char c=st[j].charAt(8-j);
           char d=st[(j+1)].charAt(8-(j-1));
           
           st[j]=st[j].replace(c,d);
           st[j+1]=st[j+1].replace(d,c);
           j++;
           ++x;
       }
           
       }
//           char c=st[7].charAt(7);
//           char d=st[8].charAt(8);
//           
//       st[8]=st[8].replace(d, c);
//       st[7]=st[7].replace(c, d);
       for(int j=0;j<9;j++)
       {
           System.out.println(st[j]);
       }
   }
}
    
}
