
import java.util.Scanner;

public class TwoRegularPolygon {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
  while(n-->0)
  {
    int x=sc.nextInt();
    int y=sc.nextInt();
    if(Math.max(x, y)%Math.min(x,y)==0){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
  }
}
    
}
