public class Alphabet {
    public static void main(String[] args){
        
    for(int i=0;i<9;i++){
        char ch ='A';
        for(int j=0;j<i;j++){
                System.out.print(ch++ + " ");
        }
        System.out.println();
    }
}
}