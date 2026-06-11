import java.util.Scanner;

class Leet1692 {
    public int maximumWealth(int[][] accounts) {
        int sum = 0, max = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[0].length; j++)
            {
                
                sum = sum + accounts[i][j];
            }
            if(sum > max)
            max = sum;
            sum = 0;

        }
        return max;
    }
    public static void main(String[] args) {
         Scanner ob = new Scanner(System.in);
      System.out.println("Enter number of Customers of array");
      int c = ob.nextInt();
      System.out.println("Enter number of Banks of array");
      int b = ob.nextInt();
      int[][] nums = new int[c][b];
System.out.println("Enter array");
      for(int i = 0; i < c; ++i) {
        for(int j = 0; j < b; ++j) {
         nums[i][j] = ob.nextInt();
      }

      Leet1692 obj = new Leet1692();
      int x = obj.maximumWealth(nums);
      System.out.println(x);
   }
    }
}