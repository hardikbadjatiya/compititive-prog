
import java.util.LinkedHashSet;
import java.util.Scanner;

public class wewee {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
   LinkedHashSet <Integer> hs=new LinkedHashSet<Integer>();
   int n=sc.nextInt();
  for(int i=0;i<2*n;i++)
  {
      int x=sc.nextInt();
      hs.add(x);
  }
  String s="";
  for(int i:hs)
  {
      s=s+i+" ";
  }
       System.out.println(s);
   }
}
    
}
