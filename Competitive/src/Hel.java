public class Hel {
    public static void main(String[] args) {
    long x=0;
    for(int i=1;i<101;i++)
    {
        for(int j=1;j<101;j++)
        {
            if(i<j)
            x=x+i*j;
        }
    }
    System.out.println(x);
}
    
}
