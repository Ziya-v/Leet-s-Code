import java.util.Arrays;
import java.util.Scanner;

public class Leet1480 {
   
    public int[] runningSum(int[] nums) {
        int sum =0;
        int runsum[] = new int[nums.length];
        for(int  i = 0; i<nums.length; i++){
            sum =sum + nums[i];
            runsum[i]=sum;
        }
        
        return runsum;
    }
    public static void main(String[] var0) {
      Scanner ob = new Scanner(System.in);
      System.out.println("Enter length of array");
      int val = ob.nextInt();
      int[] nums = new int[val];
System.out.println("Enter array");
      for(int i = 0; i < val; ++i) {
         nums[i] = ob.nextInt();
      }
    
      Leet1480 obj = new Leet1480();
      int x[] = obj.runningSum(nums);
      System.out.println( Arrays.toString(x));
     
   }
}
    

