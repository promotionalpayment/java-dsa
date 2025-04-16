import java.util.Scanner;

public class factorialrecur {


    public static int fact(int n){
        if (n==1 || n==0)
            return 1;
        else
           return (n*fact(n-1));
    }
    public static void main(String[] args)
    {

        int a=5;
        int ans=fact(a);

        System.out.println(ans);
    }

}