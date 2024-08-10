
import java.util.ArrayList;
import java.util.Scanner;

public class ase {
     public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String st[]=new String[6];
   float x=0;
   ArrayList <String> l1=new ArrayList<String>();
   int a[]=new int[6];
   ArrayList <String> l2=new ArrayList<String>();
   int b[]=new int[6];
   String s="ABCDEF";
   
   for(int i=0;i<6;i++)
   {
      String sr=s.charAt(i)+"Cov"+"(";
      l1.add(sr);
      l2.add("("+s.charAt(i)+")");
      
   }
   for(int i=0;i<6;i++)
       {
           st[i]=sc.next();
           int len=st[i].length();
           String e=st[i].substring(0,len-2);
           String r=  st[i].substring(len-3);
           
           for(int j=0;j<6;j++)
           {
             if(r.contains(l2.get(j)))
             {
                 if(b[j]==0)
                 {
                  ++x;
                  b[j]=1;
                 break;
                 }
                 
             }
           }
           for(int j=0;j<6;j++)
           {
             if(e.contains(l1.get(j)))
             {
                 if(a[j]==0)
                 {
                  ++x;
                  a[j]=1;
                 break;
                 }
             }
           }
           
       }
         System.out.println((x/2)+" out of 6");
   
}
    
}
