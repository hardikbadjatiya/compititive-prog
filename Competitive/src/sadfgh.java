
import java.util.Scanner;
import java.util.Stack;

public class sadfgh {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int t=sc.nextInt();
    for(int o=1;o<=t;o++)
    {
    int n=sc.nextInt();
    String st=sc.next();
    Stack <Character> a=new Stack<Character>();
    Stack <Character> b=new Stack<Character>();
    for(int i=0;i<n;i++)
    {
        if(st.charAt(i)=='A')
        {
            a.add('A');
        }
        if(st.charAt(i)=='B')
        {
            b.push('B');
        }
        if (b.size() >= 2   )
      {
          if( a.size() >= 1)
          {
             
        b.pop();
          a.pop();
          }
      }
      else if (b.size() >= 1  )
      {
          if(a.size() >= 2)
          {
        a.pop();
        b.pop();
      }
      }
        
    }
        System.out.println("Case #"+(o)+":");
    if (a.size() + b.size() > 1)
            System.out.println("N");
    else
            System.out.println("Y");

    }
   
   
}
    
}
