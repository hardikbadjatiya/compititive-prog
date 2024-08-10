
import java.util.Scanner;

public class Binary {
    int binaryToDecimal(int n) 
{ 
    int num = n; 
    int dec_value = 0; 
  
    // Initializing base value to 1, i.e 2^0 
    int base = 1; 
  
    int temp = num; 
    while(temp) { 
        int last_digit = temp % 10; 
        temp = temp / 10; 
  
        dec_value += last_digit * base; 
  
        base = base * 2; 
    } 
  
    return dec_value; 
}
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=0;
   n=sc.nextInt();
  int arr[]=new int[100];
   for(int i=0;i<n;i++)
   {
      arr[i]=sc.nextInt();
      arr[i].binaryToDecimal
      
   }
   
}
        
}
