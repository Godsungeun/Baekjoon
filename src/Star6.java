import java.util.Scanner;

public class Star6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int add = 1;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < i; k++) {
                System.out.printf(" ");
            }
            add = 2 * (N - i);

            for (int a = 0; a < add - 1; a++) {
                System.out.printf("*");

            }
            System.out.println();
        }
    }
}

