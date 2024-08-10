
import java.util.Arrays;
import java.util.Scanner;

 class PerfectInteger {
static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
int ar[]=new int[5];
for(int i=0;i<5;i++)
{
    ar[i]=sc.nextInt();
    
}
Arrays.sort(ar);
for(int i=0;i<5;i++)
{
    System.out.println(ar[i]);
}

}
    
}
