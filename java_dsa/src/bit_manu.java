import java.util.Scanner;

public class bit_manu
{
    public static void poweroftwo()
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        if(n>0 && (n & (n-1))==0)
        {
            System.out.println("is a power of 2");
        }
        else
        {
            System.out.println("not a power of 2");
        }

    }
    public static void toggle()
    {
        int n= 7;
        int pos=2;
        int bitm=1<<pos;


    }
    public static void main(String[] args)
    {
        poweroftwo();
    }
}