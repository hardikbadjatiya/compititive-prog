
import java.util.Scanner;

public class ChatRoom {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String st=sc.next();
   int n=st.length();
   int h=0;
   int e=0;
   int f=0;
   int l=0;
   int o=0;
   int x=0;
   int y=0;
   int z=0;
   int u=0;
   int v=0;
   
   for(int i=0;i<n;i++)
   {
       if(st.charAt(i)=='h'&x==0)
       {
        ++x;
        h=i;
        
       for(int k=i+1;k<n;k++)
   {
   
       if(st.charAt(k)=='e'&y==0)
       {
        ++y;
        e=k;
        
        {
           
        for(int g=e+1;g<n;g++)
   {
   
       if(st.charAt(g)=='l'&z==0)
       {
        ++z;
        
        f=g;
     for(int j=g+1;j<n;j++) 
     {
        if(st.charAt(j)=='l'&u==0)
       {
        ++u;
        l=j;
        
       
       for(int d=j+1;d<n;d++)
   {
    
       if(st.charAt(d)=='o'&v==0)
       {
        ++v;
        o=d;
        
       }
   }}}}
   }}}}}}
//    System.out.println(h);
//    System.out.println(e);
//    System.out.println(f);
//    System.out.println(l);
//    System.out.println(o);
//    
   if(h<e&&e<f&&f<l&&l<o)
   {
       System.out.println("YES");
   }
   else{
       System.out.println("NO");
   }
}
        
}
