import java.util.Scanner;

class Leet35 {
    public int searchInsert(int[] nums, int target) {
         int x = 0;
        for(int  i = 0; i < nums.length; i++){
           
            if( nums[i] == target){
                x = i;;
            }
            else if(target > nums[nums.length-1])
            {
                x = nums.length;
            }
            else{
                if(target > nums[i] && target < nums[i+1]){
                    x = i+1;
                }
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the length of array");
        int n = obj.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the sorted array");
        for(int i = 0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter value to insert");
        int c = obj.nextInt();
        Leet35 ob = new Leet35();
        int result = ob.searchInsert(arr,c);
        System.out.println(result);
    }
}