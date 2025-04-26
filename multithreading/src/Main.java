public class Main {
    public static void main(String[] args) {
     Thread thread1=new Thread(new myrunnable("PING"));
     Thread thread2=new Thread(new myrunnable("PONG"));
        System.out.println("Game start");
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Game over!");

    }
}