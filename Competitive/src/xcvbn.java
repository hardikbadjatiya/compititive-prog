
import java.util.ArrayList;
import java.util.Scanner;

public class xcvbn {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int x=sc.nextInt();
   int ar[]=new int[n];
   ArrayList <String> l1=new ArrayList<String>();
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       if(ar[i]==x)
       {
           String e=""+i;
         l1.add(e);
       }
   }
   int k=sc.nextInt();
   for(int i=0;i<k;i++)
   {
       int a=sc.nextInt();
       if(a==1)
       {
           int c=sc.nextInt();
           int  d=sc.nextInt();
           int o=sc.nextInt();
           int p=0;
           int u=-1;
           for(int j=0;j<l1.size();j++)
           {
               if(Integer.parseInt(l1.get(j))>=c-1&&Integer.parseInt(l1.get(j))<=d-1)
               {
                   p++;
                   if(p==o)
                   {
                       
                    u=Integer.parseInt(l1.get(j))+1;
                    break;
                   }
               }
               if(Integer.parseInt(l1.get(j))>d)
               {
                   break;
               }
           }
           System.out.println(u);
       }
       if(a==2)
       {
           int p=sc.nextInt();
           int o=sc.nextInt();
           if(ar[p-1]==x)
           {
               String jl=""+(p-1);
               l1.remove(jl);
              ar[p-1]=o;
           }
           else{
               ar[p-1]=o;
           }
       }
   }
}
    
}
