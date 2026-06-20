import java.util.Scanner;

public class Leet66 {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] d = new int[digits.length + 1];
        d[0] = 1;

        return d;
    }
      public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter length of array");
        int n = obj.nextInt();
        int[] arr =new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        Leet66 ob = new Leet66();
        ob.plusOne(arr);
    }
} 
