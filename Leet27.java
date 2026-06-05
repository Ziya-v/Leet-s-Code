import java.util.*;
public class Leet27 {

    public int removeElement(int[] nums, int val) {
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
        Leet27 ob = new Leet27();
        System.out.println(ob.removeElement(nums,val));
    }
}

