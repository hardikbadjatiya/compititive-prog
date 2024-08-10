
import java.util.ArrayList;
import java.util.Scanner;

public class Arr {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
      ArrayList <Integer> l1=new ArrayList<Integer>();
      
   for(int i=0;i<n;i++)
   {
       int x=sc.nextInt();
       if(x==1)
       {
           int y=sc.nextInt();
      l1.add(y);
       
       }
       if(x==2)
       {
           int y=sc.nextInt();
        if(l1.contains(y))
        {
            int p=l1.indexOf(y);
            l1.remove(p);
        }
        else{
            System.out.println("-1");
        }
       }
            java.util.Collections.sort(l1);
      
       if(x==3)
       {
           if(l1.isEmpty())
           {
               System.out.println("-1");
           }
           else{
               System.out.println(l1.get(l1.size()-1));   
           }
       }
       if(x==4)
       {
           if(l1.isEmpty())
           {
               System.out.println("-1");
           }
           else{
           
               System.out.println(l1.get(0));   
           }
       }
   }
   
}
    
}
