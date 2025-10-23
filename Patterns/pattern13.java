package Patterns;

public class pattern13 {
    public static void main(String[] args) {
        int a=0;
        for(int i = 1;i<=5;i++){
            for(int j=1;j<=i;j++){
               a+=1;
                System.out.print(" "+a+" ");
            }
            System.out.println();
        }
    }
}
