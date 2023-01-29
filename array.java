import java.util.Scanner;
public class array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements in an array: ");
    int n = sc.nextInt();
    int array[] = new int[n];
    System.out.println("Enter "+ n+" elements");
    for(int i=0;i<n;i++) {
        array[i]=sc.nextInt();
    } System.out.println("Enter number of elements to insert");
    int m=sc.nextInt();
    int b[]=new int[m];
    System.out.println("Enter "+m+" elements");
    for(int i=0;i<m;i++){
        b[i]=sc.nextInt();
    } System.out.println("Array A is: ");
     for(int i=0;i<n;i++) {
        System.out.print(array[i]+"  ");
    } System.out.println();
    System.out.println("Array b is: ");
    for(int i=0;i<m;i++) {
        System.out.print(b[i]+"  ");
    }  System.out.println();
    System.out.println("enter postion to insert an array B[] in an array A[]: ");
    int pos=sc.nextInt();
    int c[] = new int[m+n];
        for(int i=0;i<n;i++){
          c[i]=array[i];  
    } for(int i=n-1;i>=pos-1;i--) {
        c[i+m]=c[i];
    } for(int i=0;i<m;i++){
        c[i+pos-1]=b[i];
    } for(int i=0;i<m+n;i++) {
        System.out.print(c[i]+"  ");
    } System.out.println();
     System.out.println("enter position to delete an element: ");
    int p=sc.nextInt();
     for(int i=p;i<m+n;i++) {
        c[i-1]=c[i];
     } for(int i=0;i<m+n-1;i++) {
        System.out.print(c[i]+"  ");
    }
}
}
