import java.util.Scanner ;
public class Main{
    public static void main (String[] ar)
    {Scanner sc=new Scanner(System.in);
    
    int x=sc.nextInt();
    if(x==0)
    {
        System.out.println("1");
        System.exit(0);
    }
    int a=x%4;
    int y=0;
    if(a==1){
        y=8;
    }
    if(a==2){
        y=4;
    }
    if(a==3){
        y=2;
    }
    if(a==0){
        y=6;
    }
    
    System.out.println(y);
}
}