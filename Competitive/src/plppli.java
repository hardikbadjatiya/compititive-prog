
import java.util.HashSet;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  
    Scanner scc= 
           new Scanner (System.in);

    long lk=scc.nextLong();
   
    while(lk-->0)
   {
       int n=scc.nextInt();
     
       long arwr[]=new long[n];
       
       HashSet <Long> hsso
               
               =new 
        HashSet<Long>();
    long uo=0;
       
       for(int it=0;it<n;it++)
       {
           arwr[it]=scc.nextLong();
           hsso.add(arwr[it]);
       }
      
       
       for(int po=0;po<n-1;po++)
       {
           long e=arwr[po];
           long opp=0;
          for(int j=po+1;j<n;j++)
          {
             e=e|arwr[j];
             
             if(hsso.contains(e))
             {
              
                 opp=1;
                 break;
             }
             else{
                 
                 hsso.add(e);
             }
          }
          
          if(opp==1)
          {    uo=1;
          break;
       }
       }
       if(uo==0)
       {
           
           System.out.println("YES");
       }
       else{
        
           System.out.println("NO");
       }
   }
       }
    
}
