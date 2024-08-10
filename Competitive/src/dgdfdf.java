
import java.util.Scanner;

public class dgdfdf {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
      char ar[][]=new char[8][8];
      
      for(int i=0;i<8;i++)
      {
      
       for(int j=0;j<8;j++)
      {
          ar[i][j]='.';
      }
      
      }
      n=n-1;
      ar[0][0]='O';
      int u=31;
      for(int i=0;i<8;i++)
      {
        for(int j=0;j<8;j++)
        {
            if(i==0&&j==0)
            {
            ar[i][j]='O';
            
            }
            else{
            if(n>0)
            {
               ar[i][j]='.';
               n--;
            }
            else{
            if(n==0&&u>0)
            {
                ar[i][j]='X';
            u--;
            
            }
            }   
            }
        }
      }
      for(int i=0;i<8;i++)
      {
          String s="";
          for(int j=0;j<8;j++)
          {
              s=s+ar[i][j];
          }
          System.out.println(s);
      }
       System.out.println("");
   }
}
    
}
