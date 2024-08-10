
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class okds {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   ArrayList <Long> l1=new ArrayList<Long>();
   int n=sc.nextInt();
   while(n>0)
   {
       long h=sc.nextLong();
       l1.add(h);
    System.out.println("sd "+l1);
       
   }
   java.util.Collections.sort(l1);
    System.out.println(l1.size());
}
    
}
