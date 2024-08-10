
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue; 
 
public class ertyuio {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   ArrayList <Long> l1=new ArrayList<Long>();
   Queue <Integer> q=new LinkedList<>();
   
     
   for(int i=0;i<n;i++)
   {
    int x=sc.nextInt();
    q.add(x);
   }
   long a=0;
   long b=0;
   int l=0;
   while(q.isEmpty()!=true)
   {
       if(l%2==0&&q.isEmpty()!=true)
       {
       l++;
     
       }
   }
   while(l1.size()!=0)
   {
       
      if(l%2==0&&l1.size()>0)
      {
          l++;
          if(l1.get(l1.size()-1)>l1.get(0))
          {
             a=a+l1.get((l1.size()-1));
              l1.remove((l1.size()-1));
          }
          else{
             a=a+l1.get(0);
             l1.remove(0);
              
          }
      }
      
      if(l%2==1&&l1.size()>0)
      {
              l++;
          if(l1.get(l1.size()-1)>l1.get(0))
          {
             b=b+l1.get((l1.size()-1));
              l1.remove((l1.size()-1));
          }
          else{
             b=b+l1.get(0);
             l1.remove(0);
              
          }
      
      }
   }
    System.out.println(a+" "+b  );
   
}
    
}
