import java.util.Scanner;
public class Leeterror {

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i=0;i < nums.length;i++){
            if(nums[i] != val){
                nums[k]=nums[i];
                k++;
            }

        }
        return k;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the length of an array");
        int n = in.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
          System.out.println("Enter the value to be removed");
        int val = in.nextInt();
        Leeterror ob = new Leeterror();
        int k = ob.removeElement(nums, val);
System.out.println(k);
        System.out.print("Modified array: ");
for(int i = 0; i < k; i++){
    System.out.print(nums[i] + " ");
}
    }
}