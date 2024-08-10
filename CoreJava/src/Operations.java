
import java.util.Scanner;


public class Operations {
    public static void main(String[] args) {
        System.out.println("Choose the figure to find area");
        System.out.println("1 Circle");
                System.out.println("2 Triangle");
                        System.out.println("3 Rectangle");
            
        Scanner sc=new Scanner(System.in);
        byte choice=sc.nextByte();
        switch(choice)
        {
            case 1:
                System.out.println("Enter radius");
                float radi=sc.nextFloat();
                float area=3.14f*radi*radi;
                System.out.println("Area:"+area);
                break;
               
            case 2:
                System.out.println("Enter base");
                float base=sc.nextFloat();
                System.out.println("Enter ht");
                float ht=sc.nextFloat();
                float area1=0.5f*base*ht;
                System.out.println("Area:"+area1);
                break;
        
            case 3:
                System.out.println("Enter bas");
                float bas=sc.nextFloat();
                System.out.println("Enter ht1");
                float ht1=sc.nextFloat();
                float area2=bas*ht1;
                System.out.println("Area:"+area2);
        break;
        
        }
    }
}
