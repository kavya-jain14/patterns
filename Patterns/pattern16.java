package Patterns;

public class pattern16 {
    public static void main(String[] args) {
        for(int i = 0;i<=4;i++){
            char ch='A';
            char x=(char)(ch+i);
            for(char j='A';j<='A'+i;j++){
                System.out.print(" "+x+" ");
            }
            System.out.println();
        }
    }
}
