
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class dfghfg {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       LinkedHashSet <Integer> h= new LinkedHashSet<Integer>();
       for(int i=0;i<2*n;i++)
       {
          int x=sc.nextInt();
          h.add(x);
       }
       String s="";
       for(int i:h)
       {
         s=s+i+" ";
       }
       System.out.println(s);
   }
}
    
}
