import java.util.Scanner;
public class lilly
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     int n;
     n=Integer.parseInt(sc.nextLine());
    for(int i=1; i<=n; i++)
    {  
     System.out.print("Enter input:");
     String input = sc.nextLine();
     System.out.println(input);
    }
  }
}
