
import static java.lang.System.out;

public class Varargs {

static void set(int...var)
{
    java.util.Arrays.sort(var);
    for (int i =0;i<var.length;i++)
    {
        System.out.println(var[i]);
    }
    int EVEN=0;
    int ODD=0;
    for(int i=0;i<var.length;i++)
    {
        if(var[i]%2==0)
        {
            java.util.Arrays.sort(var);
            out.println(var[i]);
        }
            
    }
/*    int count=0;
    int primeno=0;
    for(int i=2;i<=var.length/2;i++)
{
//for(int j=2;j<var[i];i++)
if(var[i]%i==0)
count++;
//if(count==0)
++primeno;
 out.println("no of prime found:"+primeno);
}*/
    for (int data :var)
    {
        if(data%2==0)
            ++EVEN;
        else
            ++ODD;
    }
out.println("tota no of EVEN="+EVEN+"Total no of ODD="+ODD);
}
static void sum(int...var)
{
    int SUM=0;
    for(int data:var)
    {
        SUM=SUM+data;
        
    }
    out.println("Sum of no is ="+SUM);
}
static void sort(int...var)
{
    int NUM=12;
    int FACT=0;
    
    for(int i=0;i<var.length;i++)
    {
        if(NUM==var[i])
        {
            FACT=1;
         out.println("Element found ");
break;

        }
       
//out.println("Element found ");


        }
    
   
      
     
    
}
       
   
}class MainClass

{
    public static void main(String[] args) {
        Varargs.set(100,68,585,4,25,6,5,8);
    Varargs.sum(51,525,55,0,45,52,515,115,55,5,5,5);
    Varargs.sort(51,525,55,0,45,52,515,115,55,5,5,5);
    
    }
}
