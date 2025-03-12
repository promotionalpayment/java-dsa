
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int a;
        int rando=((int)(Math.random()*100));
        System.out.println(rando);
        do {
            Scanner sc=new Scanner(System.in);
            System.out.println("Guess a number between 0-100:");

            a=sc.nextInt();
            if (a==rando){
                System.out.println("Woo correct");
                break;}
            else if(a<rando)
                System.out.println("Try Higher");
            else
                System.out.println("Try lower");
        }while(a>=0);




            }
        }


