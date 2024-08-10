
import java.util.Arrays;
import java.util.Scanner;

public class Ultrafastmaths {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String str=sc.next();
   String st=sc.next();
   int l=str.length();
   char arr[]=str.toCharArray();
   char ar[]=st.toCharArray();
   int[] a=new int[l];
   for(int i=0;i<l;i++)
   {
       if(arr[i]==ar[i])
       {
          a[i]=0;
       }
       else{
           a[i]=1;
       }
   }
   for(int i=0;i<l;i++)
   {
       System.out.print(a[i]);
   }
}
    
}
