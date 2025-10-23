package Patterns;

public class pattern19 {
    public static void main(String[] args) {
        System.out.println("\nWelcome to my program\n");
        for (int i = 5; i >1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int k = 4; i <= k; k -= 1) {
                System.out.print("   ");
            }
            for (int l = 4; i <= l; l -= 1) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int q = 1; q <=5; q++) {
            for (int w = 1; w <= q; w++) {
                System.out.print(" * ");
            }
            for (int e = 4; q <= e; e -= 1) {
                System.out.print("   ");
            }
            for (int r = 4; q <= r; r -= 1) {
                System.out.print("   ");
            }
            for (int w = 1; w <= q; w++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
