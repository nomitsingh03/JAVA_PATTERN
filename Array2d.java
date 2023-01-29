import java.util.*;
public class Array2d {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]= new int[10][10];
        int i=0,j=0,k=0;
        System.out.println("Matrix A \n Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("Enter "+ rows*cols +" elements");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++) {
                arr[i][j]=sc.nextInt();
            }
        } System.out.println("Matrix B \n Enter number of rows and columns: ");
        int rs = sc.nextInt();
        int cs = sc.nextInt();
        System.out.println("Enter "+ rs*cs +" elements");
        for(i=0;i<rs;i++){
            for(j=0;j<cs;j++) {
                b[i][j]=sc.nextInt();
            }
        } System.out.println("Matrices A and B are - ");
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                System.out.print(arr[i][j]+"  ");
            }System.out.println();
        } System.out.println();
        for(i=0;i<rs;i++){
            for(j=0;j<cs;j++){
                System.out.print(b[i][j]+"  ");
            }System.out.println();
        }  c[i][j]=0;
        for(i=0;i<rows;i++){
            for(i=0;i<k;i++){
            for(j=0;j<cs;j++){
                    c[i][j]=c[i][j]+arr[i][k]*b[k][j];
                }
            }
        }
        for(i=0;i<rows;i++) {
            for(j=0;j<cs;j++) {
                System.out.print(c[i][j]+"  ");
            } System.out.println();
        }  
    }
}
