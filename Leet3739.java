import java.util.*;
public class Leet3739 {
    


    class FenwickTree {
        int[] bit;
        int n;

        FenwickTree(int n) {
            this.n = n;
            bit = new int[n + 1];
        }

        void update(int index, int value) {
            while (index <= n) {
                bit[index] += value;
                index += index & (-index);
            }
        }

        int query(int index) {
            int sum = 0;
            while (index > 0) {
                sum += bit[index];
                index -= index & (-index);
            }
            return sum;
        }
    }

    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i] - 1;
            }
        }

        int[] sorted = prefix.clone();
        Arrays.sort(sorted);

        ArrayList<Integer> values = new ArrayList<>();
        for (int x : sorted) {
            if (values.isEmpty() || values.get(values.size() - 1) != x) {
                values.add(x);
            }
        }

        FenwickTree bit = new FenwickTree(values.size());

        long answer = 0;

        for (int x : prefix) {
            int index = Collections.binarySearch(values, x) + 1;

            answer += bit.query(index - 1);

            bit.update(index, 1);
        }

        return answer;
    }


public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = ob.nextInt();
    int nums[] = new int[n];
    System.out.println("Enter the array");
    for (int i = 0; i < n; i++) {
        nums[i] = ob.nextInt();
    }
    System.out.println("Enter the target element");
    int target = ob.nextInt();
    Leet3739 obj = new Leet3739();
    long x = obj.countMajoritySubarrays(nums, target);
    System.out.println("The number of such subarrays is " + x);
    ob.close();
}
}

