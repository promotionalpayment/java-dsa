public class passbyref {
    public static void add(int a)
    {
        a+=5;
        System.out.println(a);
        a+=5;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
      int a=10;
        System.out.println(a);
        add(a);
        System.out.println(a);
    }
}