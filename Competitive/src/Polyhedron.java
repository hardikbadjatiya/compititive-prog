
import java.util.Arrays;
import java.util.Scanner;

public class Polyhedron {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
   String st[] = new String[n];
   int x=0; 
   for(int i=0;i<n;i++)
   {
       st[i]=sc.next();
       if(st[i].equals("Tetrahedron"))
       {
           x=x+4;
//           System.out.println(x);
       }
       if(st[i].equals("Cube"))
       {
           x=x+6;
//           System.out.println(x);
       }
       if(st[i].equals("Octahedron"))
       {
           x=x+8;
//           System.out.println(x);
       }
       if(st[i].equals("Dodecahedron"))
       {
           x=x+12;
//           System.out.println(x);
       }
       if(st[i].equals("Icosahedron"))
       {
           x=x+20;
//           System.out.println(x);
       }
       
   }
    System.out.println(x);
   
      
}
    
}
