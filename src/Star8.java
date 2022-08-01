import java.util.Scanner;

public class Star8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // i번째 *, i개 공백 (n-i)*2개, * i개
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("*");
            }
            for(int k=1; k<=N-i; k++){
                System.out.printf("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
        for(int i=N-1; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.printf("*");
            }
            for(int k=N-i; k>=1; k--){
                System.out.printf("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
