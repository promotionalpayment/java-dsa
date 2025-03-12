import java.util.Scanner;
public class pattern_3
{
    public static void main(String[] args)
    {
        //hollow box patterns
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int a=sc.nextInt();
        System.out.println("enter the number of columns:");
        int b=sc.nextInt();
        for(int i=1;i<=a;i++) {
            for (int j = 1; j <= b; j++) {
                if(j==1 || j==b || i==1 || i==a)
                   {
                       System.out.print("* ");
                   }
                else
                {
                    System.out.print("  ");
                }

        }System.out.println();


        }
}
}
