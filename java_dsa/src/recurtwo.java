import java.util.Scanner;

public class recurtwo {


    public static void print(int i,int n,int sum){
        if (i==n)
        {   sum +=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        print(i+1,n,sum);


    }
    public static void main(String[] args)
    {
      print(1,5,0);

    }

}