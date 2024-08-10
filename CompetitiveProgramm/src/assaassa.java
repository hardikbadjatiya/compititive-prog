import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class assaassa {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
       int ar[]=new  int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
       }
       int ar1[]=new int[m];
       int ar2[]=new int[m];
   String st="";
   ArrayList <Integer > l1=new ArrayList<Integer>();
   ArrayList <Integer > l2=new ArrayList<Integer>();
    
   if(m>0)
       {
           for(int i=0;i<m;i++)
           {
               ar1[i]=sc.nextInt();
               ar2[i]=sc.nextInt();
           st=st+"* "+ar1[i]+" "+ar2[i]+" ";
               l1.add(ar1[i]);
               l2.add(ar2[i]);
                
           }
           for(int k=0;k<l2.size();k++)
               {
        
           for(int i=0;i<l2.size();i++)
           {
           for(int j=0;j<l1.size();j++)
           {
               if(l1.get(i)==l2.get(j))
               {
                   String s=" "+l2.get(i)+" "+l1.get(j)+" ";
                   String a=" "+l1.get(j)+" "+l2.get(i)+" ";
              if(st.contains(s)!=true&&st.contains(a)!=true)
               {
                   l1.add(l2.get(i));
                   l2.add(l1.get(j));
                   l2.add(l2.get(i));
                   l1.add(l1.get(j));
                   st=st+" * "+s;
               }
               }
               
           }    
           }
       }
           for(int k=0;k<l2.size();k++)
               {
        
        for(int i=0;i<l2.size();i++)
               {
           for(int j=0;j<l1.size();j++)
               {
               if(l1.get(i)==l1.get(j)&&i!=j)
               {
                 String s= " "+l2.get(i)+" "+l2.get(j)+" ";
                 String a= " "+l2.get(j)+" "+l2.get(i)+" ";
                 if(st.contains(s)!=true&&st.contains(a)!=true)
                 {
                   l1.add(l2.get(i));
                   l2.add(l2.get(j));
                  l1.add(l2.get(j));
                   l2.add(l2.get(i));
                  
                   st=st+" * "+a;
                  
                 }
               }
               
               if(l2.get(i)==l2.get(j)&&i!=j)
               {
                    String s= " "+l1.get(i)+" "+l1.get(j)+" ";
                     String a=" "+l1.get(j)+" "+l1.get(i)+" ";
                  if(st.contains(s)!=true&&st.contains(a)!=true)
                  {
                   l1.add(l1.get(i));
                   l2.add(l1.get(j));
                   l2.add(l1.get(i));
                   l1.add(l1.get(j));
    
                   st=st+ " * "+s;
                  }
               }
               }
               }
               }
       }
       int x=0;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(ar[j]==i+1)
               {
                  if(j!=i)
                   {
                   int q=ar[i];
                   ar[i]=i+1;
                   ar[j]=q;
                   
                   String d=" "+(i+1)+" "+(j+1)+" ";
                   String e=" "+(j+1)+" "+(i+1)+" ";
                   if(st.contains(e)!=true&&st.contains(d)!=true)
                   {
                   
                    x++;
                   }
                   }
                   break;
                }
             }
               }
       System.out.println(x);
   }

}       
}
