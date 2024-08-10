
import java.util.Scanner;

public class Vacations {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int r=0;
   int j[]=new int[n];
   int c[]=new int[n];;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       if(ar[i]==0)
       {
           c[i]=0;
           j[i]=0;
           
       }
        if(ar[i]==1)
       {
           c[i]=1;
           j[i]=0;
           
       } if(ar[i]==2)
       {
           c[i]=0;
           j[i]=1;
           
       } if(ar[i]==3)
       {
           c[i]=1;
           j[i]=1;
           
       }
       
   }
   int co=0;
   int jy=0;
   l1: for(int i=0;i<n;i++)
   {
       if((c[i]==0)&&(j[i]==0))
       {
           
           ++r;
           co=0;
           jy=0;
       }
       if((c[i]==1)&&(j[i]==0))
       {
          if(co==0)
          {
              
       ++co;
       jy=0;
          }
          else{
        ++r;      
          }
       }
       if((c[i]==0)&&(j[i]==1))
       {
           if(jy==0)
           { ++jy;
           co=0;
       }
           else {
               ++r;
           }
       }
       
       if((c[i]==1)&&(j[i]==1))
       {
           int p=0;
           if(co==0&&jy==1&&p==0)
           {
           ++co;
           jy=0;
           p=1;
       }
           if(co==1&&jy==0&&p==0)
           {
           ++jy;
           co=0;
           p=1;
           }
           if(jy==1&&co==1&&p==0)
           {
               ++r;
               p=1;
           }
          
           if(jy==0&&co==0&&p==0)
           {
           for(int k=i;k<n;i++)
           {
               if(c[k]==1&&j[k]==0)
               {
                  
                   ++jy;
                   break l1;
               }
               if(c[k]==0&&j[k]==1)
               {
                   ++co;
                   break l1;
               }
               
           }
           
           }
       }
   }
    System.out.println(r);
   
}
        
}
