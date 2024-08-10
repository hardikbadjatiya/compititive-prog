
import java.util.ArrayList;
import java.util.Scanner;

public class JourneyPlanning {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
       ArrayList <Integer> l1=new ArrayList<Integer>();
   for(int i=0;i<n;i++)
   {
           int m=0;
       for(int j=0;j<n;j++)
       {
           if(ar[j]-ar[i]==j-i)
           {
               m=m+ar[j];
           }
       }
       System.out.println(m);
       l1.add(m);
   }
   java.util.Collections.sort(l1);
    System.out.println(l1.get(0));
}
    
}
