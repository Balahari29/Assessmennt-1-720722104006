import java.util.Scanner;

public class Rot {
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
        rotate(a, n, n1);
    }
    static void rotate(int a[][],int n,int n1){
       for (int i = 0; i < n; i++){
            for (int j = 0; j<n1; j++) {
                if(i>=(n/2)-1+i && j>=(n/2)-1+j){
                    a[j][i]= a[i][j];
                }
              } 
    }
    for (int i = 0; i < n; i++){
        for (int j = 0; j<n1; j++) {
        System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }

}
}