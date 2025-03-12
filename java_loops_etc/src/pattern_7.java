import java.util.Scanner;

public class pattern_7 {

    public static void pattern_7a(Scanner sc) {
        System.out.println("Enter the number of rows (for a half pyramid):");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern_7b(Scanner sc) {
        System.out.println("Enter the number of rows (for an inverted half pyramid):");
        int b = sc.nextInt();

        for (int i = b; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern_7c(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pattern_7a(sc);
        pattern_7b(sc);

        System.out.println("Enter the number of rows for pattern_7c:");
        int n = sc.nextInt();
        pattern_7c(n);

        sc.close();
    }
}
