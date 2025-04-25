import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class alarmclock implements Runnable {
    private final LocalTime alarmtime;
    private final String fileloc;
    private final Scanner sc;
    alarmclock(LocalTime alarmtime,String fileloc,Scanner sc){
        this.alarmtime=alarmtime;
        this.fileloc=fileloc;
        this.sc=sc;

    }
    @Override
    public void run()
    {
        LocalTime now=LocalTime.now();
        while(now.isBefore(alarmtime))
        {   now=LocalTime.now();
            try{
                int hours=now.getHour();
                int min= now.getMinute();
                int sec=now.getSecond();
                Thread.sleep(1000);
                System.out.printf("\r%02d:%02d:%02d",hours,min,sec);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
        System.out.println("\nAlarm noises.");

        playmusic(fileloc);
    }
    private void playmusic(String fileloc){
        File audio=new File(fileloc);

        try{
            AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(audio);
            Clip clip=AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("Press *enter* to stop the clock:");
            sc.nextLine();
            clip.stop();
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        catch (LineUnavailableException e){
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
