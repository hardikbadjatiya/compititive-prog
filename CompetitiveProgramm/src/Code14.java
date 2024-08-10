
import java.util.Arrays;
import java.util.Scanner;

public class Code14 {
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
       String st="";
       for(int i=0;i<n-1;i++)
       {
         
           st=st+ar[i]+" ";
           for(int j=i+1;i<n;i++)
           {
               if(ar[j]>ar[i])
               {
                   System.out.println("NOT POSSIBLE");
              }
               else{
                   System.out.println(st);
               break;
               }
           }
       }
          for(int i=0;i<n;i++)
       {
           
           
       }
       String stt=" ";
       
       for(int i=0;i<n;i++)
       {
           stt=stt+ar[i]+" ";
           int o=0;
           
           for(int j=0;j<n;j++)
           {
               if(ar[i]==arr[j])
               {
               o=j;
               break;
               }
           }
           int e=0;
           for(int p=o;p<n;p++)
           {
               String s=" "+ar[p]+" ";
               if(stt.contains(s))
               {
                   e=1;
                   break;
               }
           }
           for(int p=n-1-i+o;p>=o;p--)
           {
               System.out.println(arr[p]);
           }
                              
       }
    }

}    
}
