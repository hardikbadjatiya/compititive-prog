
import java.util.ArrayList;
import java.util.Scanner;

public class BoxNew
{
    static int [] rev(int ar[])
    {
        int n=ar.length;
        int arr[]=new int[n];
        arr[0]=ar[n-1];
        for(int i=1;i<n;i++)
        {
            arr[i]=ar[i-1];
        }
        return   arr;
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   
   for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
ArrayList <Integer>l1=new ArrayList<Integer>();     
      int max=0;
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
       if(ar[i]>max)
       {
           max=ar[i];
           
       }
       }
       int x=max;
       for(int i=0;i<n;i++)
       {
           if(ar[i]==max)
           {
               l1.add(i+1);
           }
       }
       if(l1.size()==1)
       {
           System.out.println(n/2);
       }
       else if(l1.size()>1)
       {
       for(int i=0;i<l1.size();i++)
       {
          int f=l1.get(i+1)-l1.get(i);
          int g=l1.get(i)-l1.get(i+1)+n;
          if(Math.min(f, g)!=n/2)
          {
                    
          }
       }
       }
      int l=0;
       for(int i=0;i<n/2+1;i++)
       {
          int y=0;
          for(int j=0;j<n/2;j++)
          {
           if(ar[j]==x)
               {
                ar= rev(ar);
                y=1;
                break;
               }
          }
          if(y==0)
          {
              ++l;
          }
          
       }
       System.out.println(l);
       
   }        
    }

}    

