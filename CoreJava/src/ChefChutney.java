
import java.util.Arrays;
import java.util.Scanner;

public class ChefChutney {
    static int palindrome(String st[])
    {
        int m=0;
        String x=new String();
    for(int i=0;i<st.length;i++)
        {
    x=x+st[i];  
        }
      System.out.println(x);
    Arrays.sort(x.toCharArray());
        System.out.println(x);
    int as=0;
        for(int i=0;i<x.length()-1;i++)
    {
       if(x.charAt(i)==x.charAt(i+1))
       {
          ++as;
          i=i+1;
       }
    }
        if(as==x.length()/2||as==x.length()-1)
        {
    return 1;        
        }
        return 2;
    }
    static int combinationUtil(String arr[], String data[], int start, 
                                int end, int index, int r) 
    { 
        
    int ew=0;     
  for (int i=start-1; i<end && end-i+1 >r-index; i++) 
        { 
   if (index == r) 
        { 
  ew= palindrome(data);
            
        }
            data[index] = arr[i]; 
        return combinationUtil(arr, data, i+1, end, index+1, r); 
        }
   
            if(ew==1)
            {
                return ew;
            }
            return 0;
        
    } 
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    int n=sc.nextInt();
    String st[]=new String[t];
   for(int k=0;k<t;k++)
   {
       st[k]=sc.next();
       
   }
   for(int i=0;i<n;i++)
   {
       int x=sc.nextInt();
       if(x==1)
       {
           int y=sc.nextInt();
       String s=sc.next();
       st[y-1]=s;
       }
       if(x==2)
       {
       int y=sc.nextInt();
       int z=sc.nextInt();
 int hf=0;
       for(int l=1;l<=z-y;l++)
       {
           String data[]=new String[z-y];
      int po=  combinationUtil(st,data, y,z, 0, l); 
hf=hf+po;
       }
           System.out.println(hf);
       }
           }
}
    
}
