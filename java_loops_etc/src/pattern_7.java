import java.util.Scanner;

public class pattern_7 {

    public static void pattern_7a() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows(for a half pyramid):");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern_7b()
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the number of rows(for a half pyramid):");
                int b = sc.nextInt();

                for (int i = b; i > 0; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();


                }
            }}

            public static void main (String[]args)

            {
                pattern_7a();
                pattern_7b();
            }
        }


