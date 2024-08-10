
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class NewClass1 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
       int ar[]=new int[n];
      int u=0;
      HashSet <Integer> s=new HashSet<Integer>();
       Arrays.sort(ar);
        
      for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           if(ar[i]==m)
           {
               ++u;
           }
      s.add(ar[i]);
       }
       int x=0;
      int p=-1;
      for(int i=0;i<s.size();i++)
      {
        if(s.contains(i+1)!=true)
        {
            
          p=i+1; 
        }
       }
      if(p==-1)
      {
          if(p==ar[n-1]+1)
          {
              System.out.println(n);  
          }
          if(p<=ar[n-1])
          {
              System.out.println(n-u);
          }
          else{
              System.out.println(-1);
          }
      }
      
      else if(p==m){
          System.out.println(n);
      }       
      else if(p>m){
          System.out.println(n-u);
      }
      else if(p<m){
          System.out.println(-1);
      }
                 
   }
}
    
}
