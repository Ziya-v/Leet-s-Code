import java.util.Arrays;
import java.util.Scanner;

public class Leet3699 {
    public int zigZagArrays(int n, int l, int r) {
        int MOD = 1_000_000_007;
       
        int m = r - l + 1;
        
       
        int[] dp = new int[m];
        
        
        Arrays.fill(dp, 1);
        
        for (int i = 1; i < n; i++) {
            int[] nextDp = new int[m];
            long runningSum = 0;
            
            if (i % 2 == 1) {
               
                for (int v = 0; v < m; v++) {
                    nextDp[v] = (int) (runningSum % MOD);
                    runningSum += dp[v];
                }
            } else {

                for (int v = m - 1; v >= 0; v--) {
                    nextDp[v] = (int) (runningSum % MOD);
                    runningSum += dp[v];
                }
            }
            dp = nextDp;
        }
        

        long totalWays = 0;
        for (int v : dp) {
            totalWays = (totalWays + v) % MOD;
        }
        
        return (int) ((totalWays * 2) % MOD);
    }
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter length of each arrays");
        int a = obj.nextInt();
         System.out.println("Enter lower limit");
        int b = obj.nextInt();
         System.out.println("Enter upper limit");
        int c = obj.nextInt();
        Leet3699 o = new Leet3699();
        int res = o.zigZagArrays(a,b,c);
        System.out.println( res );

     }
}