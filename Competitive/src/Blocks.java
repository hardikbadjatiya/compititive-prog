
import java.util.Arrays;
import java.util.Scanner;

public class Blocks {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String st=sc.next();
   int b=0;
   int w=0;
   int l=st.length();
   int ar[]=new int[l];
   int arr[]=new int[l];
   for(int i=0;i<l;i++)
   {
       arr[i]=i+1;
       if(st.charAt(i)=='W')
       {
        w++;
        ar[i]=1;
        
       }
       else if(st.charAt(i)=='B'){
           b++;
           ar[i]=0;
       }
   }
    System.out.println(Arrays.toString(ar));
}
    
}
