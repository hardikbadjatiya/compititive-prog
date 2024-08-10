
import java.util.ArrayList;
import java.util.Scanner;

public class JunpVowel {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String st=sc.next();
   int l=st.length();
   String a="AEIOU";
   int first=-1;
   ArrayList l1=new ArrayList();
   
   for(int i=0;i<l;i++)
   {
String h=Character.toString(st.charAt(i));
       if(a.contains(h))
       {
          l1.add(i);
           first=i;
           break;
       }
   }
   
  
   if(first>=0)
   {
        int max=first;
        int k=first;
        for(int i=0;i<l;i++)
   {
       
       String h=Character.toString(st.charAt(i));
       if(a.contains(h))
       {
           if(i>max)
           {
              k=i;
              max = i-k;
           }
       }
   }
            System.out.println(max);

   }
}
    
}
