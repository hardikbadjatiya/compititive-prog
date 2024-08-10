
import java.util.Scanner;


class GFG 
{ 
  
static class Point  
{ 
    int x, y; 
  
        public Point(int x, int y)  
        { 
            this.x = x; 
            this.y = y; 
        } 
      
}; 
  
static int distSq(Point p, Point q) 
{ 
    return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y); 
} 
static boolean isSquare(Point p1, Point p2, Point p3, Point p4) 
{ 
    int d2 = distSq(p1, p2); // from p1 to p2 
    int d3 = distSq(p1, p3); // from p1 to p3 
    int d4 = distSq(p1, p4); 
  
  
    if (d2 == d3 && 2 * d2 == d4 
        && 2 * distSq(p2, p4) == distSq(p2, p3)) 
    { 
        return true; 
    } 
  
    if (d3 == d4 && 2 * d3 == d2 
        && 2 * distSq(p3, p2) == distSq(p3, p4))  
    { 
        return true; 
    } 
    if (d2 == d4 && 2 * d2 == d3 
        && 2 * distSq(p2, p3) == distSq(p2, p4)) 
    { 
        return true; 
    } 
  
    else{return false; 
} }
  
public static void main(String[] args) 
{ 
   Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int ar[]=new int[n];
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          ar[i]=sc.nextInt();
          arr[i]=sc.nextInt();
      }
    int x=0;
      for(int i=0;i<n-3;i++)
        {
            for(int j=i;j<n-3;j++)
            {
    Point p1 = new Point(ar[i], arr[i]), p2 = new Point( ar[j+1], arr[j+1] ), 
        p3 = new Point(ar[j+2],arr[j+2] ), p4 = new Point( ar[j+3], arr[j+3] ); 
                System.out.println();
    if(isSquare(p1, p2, p3, p4)==true)
{
    x=x+1;
}

            }
        }
    System.out.println(x);   
} 
} 
  