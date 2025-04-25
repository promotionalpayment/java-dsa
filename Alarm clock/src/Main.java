import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime Time=null;
        String filepath="Alarm clock\\src\\1st-Mysc-Proj-_Garage-band_.wav";
        while(Time==null) {
            try {
                System.out.print("Enter an alarm time(HH:mm:ss):");
                String t = sc.nextLine();
                Time = LocalTime.parse(t, formatter);
                System.out.println("Alarm set for ->" + Time);
            } catch (DateTimeParseException e) {
                System.out.println("Please enter correct format in this order ->(HH:mm:ss).");
            }
        }
        alarmclock ac=new alarmclock(Time,filepath,sc);
        Thread alarmt=new Thread(ac);
        alarmt.start();

    }
}