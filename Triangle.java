public class Triangle {
    public static void main(String[] args){
        int n=10;
        for(int i=0;i<n;i++){

            //Equilateral Triangle first 
            for(int j=0;j<2*n-1;j++){
                if(j<n-1-i || j>n-1+i){
                    System.out.print("  ");
                }
                if(j>=n-1-i && j<=n-1+i)
                System.out.print("* ");
            }

        //Right Angled Triangle second 
                System.out.print(" ");
            for(int k=0;k<i;k++){ 
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
