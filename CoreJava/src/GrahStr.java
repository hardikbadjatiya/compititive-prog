
import java.util.ArrayList;
import java.util.Scanner;

public class GrahStr {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String st=sc.next();
   ArrayList <Integer> l1=new ArrayList<Integer>();
   
   String s="AEIOUY";
   l1.add(1);
   for(int i=0;i<st.length();i++)
   {
       char c=st.charAt(i);
       if(s.contains(Character.toString(c)))
       {
           l1.add(i+2);
       }
   }
   l1.add(st.length()+2);
   if(l1.size()==2)
   {
       System.out.println(st.length()+1);
       System.exit(0);
   }
   int max=1;
   for(int i=0;i<l1.size()-1;i++)
   {
   int x=l1.get(i+1)-l1.get(i);
   if(x>max)
   {
       max=x;
   }
   }
    System.out.println(max);
   
}
    
}
