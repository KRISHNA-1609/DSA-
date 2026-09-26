import java.util.*;
public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows in Pascal's Triangle
        PascalsTriangle(n);
    }

    public static void PascalsTriangle(int n){
        int [][] ans= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || i==0){
                    ans[i][j] = 1; // First element of each row is 1
                } else {
                    ans[i][j] = ans[i-1][j-1] + ans[i-1][j]; // Sum of the two elements above
                }
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
