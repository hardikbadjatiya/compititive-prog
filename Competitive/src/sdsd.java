
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sdsd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
      int ar[]=new int[n];
     for(int i=0;i<n;i++)
     {
         ar[i]=sc.nextInt();
         
     }
     Arrays.sort(ar);
     ArrayList <Integer>l1=new ArrayList<Integer>();
     ArrayList <Integer>l2=new ArrayList<Integer>();
     l1.add(ar[0]);
     int x=0;
     for(int i=1;i<n;i++)
     {
       if(l1.contains(ar[i])!=true)
       {
       l1.add(ar[i]);
       }
       else{
           if(l2.contains(ar[i])!=true)
           {
               l2.add(ar[i]);
           }
           
          }
     }
      int a=l1.size();
       int b=l2.size();
       int u=0;
       if(l1.size()>0&&l2.size()>0)
       {
       int r=l1.get(a-1);
       int e=l2.get(b-1);
       if(r==e)
       {
           u=1;
       }
       }
       if(a+b==n&&u==0)
       {
           System.out.println("YES");
       String s="";
       
       for(int i=0;i<l1.size();i++)
       {
           s=s+l1.get(i)+" ";
       }
       for(int j=l2.size()-1;j>=0;j--)
       {
           s=s+l2.get(j)+" ";
       }
         System.out.println(s);
     }
       else{
           System.out.println("NO");
       }
   }
}
    
}
