
import java.util.ArrayList;
import java.util.Scanner;

public class weweew {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int m=sc.nextInt()
               ;
      ArrayList <Integer> l1 =new  ArrayList<Integer>();
      ArrayList <Integer> l2 =new  ArrayList<Integer>();
      for(int i=0;i<n;i++)
      {
          int x=sc.nextInt();
          l1.add(x);
      }
      
      for(int i=0;i<m;i++)
      {
          int x=sc.nextInt();
          l2.add(x);
      }
      if(n<m)
      {
          int u=1;
          String p="";
      for(int i=0;i<n;i++)
      {
           int r=l1.get(i);
           if(l2.contains(r))
           {
               u--;
                   p=p+r+" ";
              if(u==0)
               {
                   break;
               }
           }
               
      }
      if(u==0)
      {
          System.out.println("YES");
          System.out.println(1+" "+p);
      }
      else{
          System.out.println("NO");
      }
      }
      if(n>=m)
      {
          int u=1;
          String p="";
      for(int i=0;i<m;i++)
      {
           int r=l2.get(i);
           if(l1.contains(r))
           {
               u--;
                   p=p+r+" ";
              if(u==0)
               {
                   break;
               }
           }
               
      }
      if(u==0)
      {
          System.out.println("YES");
          System.out.println(1+" "+p);
      }
      else{
          System.out.println("NO");
      }
      }           
   }
}
    
}
