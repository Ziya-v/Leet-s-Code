import java.util.*;
public class Leet07 {
    
    public int reverse(int x) {
        long num = Math.abs((long)x);
        long sum = 0;
        long rev = 0;

        while (num != 0) {
            long d = num % 10;
            sum = sum * 10 + d;
            num /= 10;
        }

        if (x < 0)
            rev = -sum;
        else
            rev = sum;

        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
            return 0;

        return (int) rev;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int n = in.nextInt();
        Leet07 obj = new Leet07();
        System.out.println(obj.reverse(n));

    }

}
