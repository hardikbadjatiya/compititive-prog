
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sdghfdfd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       ArrayList <Integer> l1=new ArrayList<Integer>();
       ArrayList <Integer> l2=new ArrayList<Integer>();
      int ar[]=new int[n];
      int max=0;
      
      for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           if(ar[i]>max)
           {
               max=ar[i];
           }
       }
       int arr[]=new int[max+1];
       
       for(int i=0;i<n;i++)
       {
           
       arr[ar[i]]++;
       
       }
       
        int x=1;
           String w=" ";
           String st=" "+ar[0]+" ";
           int l=0;
       for(int i=0;i<max+1;i++)
       {
           if(arr[i]!=0)
           {
               if(l1.contains(arr[i])!=true)
               {
                   l1.add(arr[i]);
           }else
               {
                   l=1;
                   break;
               }
               
           }
       }
       if(l==0)
       {
       for(int i=1;i<n;i++)
           {
          
            if(ar[i]!=ar[i-1])
           {
               String s=" "+ar[i]+" ";
               if(st.contains(s)!=true)
              {
                   
                st=st+ar[i]+" ";
               
              }
               else{
                   l=1;
                   break;
               }
            
           }
       
            }
       
       }
       if(l==1)
       {
           System.out.println("NO");
       }
       else{
           System.out.println("YES");
       }
   }     
}
    
}
