
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ok {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       TreeSet <Integer> ts=new TreeSet<>();
       for(int i=0;i<n;i++)
       {
           int x=sc.nextInt();
           ts.add(x);
       }
     Iterator<Integer> it =    ts.iterator();
      
      int current = 0;
      int rev=0;
       int max=0;
      while (it.hasNext() ) 
        {
        current = it.next();
        if(max<current-rev)
        {
            max=current-rev;
        }
        rev=current;
        
        }
       System.out.println(max);
   }
   
}
        
}
