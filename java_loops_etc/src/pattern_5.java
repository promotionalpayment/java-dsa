import java.util.Scanner;

public class pattern_5 {

    public static void main(String[] args)


    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows(for a reverse half pyramid):");
        int a = sc.nextInt();

        for (int i = a; i>0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}