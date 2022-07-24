import java.util.Scanner;

public class Star2_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int a = 1; a <= N - i; a++) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= N - (N - i); k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
