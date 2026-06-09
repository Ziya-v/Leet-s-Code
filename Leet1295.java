import java.util.Scanner;

class Leet1295 {
    public int findNumbers(int[] nums) {
        int flag = 0;
        for(int i = 0;i<nums.length; i++){
            int count = 0;
            int num = nums[i];
            while(num!= 0){
                num = num/10;
                count ++;

            }
            if(count %2 == 0)
            flag++;
        }
        return flag;
    }  public static void main(String[] var0) {
      Scanner ob = new Scanner(System.in);
      System.out.println("Enter length of array");
      int val = ob.nextInt();
      int[] nums = new int[val];
System.out.println("Enter array");
      for(int i = 0; i < val; ++i) {
         nums[i] = ob.nextInt();
      }

      Leet1295 obj = new Leet1295();
      int x = obj.findNumbers(nums);
      System.out.println(x);
   }
}
