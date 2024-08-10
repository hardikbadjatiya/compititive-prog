
import java.util.Arrays;
import java.util.Scanner;

public class wes {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int k=sc.nextInt();
   while(k-->0)
   {
       int ar[]=new int[3];
      
       for(int j=0;j<3;j++)
       {
           ar[j]=sc.nextInt();
       }
       Arrays.sort(ar);
       int x=0;
       
       if(ar[0]<ar[1]&&ar[1]==ar[2])
       {
           x=1;
           System.out.println("YES");
           System.out.println(ar[0]+" "+ar[0]+" "+ar[1]);
       }
       if(ar[0]==ar[1]&&ar[1]==ar[2])
       {
           x=1;
           System.out.println("YES");
           System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
       }
       
       if(x==0)
       {
           System.out.println("NO");
       }
   }
}
    
}
