
import java.util.Scanner;
import java.util.*;
public class WeirdAlgo {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int ar[]=new int[n-1];
 if(n==2)
 {
     ar[0]=sc.nextInt();
     if(ar[0]==2)
     {
     System.out.println("1");
     System.exit(0);
 }
     else{
         System.out.println("2");
     System.exit(0);
     }
 }
 for(int i=0;i<n-1;i++)
 {
     ar[i]=sc.nextInt();
     
 }
 Arrays.sort(ar);
 for(int i=0;i<n-1;i++)
 {
     if(ar[i]!=i+1)
     {
         System.out.println(i+1);
         System.exit(0);
     }
 }
   
}
    
}
