
import java.util.Scanner;

public class PasmakGarden {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int x1=sc.nextInt();
   int y1=sc.nextInt();
   int x2=sc.nextInt();
   int y2=sc.nextInt();
   int a=Math.max(x1, x2);
   int b=Math.max(y1, y2);
   int c=Math.min(x1, x2);
   int d=Math.min(y1, y2);
   if(x1==x2&y1!=y2)
   {
       System.out.println((x1+y2-y1)+" "+y1+" "+(x2+y2-y1)+" "+y2);
   }
      if(x1!=x2&y1==y2)
   {
       System.out.println((x1)+" "+(y1+x2-x1)+" "+(x2)+" "+(y2+x1-x2));
       
   }
      if(x1!=x2&y1!=y2)
   {
       System.out.println((x1+y2-y1)+" "+(y1+x2-x1)+" "+(x2+y2-y1)+" "+(y2+x1-x2));
   
   }
}
    
}
