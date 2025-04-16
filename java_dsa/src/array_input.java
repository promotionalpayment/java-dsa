
import java.util.Scanner;
public class array_input
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int a=sc.nextInt();
        int b[] = new int[a];
        for(int i=0;i<a;i++)
        {
            System.out.println("enter element at "+i+":");
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(b[i]+",");
        }
        System.out.println("enter the value to be found:");
        int g=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            if(g==b[i])
            {
                System.out.println("found element at "+i);
            }
            else
            {
                System.out.println("doesnt exist");
            }
        }
    twodarray();
    }//linear search tech
    public static void twodarray()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter row:");
        int a=sc.nextInt();
        System.out.println("enter column:");
        int b=sc.nextInt();
        int twod[][]=new int [a] [b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.println("enter element at ("+i+","+j+"):");
                twod[i][j]=sc.nextInt();
            }
        }
        System.out.printf("enter the value you want to search for:");
        int g= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(twod[i][j]==g)
                {
                    System.out.printf("found entered value at ("+i+","+j+")");
                }
            }
        }

    }
}