import java.util.Scanner;

public class Star2 {
    static String star = "*";
    static String blank = "";
    static String st = "";
    static int s = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        mark(n);
    }

    public static String mark(int num) {
        s = s + 1;
        int a = num - (num - s);
        if (num == 0) {
            return "";
        }

        star = mark2(num).substring(0, num - 1) + "*";
        for (int i = 1; i < a; i++) {
            star += "*";
        }

        System.out.println(star);
        return mark(num - 1);
    }

    public static String mark2(int num) {
        if (num == 1) return "*";
        blank = blank + " ";
        mark2(num - 1);
        return blank + "*";
    }
}
// n이 1일 땐 return "*"
// n이 2일 땐 " " + "*"
// n이 3일 땐 " " + " " + "*"
//