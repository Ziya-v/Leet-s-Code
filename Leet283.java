import java.util.Scanner;
public class Leet283{
    public void moveZeroes(int[] nums) {
        int pos = 0;
          for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        
        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }

      System.out.println("Array:");  
      for(int i = 0;i < nums.length;i++){
        System.out.println(nums[i]);
      }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter length of array");
        int n = obj.nextInt();
        int[] arr =new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        Leet283 ob = new Leet283();
        ob.moveZeroes(arr);
    }
}
