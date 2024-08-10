
import java.util.ArrayList;
import java.util.Scanner;

public class Cod3 {
   static int hcf(int n1, int n2) {
    if (n2 != 0)
        return hcf(n2, n1 % n2);
    else
        return n1;
}
   static int asd(ArrayList<Integer> l1)
   {
       int x=l1.get(0);
       int l=l1.size();
       for(int i=1;i<l;i++)
       {
         x=hcf(x, l1.get(i));
       }
       return x;
   }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
       }
       int u=1000000000;
       ArrayList <Integer> l1=new ArrayList<Integer>();
       for(int i=0;i<n-1;i++)
       {
       for(int j=i+1;j<n;j++)
       {
           int x=hcf(ar[i],ar[j]);
          int y=(ar[i]*ar[j])/x;
           l1.add(y);
           if(u>y)
           {
               u=y;
           }
       }
       
   }
       
    
       int po=asd(l1);
       
      
System.out.println(po);
}

}
