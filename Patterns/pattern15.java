package Patterns;

public class pattern15 {
    public static void main(String[] args) {
        for(int i = 5;i>=1;i--){
            for(char j='A';j<'A'+i;j++){
                System.out.print(" "+j+" ");

            }
            System.out.println();
        }
    }
}
