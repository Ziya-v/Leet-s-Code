import java.util.*;
class Leet1833 {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;int counts = 0;
        for( int i = 0; i < costs.length; i++){
            if( max < costs[i]){
                max = costs[i];
            }

        }
        int[] count = new int[max + 1];
        for(int j = 0; j < costs.length; j++){
            int n = costs[j];
            count[n]++;
        }
        int index = 0;
        for (int k = 0; k < count.length; k++) {

            while (count[k] > 0) {
                costs[index] = k;
                index++;
                count[k]--;
            }}
            int sum = 0;
        for (int p = 0; p < costs.length; p++){
            sum = sum + costs[p];
            if(sum <= coins){
                counts++;}
                if( sum > coins)
                break;
                
            
        }
        
    
    return counts;
}
public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter total number ice cream");
        int n = obj.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter price of each ice cream");
        for(int i = 0; i<n; i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter maximum ciins boy has");
        int c = obj.nextInt();
        Leet1833 ob = new Leet1833();
        int result = ob.maxIceCream(arr,c);
        System.out.println(result);
    }
}