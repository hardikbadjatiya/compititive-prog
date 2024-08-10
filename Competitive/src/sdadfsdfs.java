
import java.util.Scanner;
import java.util.TreeSet;

public class sdadfsdfs {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int u=-1;
       if(n%2!=0)
       {
           TreeSet  <Integer> l1=new  TreeSet<Integer>();
       for(int i=2;i<=Math.sqrt(n);i++)
       {
           if(n%i==0)
           {
               
               l1.add(i);
               l1.add(n/i);
               
               u=i;
           }
       }
       if(u>-1)
       {
             System.out.println(l1.last()+" "+(n-l1.last()));   
       }
       else{
           System.out.println(1+" "+(n-1));
       }
       }
       else{
           System.out.println((n/2)+" "+(n/2));
       }
   }
}
    
}
