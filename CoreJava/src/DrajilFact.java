
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DrajilFact {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String st=sc.next();
    ArrayList <Integer> l1=new ArrayList<Integer>();
 int e=0;
 int ni=0;
 int s=0;
 int f=0;
   for(int i=0;i<n;i++)
   {
       int x=Integer.parseInt(Character.toString(st.charAt(i)));
  if(x!=8&&x!=9&&x!=4&&x!=0&&x!=1&&x!=6)
  {
      l1.add(x);
  }
       if(x==8)
  {
 l1.add(7);
 l1.add(2);
 l1.add(2);
 l1.add(2);
 
  }
       if(x==6)
       {
           l1.add(5);
           l1.add(3);
       }
  if(x==9)
  {
 l1.add(7);
 l1.add(3);
 l1.add(3);
 l1.add(2);
  }
  if(x==4)
  {
      l1.add(3);
 l1.add(2);
 l1.add(2);
  }
  
   }
java.util.Collections.sort(l1);
for(int i=l1.size()-1;i>=0;i--)
{
    if(l1.get(i)!=1)
    {
    System.out.print(l1.get(i));
}}
}
        
}
