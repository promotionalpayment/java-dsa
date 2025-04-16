import java.util.Scanner;

public class stackh {


    public static int powerof(int x,int n){

        if (n==0){
            return 1;}
        if (x==1){
            return 0;}

        return x*powerof(x,n-1);
    }
    public static void main(String[] args)
    {

        int a=2,b=5;
        System.out.println(powerof(a,b));
    }

}