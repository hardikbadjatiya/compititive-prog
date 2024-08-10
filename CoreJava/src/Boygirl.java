import java.util.*;
public class Boygirl {
public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   int n=0;
   //n=sc.nextInt();
   String str=new String();
   str=sc.next();
   n=str.length();
   char ar[]=new char[n];
   
       if(str.chars().distinct().count()%2==0)
       {
           System.out.println("CHAT WITH HER!");
       }
       
   else
           System.out.println("IGNORE HIM!");
}
    
}
