import java.util.*;
public class Asses{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int a[][] = new int[n][n1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        max(a,n,n1);
    }
    static void max(int a[][],int n,int n1){
        int first=0;int second =0;int third =0;
       
            for(int k=0;k<n;k++){
            for(int j=0;j<n1;j++){
                if(a[k][j]>first){
                    
                    third = second;
                    second = first;
                    first= a[k][j];
                }
                else if(a[k][j]>second && a[k][j]<first){
                    third = second;
                    second = a[k][j];
                    
                }
                    else if (a[k][j]>third && a[k][j]<second){
                        third = second;
                    }
                }
            }
            if( third == second || third == first){
                System.out.println("third number is gone");
            }
            else{
                System.out.println(third);
            }
        
      
        
    }
   
}
