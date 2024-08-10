
import java.util.Arrays;
import java.util.Scanner;

public class Lecture {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   String[] st = new String[m];
   String[] stt = new String[m];
   String[] str = new String[n];
   
   for(int i=0;i<m;i++)
   {
       st[i]=sc.next();
       stt[i]=sc.next();
   }
   
   
   for(int j=0;j<n;j++)
   {
       str[j]=sc.next();
   for(int i=0;i<m;i++)
   {
       if(str[j].equals(st[i])||str[j].equals(stt[i]))
       {
           if(st[i].length()<=stt[i].length())
           {
               System.out.print(st[i]+" ");
           }
           else{
               System.out.print(stt[i]+" ");
           }
       }
   }
   }
   
}
    
}
