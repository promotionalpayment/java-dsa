public class extractx {
    public static void extract(int n,String s,char a,int count,String newstring) {
        if (n == s.length()) {
            for(int i=0;i<=count;i++)
            {
                newstring =newstring + a;
            }
            System.out.println(newstring);
            return;
        }
        char current = s.charAt(n);
        if (a == current) {
            count += 1;
            extract(n + 1, s, a, count, newstring);
        } else {
            newstring = newstring + current;
            extract(n + 1, s, a, count, newstring);
        }
    }
    public static void main(String[] args) {
        String s = "axbcxxdxg";
        extract(0, s, 'x', 0, "");
    }



    }
