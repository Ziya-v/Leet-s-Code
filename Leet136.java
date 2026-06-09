import java.util.*;
class Leet136 {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return nums[i];
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int num = obj.nextInt();
        int[] nums = new int[num];
        System.out.println("Enter Array");
        for(int i = 0; i<num; i++)
{
    nums[i] = obj.nextInt();
}
Leet136 ob = new Leet136();
int x= ob.singleNumber(nums);
System.out.println(x);
    }

}