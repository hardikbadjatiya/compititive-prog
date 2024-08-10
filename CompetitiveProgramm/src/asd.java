
import java.util.Scanner;

public class asd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   String st[]=new  String[n];
   for(int i=0;i<n;i++)
   {
       st[i]="";
       if(i<=n/2)
       {
       for(int j=0;j<n;j++)
       {
      if(i*2==j)
      {
          st[i]=st[i]+"* ";
      }
      else{
          st[i]=st[i]+". ";
      }
      }
       }
       if(i==n/2+1&&n%2!=0)
       {
        for(int j=0;j<n;j++)
       {
       st[i]=st[i]+". ";  
       }
       }
       if(i>n/2+1&&n%2!=0)
       {
       int y=i-n/2-2;
          
       for(int j=0;j<n;j++)
       {
      if(y*2+1==j)
      {
          st[i]=st[i]+"* ";
      }
      else{
          st[i]=st[i]+". ";
      }
      }     
      }
       if(i>=n/2+1&&n%2==0)
       {
       int y=i-n/2-1;
          
       for(int j=0;j<n;j++)
       {
      if(y*2+1==j)
      {
          st[i]=st[i]+"* ";
      }
      else{
          st[i]=st[i]+". ";
      }
      }     
      }
       System.out.println(st[i]);
   
   }

}    
}
