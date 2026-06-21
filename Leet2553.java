import java.util.*;

public class Leet2553 {
    
    public int[] separateDigits(int[] nums) {
        String ar = "";
        for(int i = 0; i < nums.length; i++){
            ar = ar + nums[i];
        }
        int[] newnums = new int[ar.length()];
        for(int i = 0; i < ar.length(); i++){
            newnums[i] = Character.getNumericValue(ar.charAt(i));
        }
        return newnums;
    }
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter length of array");
        int n = obj.nextInt();
        int[] arr =new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        int[] a = new int[n];
        Leet2553 ob = new Leet2553();
        a = ob.separateDigits(arr);
        System.out.print(Arrays.toString(a));
    }
    
}
