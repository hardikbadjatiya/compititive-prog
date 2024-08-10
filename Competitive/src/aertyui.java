
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class aertyui {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
   int z=sc.nextInt();
    int r[]=new int[x];
   int g[]=new int[y];
   int b[]=new int[z];
   ArrayList <Integer> l1 =new ArrayList<>();
   ArrayList <Integer> l2 =new ArrayList<>();
   ArrayList <Integer> l3 =new ArrayList<>();
   
   for(int i=0;i<x;i++)
   {
       r[i]=sc.nextInt();
       l1.add(r[i]);
   }
   for(int i=0;i<y;i++)
   {
       g[i]=sc.nextInt();
       l2.add(g[i]);
   }
   for(int i=0;i<z;i++)
   {
       b[i]=sc.nextInt();
       l3.add(b[i]);
   }
   int o=0;
   Collections.sort(l1);
    Collections.sort(l2);
   Collections.sort(l3);
    
    while((l1.size()>0&&l2.size()>0)||(l2.size()>0&&l3.size()>0)||(l1.size()>0&&l3.size()>0))
    {
       if(l1.get(l1.size()-1)>=l2.get(l2.size()-1)&&l1.get(l1.size()-1)>=l3.get(l3.size()-1)) 
       {
           
       }
           }
}
    
}
