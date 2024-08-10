
import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int k=sc.nextInt();
       
       String st=sc.next();
       int x=0;
       ArrayList <Integer> l1=new ArrayList<Integer>();
       for(int i=0;i<n;i++)
       {
          if(st.charAt(i)=='1')
          {
             l1.add(i);
          }
           
       }
       int y=0;
       
       if(l1.size()==0)
       {
       y=1+(n-1)/(k+1); 
       }
        int p=0;  
       if(l1.size()==1)
       {
      p=  l1.get(0);
      y=p/(k+1);
      y=y+(n-1-p)/(k+1);
       }
       else if(l1.size()>=2)
       {
      p=  l1.get(0);
      y=p/(k+1);
      y=y+(n-1-l1.get(l1.size()-1))/(k+1);
            
        for(int i=0;i<l1.size()-1;i++)
        {
           y=y+((l1.get(i+1)-l1.get(i))/(2*k+2));
        }
       }  
       System.out.println(y);
   }
}
    
}
