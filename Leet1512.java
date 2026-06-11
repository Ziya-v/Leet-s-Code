import java.util.Scanner;

class Leet1512 {
    public int numIdenticalPairs(int[] nums) {
        int count  = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++)
            if(nums[i] == nums[j] && i < j){
                count ++;


            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter length of array");
        int n = obj.nextInt();
        int[] nums =new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = obj.nextInt();
        }
        Leet1512 ob = new Leet1512();
        int x = ob.numIdenticalPairs(nums);
        System.out.println(x);
    }
}