import java.util.Arrays;
import java.util.Scanner;
 
public class Testing
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str=new String();
        str=sc.next();
       String st= str.toLowerCase();
        if(st.contains("a")&&st.contains("b")&&st.contains("c")&&st.contains("d")&&
           st.contains("e")&&st.contains("f")&&st.contains("g")&&st.contains("h")&&
           st.contains("i")&&st.contains("j")&&st.contains("k")&&st.contains("l")&&
           st.contains("m")&&st.contains("q")&&st.contains("u")&&st.contains("x")&&
           st.contains("n")&&st.contains("r")&&st.contains("v")&&st.contains("y")&&
           st.contains("o")&&st.contains("s")&&st.contains("w")&&st.contains("z")&&
           st.contains("p")&&st.contains("t"))
        {
            System.out.println("YES");    
        }
        else{
            System.out.println("NO");
        }
    }
}