public class Test2 {
    public static int sa(int num1)
    {
        if(num1!=0)
        {
            return (num1+2)+sa(num1-1);
        }
        else
        {
            return 3;
        }
    }
    public static int sa2(int num2)
    {
        if(num2!=0)
        {
            return sa(num2)+sa2(num2-1);
        }
        else
        {
            return 0;
        }
    }
    
public static void main(String[] args) {
    System.out.println(sa2(5));
    
}
    
}
