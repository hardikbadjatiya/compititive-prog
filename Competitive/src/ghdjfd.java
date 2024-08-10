
import java.util.ArrayList;
import java.util.Scanner;

public class ghdjfd {
       static int printMatrix(int mat[][], int m, int n, 
                                    int i, int j, int path[], int idx) 
    { 
        path[idx] = mat[i][j]; 
        int u=0;
        
        if (i == m - 1)  
            { 
            ArrayList <Integer> l1=new ArrayList<Integer >();
            for (int k = j + 1; k < n; k++) 
            {
                if(l1.contains(k)!=true)
                { path[idx + k - j] = mat[i][k];
                l1.add(k);
                } 
            }
            for (int l = 0; l < idx + n - j; l++)  
            { 
           System.out.print(path[l] + " "); 
           u=u+path[l];
            } 
            System.out.println(); 
            return u; 
        
        } 
          
        if (j == n - 1)  
        { 
            ArrayList <Integer> l1=new ArrayList<Integer >();
           
            for (int k = i + 1; k < m; k++)  
            { 
                if(l1.contains(k)!=true)
                {   
                    path[idx + k - i] = mat[k][j]; 
                    l1.add(k);
                }
            } 
            for (int l = 1; l < idx + m - i; l++)  
            { 
                u=u+path[l];
            }
            
            System.out.println(); 
         return u; 
       
        } 
        // Print all the paths that are possible after moving down 
        
     int ul=   printMatrix(mat, m, n, i + 1, j, path, idx + 1); 
  
         int kl=  printMatrix(mat, m, n, i, j + 1, path, idx + 1); 
       return ul+kl;
    } 
      
    // Driver code 
     
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int d=sc.nextInt();
   int ar[][]=new int[d][n];
   for(int i=0;i<d;i++)
   {
       for(int j=0;j<n;j++)
       {
           ar[i][j]=sc.nextInt();
       }
   }
       int m = 2; 
        int k = 3; 
        int maxLengthOfPath = d + n - 1; 
        int u=printMatrix(ar, d, n, 0, 0, new int[maxLengthOfPath], 0); 
        
        System.out.println(u);
}
    
}
