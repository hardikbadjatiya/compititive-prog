
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dsbdfvdf {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       char ch[]=new  char[n];
       int ar[]=new int[n];
       int o[][]=new int[4][4];
       for(int i=0;i<n;i++)
       {
       ch[i]=sc.next().charAt(0);
       ar[i]=sc.nextInt();
       int y=ar[i]/3-1;
       int p=ch[i]-65;
       o[p][y]=o[p][y]+1;
           
       }
       int a[]=new int[4];
       int b[]=new int[4];
       int c[]=new int[4];
       int d[]=new int[4];
       
       for(int i=0;i<4;i++)
       {
           a[i]=o[i][0];
       }
       for(int i=0;i<4;i++)
       {
           b[i]=o[i][1];
       }for(int i=0;i<4;i++)
       {
           c[i]=o[i][2];
       }for(int i=0;i<4;i++)
       {
           d[i]=o[i][3];
       }

     
       long max=0;
       for(int i=0;i<4;i++)
       {
           String s=" ";
             long we=0;
           for(int j=0;j<4;j++)
           {
            if(j!=i)
            {
               
           for(int r=0;r<4;r++)
           {
               if(r!=i&&r!=j)
               {
           for(int g=0;g<4;g++)
           {
               we=0;
               if(g!=i&&g!=j&&g!=r)
               {
                 int wer[]=new int[4];
               int f=0;
                wer[0]=a[i];
                wer[1]=b[j];
                wer[2]=c[r];
                wer[3]=d[g];
               Arrays.sort(wer);
               
                    if(wer[1]==0)
          {
              we=we-100;
              s=s+" -100 ";
          }
                    if(wer[1]!=0){
                   we=we+wer[1]*50;
               }
                     if(wer[0]==0)
          {
              we=we-100;
              s=s+" -100 ";
          }
          if(wer[0]!=0){
              we=we+wer[0]*25;
             s=s+""+(a[i]*25)+ " ";
          }
           if(wer[2]==0)
                   {
                       we=we-100;
                       s=s+ " -100 ";
                       
                   }
                 if(wer[2]>0){
                       we=we+wer[2]*75;
                       s=s+" "+(c[r]*75)+" ";
                   }
                   if(wer[3]==0)
                   {
                       we=we-100;
                       s=s+" -100 ";
                   }
                   
                   else{
                       we=we+wer[3]*100;
                       s=s+" "+(d[g]*100)+" ";
                   
                   }
                   if(we>max)
                  {
                      max=we;
                   
                  }
                      s="";
                   }
               
           }
               }
           }
           }
           }
       }
           System.out.println(max);
       
   }
}
    
}
