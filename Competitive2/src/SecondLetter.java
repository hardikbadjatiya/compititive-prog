
import java.util.ArrayList;
import java.util.Scanner;

public class SecondLetter {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String st=sc.next();
   int l=st.length();
   int k=0;
   ArrayList l1=new ArrayList();
   
   for(int i=0;i<l;i++)
   {
       for(int j=0;j<l;j++)
       {
        if(st.charAt(i)==st.charAt(j)&&i!=j)
        {   k=1;
            break;
        }
            
       }
       
       if(k==0)
       {
           l1.add(st.charAt(i));
       }
       k=0;
   }
   char ar[]=new char[l1.size()];
   
   if(l1.size()>1)
   {
    System.out.println(l1.get(1));
   }
   
}
    
}
