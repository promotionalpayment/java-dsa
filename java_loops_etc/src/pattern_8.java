

public class pattern_8
{
    public static void main(String[] args)
    {int a=6;
        for (int i = 1;i<=a;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=5;k>i-1;k--)
            {
                System.out.print("  ");
                System.out.print("  ");

            }
            for (int l=1;l<=i;l++)
            {
                System.out.print("* ");
            }

            System.out.println();

        }
        for(int m = a;m>=0;m--)
        {
            for (int n = 0; n <= m; n++)
            {
                System.out.print("* ");

            }



            for (int o=a;o>=(a-o);o--)
            {
                System.out.print("-");

            }
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }



            System.out.println();
        }
    }
}