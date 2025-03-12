import java.util.Scanner;

public class pattern_4 {

    public static void ()


    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows(for a half pyramid):");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}