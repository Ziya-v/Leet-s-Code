import java.util.*;
public class Leet3737 {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int targetcount = 0;

            for (int j = i; j < nums.length; j++) {

                if (nums[j] == target) {
                    targetcount++;
                }

                int len = j - i + 1;

                if (targetcount > len / 2) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = ob.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the array");
        for(int i = 0; i< n; i++){
        nums[i] = ob.nextInt();}
        System.out.println("Enter the target element");
        int target = ob.nextInt();
        Leet3737 obj = new Leet3737();
        int x = obj.countMajoritySubarrays(nums,target);
        System.out.println("The number of such subarrays is " +x);

    }
}