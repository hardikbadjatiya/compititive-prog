
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sdsdfsf {
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
       l1:for(int i=0;i<x-1;i++)
      {
          if(ar[i]==0)
          {
          for(int j=i+1;j<x;j++)
          {
             if(a[i]!=a[j]&&a[i]!=b[j]&&b[i]!=b[j]&&b[i]!=a[j]&&ar[j]==0)
             {
             String p=" "+a[i]+" * "+b[j]+" ";
             String q=" "+a[j]+" * "+b[i]+" ";
             if(s.contains(p)!=true&&s.contains(q))
             {
                 System.out.println(a[i]+" "+b[j]);
                    break l1;
             }
//                
//                ar[i]=1;
//                ar[j]=1;
//                int r=0;
//                for(int l=0;l<x;l++)
//                {
//                   if(a[l]==a[i]&&b[l]==b[j])
//                   {
//                       r++;
//                       ar[l]=1;
//                   }
//                   if(a[l]==a[j]&&b[l]==b[i])
//                   {
//                       r++;
//                       ar[l]=1;
//                   }
//                   if(r==2)
//                   {
//                       break;
//                   }
//                }
//                 
             if(s.contains(q)!=true&&s.contains(p))
             {
                 System.out.println(a[j]+" "+b[i]);
                    break l1;
            
             }      
             }
             }
          }
      }
       long ae[]=new long[3];
       long be[]=new long[3];
    int o=0;
       for(int i=0;i<x;i++)
      {
         if(ar[i]==0)
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
