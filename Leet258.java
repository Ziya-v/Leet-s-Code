// import java.util.*;
// public class Leet258{
//     public int addDigit(int x){
//         int sum=0;int r;
//         if(x<=Math.pow(2,31)-1){
//             int xabs=Math.abs(x);
//             if(x==xabs){
//                 while(sum<10){
//                     while(x>0){
//                         r=x%10;
//                         sum=sum+r;
//                         x=x/10;
//                     }
//                 }

//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner in =new Scanner(System.in);
//         System.out.println("Enter a number");
//         int num=in.nextInt();
//         Leet258 ob=new Leet258();
//         int result=ob.addDigit(num);
//         System.out.println("The sum is"+ result);
        


//     }
// }

import java.util.*;

public class Leet258{
    public int addDigit(int x) {
        if(x<Integer.MAX_VALUE-1){
        x=Math.abs(x);

        while (x > 10) {   // repeat until single digit
            int sum = 0;
            while (x > 0) {
                int r = x % 10;
                sum += r;
                x = x / 10;
            }
            x = sum; // update x
        }}
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        Leet258 ob = new Leet258();
        int result = ob.addDigit(num);

        System.out.println("The sum is " +" "+ result);
    }
}