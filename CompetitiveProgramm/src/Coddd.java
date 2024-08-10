
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Coddd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
  while(a-->0)
  {
      int n=sc.nextInt();
      int ar[]=new  int[n];
      
      for(int i=0;i<n;i++)
      {
        ar[i]=sc.nextInt();
        
       }
      Arrays.sort(ar);
      int x=1;
      int min=1;
      int max=1;
      ArrayList <Integer> l1=new ArrayList<Integer>();
      
      for(int i=0;i<n-1;i++)
      {
        if(ar[i+1]-ar[i]<=2)
        {
            x++;
        if(i==n-2)
        {
            l1.add(x);
        
        }
        }
        if(ar[i+1]-ar[i]>2)
        {
            if(x>=1)
            {
           
                l1.add(x);
            x=1;
          
            }
            if(i==n-2)
            {
                l1.add(x);
            }
        }
          }
      java.util.Collections.sort(l1);
      System.out.println(l1.get(0)+" "+l1.get(l1.size()-1));
      
    }
  
}
    
}
