import java.util.Scanner;

public class Star4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int a = 0; a < i; a++) {
                System.out.printf(" ");
            }
            for (int k = 0; k < N - i; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
