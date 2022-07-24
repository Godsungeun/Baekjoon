import java.util.Scanner;

public class Star5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int add = 1;
        for (int i = 0; i < N; i++) {
            for (int k = 1; k < N - i; k++) {
                System.out.printf(" ");
            }
            add = add + 2;
            if (i == 0) System.out.printf("*");
            else {
                for (int a = 1; a < add - 1; a++) {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
// N-i칸까지는 공백찍고
// i보다 +2개 더 별을 찍으면 됨
// N-1개까지 찍으면 된다