import java.util.Scanner;

public class pattern_6 {

    public static void main(String[] args)


    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows(for a inverted half pyramid):");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++)
        {
            for (int k=1;k<=(a-i);k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i); j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}