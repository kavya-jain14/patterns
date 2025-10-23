package Patterns;

public class pattern24 {
    public static void main(String[] args) {
        for (int i = 5; i >=1 ; i--) {
            if(i==1||i==5){
                for(int j=1;j<=5;j++) {
                    System.out.print(" * ");
                }
            } else if (true) {
                for (int k = i-1; k >=1 ; k--) {
                    System.out.print("   ");
                }
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
