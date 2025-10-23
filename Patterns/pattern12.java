package Patterns;

public class pattern12 {
    public static void main(String[] args) {
        for (int i = 5; i >=1 ; i--) {
            for(int j = 5; j >=i; j--){
                System.out.print(" "+(6-j)+" ");
            }
            for (int k = 1; k <((2*i)-1) ; k++) {
                System.out.print("   ");
            }
            for(int j = 5; j >=i; j--){
                System.out.print(" "+(j-i+1)+" ");
            }
            System.out.println();

        }
    }

}
