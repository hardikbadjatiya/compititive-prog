
import java.util.Scanner;

public class Table {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[][]=new int[n][n];
   for(int i=0;i<n;i++)
   {
       for(int j=0;j<n;j++)
       {
       if(i==0||j==0)
       {
           ar[i][j]=1;
       }
       else if(i==1||j==1)
       {
           ar[i][j]=i+j;
       }
       else{
           ar[i][j]=ar[i-1][j]+ar[i][j-1];
       }
       }
       
   }
    System.out.println(ar[n-1][n-1]);
   
}
    
}
