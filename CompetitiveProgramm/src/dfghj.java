
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dfghj {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String st=sc.next();
   int k=sc.nextInt();
   
   char a[]=new char[k];
   char b[]=new char[k];
  int ar[]=new int[k];
  int u=0; 
  for(int i=0;i<k;i++)
   {
       a[i]=sc.next().charAt(0);
       b[i]=sc.next().charAt(0);
       ar[i]=sc.nextInt();
       String s=a[i]+""+b[i];
       if(st.contains(s))
       {
           int index = 0, count = 0;
		while (true) {
			index = st.indexOf(s, index);
			if (index != -1) {
				count ++;
				index += s.length()+1;
			} else {
                            
				break;
			}
		}
          u=u+ar[i]*count; 
       }
       
   }
    System.out.println(u); 
  
   
}
    
}
