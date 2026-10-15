package Patterns;

public class pattern20 {
    public static void main(String[] args) {
        for(int i = 1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(i==1||j==1||i==9||j==9){
                    System.out.print(" 5 ");
                } else if (i==2||j==2||i==8||j==8) {
                    System.out.print(" 4 ");
                } else if (i==3||j==3||i==7||j==7) {
                    System.out.print(" 3 ");
                } else if (i==4||j==4||i==6||j==6) {
                    System.out.print(" 2 ");
                } else{
                    System.out.print(" 1 ");
                }
            }
            System.out.println();
        }
    }
}
