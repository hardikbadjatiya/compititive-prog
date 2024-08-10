
import java.util.ArrayList;
import java.util.Scanner;

public class ploo {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   int x=n/k;
   String s="";
   String st="abcdefghijklmnopqrstuvwxyz";
   char ch[]=st.toCharArray();
   
   ArrayList <Character > l1=new ArrayList<Character>();
   for(int i=0;i<k;i++)
   {
       l1.add(ch[i%26]);
       
   }
   
   java.util.Collections.sort(l1);
   for(int i=0;i<k;i++)
   {
       s=s+l1.get(i);
   }
    System.out.println(s);
   String r="";
   for(int i=0;i<x;i++)
   {
       r=r+s;
   }
    System.out.println(r);
}
    
}
