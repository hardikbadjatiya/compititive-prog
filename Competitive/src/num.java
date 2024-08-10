
import java.util.Scanner;

public class num {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       if(n==1)
       {
           System.out.println("FastestFinger");
       }
       else{
           if(n==2)
           {
               System.out.println("Ashishgup");
           }
           else{
               if(n%2!=0)
               {
                   System.out.println("Ashishgup");
               }
               else{
                   int x=2;
                   int o=0;
                   int y=0;
                   
                  for(int i=1;i<=64;i++)
                  {
                     if(n%x==0)
                     {
                         y=y+1;
                         n=n/x;
                     }
                     else{
                         break;
                     }
                  }
                        
                  int op=0;
                  while(n>1)
                  {
                      int p=0;
                  for(int i=3;i<=Math.sqrt(n);i++)
                  {
                     if(n%i==0)
                     {
                         p=1;
                         n=n/i;
                         op=op+1;
                      break;      
                     }
                     
                  }
                  if(p==0)
                  {
                      op=op+1;
                      break;
                  }
                  
                  if(y>1&&op>1)
                     {
                         break;
                     }
                     if(op>=2&&y==1)
                     {
                         break;
                     }
                  }
                  if(op==0)
                  {
                   if(y>1)
                   {
                       o=1;
                   }
                   else{
                       o=0;
                   }
                  }
                  else{
                  if(y==1)
                  {
                      if(op>=2)
                      { 
                          o=0;
                      }
                      else{
                          o=1;
                      }
                  }
                  
                  else if(y>1){
                       if(op>0)
                       {
                         o=0;  
                       }
                       else{
                           o=1;
                       }
                  }
                  }
                  if(o==1)
                  {
                      System.out.println("FastestFinger");
                  }
                  else{
                      System.out.println("Ashishgup");
                  }
               }
           }
       }
   }
}
        
}
