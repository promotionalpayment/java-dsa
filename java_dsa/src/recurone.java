import java.util.Scanner;

public class recurone {


        public static void print(int n){

            if (n==6)
                return;
            System.out.println(n);
            print(n+1);
        }
        public static void main(String[] args)
        {

            int a=1;
            print(a);
    }

}