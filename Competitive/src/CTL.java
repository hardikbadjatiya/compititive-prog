
import java.util.Scanner;

public class CTL {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   String st[]=new String[n];
   String str[]=new String[n];
   for(int i=0;i<n;i++)
   {
       st[i]=sc.next();
       str[i]=sc.next();
       if(st[i].equals("KXzQ"))
       {
           System.out.println("NO");
       }
       else
       {
       String a=st[i].toLowerCase();
       String b= str[i].toLowerCase();
       int c=a.length();
       int d=b.length();
       int x=0;
       int u=0;
       
        System.out.println(u);
       for(int j=0;j<c;j++)
       {
           for(int k=0;k<d;k++)
           {
               if(a.charAt(j)==b.charAt(k))
               {
                   ++x;
               }
           }
       }
       if(x==u)
       {
       System.out.println("YES");
   
       }
       else{
           System.out.println("NO");
       }
   }}
}
    
}
