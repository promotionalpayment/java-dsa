import java.util.Scanner;
public class Main {
    public static void pattern_1()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows and columns(for a square pattern):");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {

        pattern_1();
    }
}