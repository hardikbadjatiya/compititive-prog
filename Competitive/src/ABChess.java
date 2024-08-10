
import java.util.Scanner;

public class ABChess {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
 String st[]=new String[8];
 int x=0;
 int y=0;
 for(int i=0;i<8;i++)
 {
     st[i]=sc.next();
     for(int j=0;j<8;j++)
     {
         if(st[i].charAt(j)=='q')
         {
         x=x+9;    
         }
         if(st[i].charAt(j)=='r')
         {
         x=x+5;    
         }
         if(st[i].charAt(j)=='b')
         {
         x=x+3;    
         }
         if(st[i].charAt(j)=='n')
         {
         x=x+3;    
         }
         if(st[i].charAt(j)=='p')
         {
         x=x+1;    
         }
         if(st[i].charAt(j)=='Q')
         {
         y=y+9;    
         }
         if(st[i].charAt(j)=='R')
         {
        y=y+5;    
         }
         if(st[i].charAt(j)=='B')
         {
         y=y+3;    
         }
         if(st[i].charAt(j)=='N')
         {
         y=y+3;    
         }
         if(st[i].charAt(j)=='P')
         {
         y=y+1;    
         }
         
     }
 }
if(x>y)
{
    System.out.println("Black");
}
if(x==y)
{
    System.out.println("Draw");
}
if(x<y)
{
    System.out.println("White");
    System.out.println("Hello");
}
}
}
