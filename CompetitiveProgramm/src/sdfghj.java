
import java.util.ArrayList;
import java.util.Scanner;

public class sdfghj {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       ArrayList <Integer> l1=new ArrayList<Integer>();
       l1.add(12);
       
       l1.remove(l1.size()-1);
       System.out.println(l1);
       int n=sc.nextInt();
       int ar[]=new int[n];
       char arr[]=new char[n];
       String st=" ";
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.next().charAt(0);
           
           ar[i]=sc.nextInt();
           st=st+arr[i]+" * "+ar[i]+" ";
           
       }
       
       
       System.out.println(n);
   }
}
    
}
