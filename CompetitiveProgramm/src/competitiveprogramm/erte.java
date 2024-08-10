package competitiveprogramm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class erte {
    static int find(int arr[],int x)
    {
        int w=0;
        for(int i=0;i<arr.length;i++)
        {
            if(x==arr[i])
            {
                w=i;
                break;
            }
        }
    return w;
    }
    
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    for(int k=0;k<t;k++)
    {
       int n=sc.nextInt();
       int ar[]=new int[n];
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           arr[i]=ar[i];
       }
       
       Arrays.sort(arr);
      String st=" ";
      String q=" ";
      for(int i=0;i<n;i++)
       {
       st=st+ar[i]+" ";
        int l=find(arr,ar[i]);
        int y=0;
      for(int j=n-1;j>=l;j--)
      {
          String s=" "+arr[j]+" ";
          if(st.contains(s)!=true)
          {
              y=1;
              break;
          }
      }
      if(y==1)
      {
          System.out.println("NOT");
      }
      
      if(y==0)
      {
          
          for(int o=n-1;o>=l;o--)
          {
              String h=" "+arr[o]+" ";
              if(q.contains(h)!=true)
              {
                  System.out.println(arr[o]);
                  q=q+arr[o]+" ";
              }
          }
      }
       }
    }
}    
}
