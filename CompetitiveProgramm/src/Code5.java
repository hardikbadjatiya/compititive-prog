
import java.util.ArrayList;
import java.util.Scanner;

public class Code5 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
   
     for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       String st=" ";
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           st=st+ar[i]+" ";
       }
       ArrayList <Integer>l1=new ArrayList<Integer>();
       ArrayList <Integer>l2=new ArrayList<Integer>();
       for(int i=0;i<n-1;i++)
       {
           long u=0;
           int r=0;
           long pew=0;
           for(int j=0;j<=i;j++)
           {
               u=u+ar[j];
           }
           if(2*u==((i+1)*(i+2)))
           {
               r=1;
               if(r==1)
           {
              long l=0;
               for(int j=i+1;j<n;j++)
           {
             l=l+ar[j];
           }
               
               if(2*l==(n-(i+1))*(n+1-(i+1)))
               {
                   pew=1;
               }
           }
           }
           
               if(r==1&&pew==1)
               {
                   l1.add(i+1);
           l2.add(n-(i+1));
              }
       }
        if(l1.isEmpty())
       {
           System.out.println("0");
       }
       else{
           System.out.println(l1.size());
           for(int w=0;w<l1.size();w++)
           {
               System.out.println(l1.get(w)+" "+l2.get(w));
           }
       }
       
       
}
}
}
