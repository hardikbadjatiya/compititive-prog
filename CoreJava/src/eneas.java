
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class eneas {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  for(int p=0;p<t;p++)
  {
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
          ArrayList <Integer> l1=new ArrayList<Integer>();
          ArrayList <Integer> l2=new ArrayList<Integer>();
          ArrayList <Integer> l4=new ArrayList<Integer>();
          ArrayList <Integer> l3=new ArrayList<Integer>();
      
  
      for(int i=0;i<n;i++)
      {
        if(arr[i]%2!=0)
        {
            l1.add(arr[i]);
            
        }
        if(arr[i]%2==0)
        {
            l2.add(arr[i]);
               
        }
      }
      int x=1;
      int y=0;
      int o=0;
     for(int i=0;i<l1.size()-1;i++){
         if(l1.get(i)==l1.get(i+1)){
      ++x;
      
      if(i==l1.size()-2)
      {
          l3.add(x);
      }  
     }
         else{
             l3.add(x);
             x=1;
      if(i==l1.size()-2)
      {
          l3.add(x);
      }
         }
      if(l4.get(i)>1)
                 {
         o=o+l4.get(i);
     }}
     for(int i=0;i<l2.size()-1;i++){
         if(l2.get(i)==l2.get(i+1)){
      ++y;
        if(i==l2.size()-2)
      {
          l4.add(y);
      }
      
     }
         else{
             l4.add(y);
             y=1;
      if(i==l2.size()-2)
      {
          l4.add(y);
      }
         }
         if(l4.get(i)>1)
                 {
         o=o+l4.get(i);
     }}
      System.out.println(n-o);
     
  }
}
        
}

