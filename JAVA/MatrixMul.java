import java.util.*;
public class MatrixMul{
    static void Display(int[][] arr, int r, int c){
        System.out.println();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //INPUT PART
        Scanner sc = new Scanner(System.in);
        int r1, r2, c1, c2;
        boolean flg;
        do{
            System.out.println("Enter Number of Rows and Columns of Matrix A: ");
            r1 = sc.nextInt();
            c1 = sc.nextInt();
            System.out.println("Enter Number of Rows and Columns of Matrix B: ");
            r2 = sc.nextInt();
            c2 = sc.nextInt();
            flg = (r2 == c1);
            if(!flg) System.out.println("Number of Columns of A and Number of Rows of B must be same");
        }while(!flg);
        int A[][] = new int[r1][c1];
        int B[][] = new int[r2][c2];
        System.out.println("Enter Values for Matrix A : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Values for Matrix  : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        //MULTIPLICATION
        int[][] C = new int[r1][c2];
        int i, j, k;
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                for (k = 0; k < r2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
        System.out.print("Final Matrix is : ");
        Display(C, r1, c2);
    }
}