import java.util.Scanner;

public class Star9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 공백 i-1개, 별 2(n-i)+1개
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.printf(" ");
            }
            System.out.printf("*");
            for(int k=1; k<=n-i; k++){
                System.out.printf("**");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=i-1; j>=1; j--){
                System.out.printf(" ");
            }
            System.out.printf("*");
            for(int k=n-i; k>=1; k--){
                System.out.printf("**");
            }
            System.out.println();
        }
    }
}
