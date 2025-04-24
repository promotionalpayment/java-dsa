import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of seconds to the event:");
        int resp=sc.nextInt();
        Timer timer =new Timer();
        TimerTask task=new TimerTask() {

            int count=resp;

            @Override
            public void run() {

                if(count==0){
                    System.out.println("Happy new year!");
                    timer.cancel();
                }
                else {
                        System.out.println(count);

                }
                count--;


            }
        };
        timer.scheduleAtFixedRate(task,0,1000);
    }
}