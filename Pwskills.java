// program to print PW SKILLS using star pattern

public class Pwskills{
    public static void main(String args[]){
        int n=8;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 ||i==0 ||(j==n-1 && i<n/2) || i==n/2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } System.out.print(" ");
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || (i==j && i>n/2) || (i+j)==n-1 && i>=n/2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                }System.out.print("   ");
                for(int j=0;j<n;j++){
                    if((j==0 && i<n/2) ||i==0 ||(j==n-1 && i>n/2) || i==n/2 || i==n-1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } System.out.print(" ");
                for(int j=0;j<n/2+1;j++){
                    if(j==0 ||i+j==n/2 || i-j==(n-2)/2 ){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }System.out.print(" ");
                for(int j=0;j<n;j++){
                    if(i==0 ||j==n/2 || i==n-1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } System.out.print(" ");
                for(int j=0;j<n;j++){
                    if(i==n-1 ||j==0){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } System.out.print(" ");
                for(int j=0;j<n;j++){
                    if(i==n-1 ||j==0){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } System.out.print(" ");
                
                for(int j=0;j<n;j++){
                    if((j==0 && i<n/2) ||i==0 ||(j==n-1 && i>n/2) || i==n/2 || i==n-1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } 
                System.out.println();
            }
        }
    }
