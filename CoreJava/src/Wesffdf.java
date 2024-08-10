
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Wesffdf {
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int p=0;p<t;p++)
   {
       int n=sc.nextInt();
       int k=sc.nextInt();
       String st[]=new String[n];
      int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           st[i]=sc.next();
           ar[i]=st[i].length();
       }
         ArrayList <Integer> l1=new ArrayList<Integer>();
       Arrays.sort(ar);
       int x=1;
       for(int i=0;i<n-1;i++)
       {
           
           if(ar[i]==ar[i+1])
           {
              x=x+1;
              if(i+1==n-1)
              {
              l1.add(x);
              }
           }
           if(ar[i]!=ar[i+1])
           {
               l1.add(x);
                x=1;
                if(i+1==n-1)
                {
                    l1.add(x);
                }
           }
       }
       int e=0;
       for(int i=0;i<l1.size();i++)
       {
           if(l1.get(i)<k||l1.get(i)%k!=0){
           e=1; 
      break;
           }
       }
       if(e==1)
       {
               System.out.println("Not possible");
           
       }
       else{
       System.out.println("Possible");
           
       }
   }
   
}
    
}
