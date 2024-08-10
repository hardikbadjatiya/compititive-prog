
import java.util.Scanner;

public class Hello {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String str =sc.next();
   int n=str.length();
   char arr[]=new char[n];
   for(int i=0;i<n;i++)
   {
    arr[i]=str.charAt(i);
    if(str.contains("h"))
    {
        if(str.contains("e"))
        {
            if(str.contains("ll"))
            {
                if(str.contains("o"))
                {
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");
        }
        else
            System.out.println("No");
    }
    else
    System.out.println("NO");
   }
    System.out.println(arr);
}
    
}
