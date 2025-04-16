public class towerofhanoi {
    public static void tower(int n,String s,String h,String d){
        if (n==1){
            System.out.println("Transfer disk "+n+" from "+s+" to "+d);
            return;
        }
        tower(n-1,s,d,h);
        System.out.println("Transfer disk "+n+" from "+s+" to "+d);
        tower(n-1,h,s,d);
    }
    public static void main(String[] args)
    {
        int n=5;
        tower(n,"S","H","D");
    }
}