import java.util.Scanner;

class Leet1732 {
    public int largestAltitude(int[] gain) {
        int alt =0;
        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;
      
        for( int i = 0; i < gain.length; i++){
              altitude[i+1] = altitude[i] + gain[i];
        }
        int max= 0;
        int j = 0;
        while(j < altitude.length){
            if(max < altitude[j]){
                max = altitude[j];
            }
            j++;
        }
        return max;
    }
     public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter length of array");
        int n = obj.nextInt();
        int[] gain =new int[n];
        for(int i = 0; i<n; i++){
            gain[i] = obj.nextInt();
        }
        Leet1732 ob = new Leet1732();
        int x = ob.largestAltitude(gain);
        System.out.println(x);
    }
}