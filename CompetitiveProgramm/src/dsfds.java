
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.A;

public class dsfds {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   while(a-->0)
   {
       int n=sc.nextInt();
       int q=sc.nextInt();
       String st=sc.next();
       char ar[]=new char[n];
       ar = st.toCharArray(); 
       Arrays.sort(ar);
       long t=st.chars().distinct().count();
       ArrayList <Integer>l1=new ArrayList<Integer>();
       int l=1;
       for(int i=0;i<n-1;i++)
       {
       if(ar[i]==ar[i+1])
       {
           ++l;
       if(i==n-2)
       {
           l1.add(l);
       }
       }
       if(ar[i]!=ar[i+1])
       {
           l1.add(l);
       }
   }
       java.util.Collections.sort(l1);
       for(int i=0;i<q;i++)
       {
           int y=sc.nextInt();
           for(int j=0;j<l1.length();j++)
           {
               
           }
       }
   }
}
    
}
