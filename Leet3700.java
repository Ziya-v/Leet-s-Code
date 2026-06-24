import java.util.*;
class Leet3700 {

    private static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {

        int m = r - l + 1;
        int size = 2 * m;

  
        long[][] transition = new long[size][size];

      
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < x; y++) {
                transition[m + y][x] = 1;
            }
        }

   
        for (int x = 0; x < m; x++) {
            for (int y = x + 1; y < m; y++) {
                transition[y][m + x] = 1;
            }
        }

    
        long[] initial = new long[size];

        for (int a = 0; a < m; a++) {

            for (int b = 0; b < m; b++) {

                if (a == b)
                    continue;

      
                if (a < b)
                    initial[b]++;

            
                else
                    initial[m + b]++;
            }
        }

      
        long[][] power = matrixPower(transition, n - 2);


        long answer = 0;

        for (int i = 0; i < size; i++) {

            long sum = 0;

            for (int j = 0; j < size; j++) {

                sum = (sum + power[i][j] * initial[j]) % MOD;
            }

            answer = (answer + sum) % MOD;
        }

        return (int) answer;
    }

    private long[][] matrixPower(long[][] matrix, int exponent) {

        int n = matrix.length;

        long[][] result = new long[n][n];


        for (int i = 0; i < n; i++) {
            result[i][i] = 1;
        }

        while (exponent > 0) {

            if ((exponent & 1) == 1) {
                result = multiply(result, matrix);
            }

            matrix = multiply(matrix, matrix);

            exponent >>= 1;
        }

        return result;
    }

    private long[][] multiply(long[][] a, long[][] b) {

        int n = a.length;

        long[][] result = new long[n][n];

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n; k++) {

                if (a[i][k] == 0)
                    continue;

                for (int j = 0; j < n; j++) {

                    if (b[k][j] == 0)
                        continue;

                    result[i][j] =
                        (result[i][j] + a[i][k] * b[k][j]) % MOD;
                }
            }
        }

        return result;
    }
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter length of each arrays");
        int a = obj.nextInt();
         System.out.println("Enter lower limit");
        int b = obj.nextInt();
         System.out.println("Enter upper limit");
        int c = obj.nextInt();
        Leet3700 o = new Leet3700();
        int res = o.zigZagArrays(a,b,c);
        System.out.println( res );

     }
}