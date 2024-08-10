
import java.util.Arrays;
import java.util.Scanner;

public class GreaterNumber {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   long a=sc.nextLong();
   long b=sc.nextLong();
   String q=Long.toString(a);
   String p=Long.toString(b);
   int w=q.length();
   
   char ar1[]=new char[w];
   char ar2[]=new char[p.length()];
   int arr[]=new int[w];
   for(int i=0;i<w;i++)
   {
       ar1[i]=q.charAt(i);
       ar2[i]=p.charAt(i);
       arr[i]=0;
   }
   Arrays.sort(ar1);
   String st="";
    l1: for(int j=0;j<w;j++)
{
    int x=0;
    for(int i=0;i<w;i++)
   {
         
       if(ar1[i]==ar2[j]&&arr[i]==0)
       {
           x=1;
           st=st+ar1[i];    
           arr[i]=1;
           break;
      } 
       
       if(ar1[i]>ar2[j]&&arr[i]==0&&x==0)
       {
      x=1;
      st=st+ar1[i];
      arr[i]=1;
           break l1;
       }
   }
   
    
   }
  for(int i=0;i<w;i++)
  {
      if(arr[i]==0)
      {
          st=st+ar1[i];
      }
  }
    System.out.println(st);
 if(st.length()<w)
    {    System.out.println(-1);
    System.exit(0);
    }
}

}
