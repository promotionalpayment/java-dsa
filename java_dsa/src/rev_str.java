import java.util.Scanner;
public class rev_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        ;
        String j= "";
        int k=a.length();
        for(int i=k-1;i>=0;i--)
        {
            j=j+a.charAt(i);
        }
        System.out.println(j);

    }
}