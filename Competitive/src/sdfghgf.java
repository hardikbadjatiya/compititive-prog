
import java.util.ArrayList;
import java.util.Scanner;

public class sdfghgf {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int x=4*n-1;
       long a[]=new long[x];
       long b[]=new long[x];
       ArrayList <String > s=new ArrayList<String>();
       
       for(int i=0;i<x;i++)
       {
           a[i]=sc.nextLong();
           b[i]=sc.nextLong();
          String u=" "+a[i]+" * "+b[i]+" ";
          s.add(u);
       }
       
       int ar[]=new int[x];
       for(int i=0;i<x-1;i++)
      {
          
          for(int j=i+1;j<x;j++)
          {
             if(a[i]==a[j])
             {
             ++ar[i];
             ++ar[j];
             }
             if(b[i]==b[j])
             {
                 ++ar[i];
                 ++ar[j];
             }
          }
      }
     long ae[]=new long[3];
       long be[]=new long[3];
    int o=0;
       for(int i=0;i<x;i++)
      {
         if(ar[i]==1)
         {
           ae[o]=a[i];
           be[o]=b[i];
           o++;
         }
      }
       int po=0;
      long hg=0;
      long gh=0;
     for(int i=0;i<3;i++)
     {
    for(int k=0;k<3;k++)
    {
        
       if(ae[i]!=ae[k]&&be[i]!=be[k])
       {
      hg=ae[i]+ae[k];
      gh=be[i]+be[k];
       po=i+k;
       break;
       }
    }
    if(po>0)
    {
        
        break;
    }
     }
       System.out.println((hg-ae[3-po])+" "+(gh-be[3-po])); 
  
   }
      
}
    
}
