
import java.util.Arrays;
import java.util.Scanner;

public class TowerConst {

public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    for(int k=0;k<t;k++)
    {
       int n=sc.nextInt();
       int ar[]=new int[n];
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           arr[i]=ar[i];
       }
       Arrays.sort(arr);
       String st=" ";
       String we=" ";
        for(int i=0;i<n;i++)
        {   
            st=st+ar[i]+" ";
            int s=ar[i];
            int x=0;
            for(int j=0;j<n;j++)
            {
               
                if(ar[i]<arr[j])
                {
                    String sr=" "+arr[j]+" ";
                    if(st.contains(sr)!=true)
                    {
                        x=1;
                        System.out.println("NOT POSSIBLE");
                    break;
                    }
                }
            }
            if(x==0)
            {
            System.out.println(st);
            st=" ";
            
            }
            
        }
       
    }
    
    
}
}
