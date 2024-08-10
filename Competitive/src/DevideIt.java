import java.util.*;
import java.lang.*;
import java.io.*;
class DevideIt
 {
	public static void main (String[] args)
	 {
	     Scanner sc=new Scanner (System.in);
	     int n=sc.nextInt();
             
             while(n>0)
	     {
                 n--;
                 int a=sc.nextInt();
	         int s=sc.nextInt();
	         int ar[]=new int[a];
	         for(int j=0;j<a;j++)
	         {
	          ar[j]=sc.nextInt();   
	         }
                 int x=0;
                 label:
                 for(int l=0;l<a;l++)
	         {
                     int sum=0;
	     
	             for(int k=l;k<a;k++)
	             {
                         
	                 sum=sum+ar[k];
                         if(sum==s)
	                 {
                             System.out.println((l+1)+" "+(k+1) );
	                     x++;
                             break label;
	                 }
	             }
	         }
                 if(x==0){
	                System.out.println("-1");
                 
                 }
                    x=0;
             }
	 }
}