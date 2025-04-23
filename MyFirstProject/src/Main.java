import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String filepath="MyFirstProject\\src\\1st-Mysc-Proj-_Garage-band_.wav";
        File file=new File(filepath);
        try(AudioInputStream audiostream= AudioSystem.getAudioInputStream(file);Scanner sc = new Scanner(System.in)){

            Clip clip=AudioSystem.getClip();
            clip.open(audiostream);
            clip.start();
            String response="";
            while(!response.equals("Q")){
                System.out.println("P-->Play");
                System.out.println("Q-->Quit");
                System.out.println("S-->Stop");
                System.out.println("R-->Reset");
                System.out.println("Enter your response:");
                response=sc.next().toUpperCase();
                switch (response){
                    case "P" ->clip.start();
                    case "S" ->clip.stop();
                    case "Q" ->clip.close();
                    case "R" ->clip.setMicrosecondPosition(0);
                    default -> System.out.println("Invalid choice.");
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Couldnt find the file.");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio class. ");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Wrong Audio format.");
        }
        catch(IOException e){
            System.out.println("Something went wrong.");

        }
        finally {
            System.out.println("Bye!");
        }
    }
}