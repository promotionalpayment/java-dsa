import java.util.Scanner;
public class pattern_2
{
    public static void main(String[] args)
    {
    //unequal box patterns
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int a=sc.nextInt();
        System.out.println("enter the number of columns:");
        int b=sc.nextInt();
        for(int i=1;i<=a;i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}