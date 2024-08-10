
import java.util.Scanner;

public class TestClsas {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       char ar[][]=new char[n][n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.next().toCharArray();
       }
       int x=0;
       for(int i=0;i<n-1;i++)
       {
           for(int j=0;j<n-1;j++)
           {
               if(ar[i][j]=='1')
               {
                   if(ar[i+1][j]!='1'&&ar[i][j+1]!='1')
                   {
                   x=1;
                   break;
                   }
                   
               }
           }
       }
       if(x==0)
       {
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
       
       
   }
}
    
}
