import java.util.Scanner;

public class Star7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // n번째에 1
        // n-1번째에 1+2개
        // n-2번째에 1+2+2. ..
        // n-n번째에 1+2*(n-1)
        // 공백은 n-i개, *은 1+2*(i-1)개
        for(int i=1; i<=N; i++){
            for(int j=0; j<N-i; j++){
                System.out.printf(" ");
            }
            System.out.printf("*");
            for(int k=0; k < i-1; k++){
                System.out.printf("**");
            }
            System.out.println();
        }
        for(int i=N-1; i>0; i--){
            for(int j=N-i; j>0; j--){
                System.out.printf(" ");
            }
            System.out.printf("*");
            for(int k=i-1; k > 0; k--){
                System.out.printf("**");
            }
            System.out.println();
        }
    }
}
