import java.util.*;
class Leet231 {
    public boolean isPowerOfTwo(int n) {
        int num = n;
        if( n == 0)
        return false;
        while(num != 0){
            if( num == 1)
            return true;
             if(num % 2 != 0){
                return false;
             }
            else
            num = num/2;
           
        }
        
       
        return true;
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = ob.nextInt();
        Leet231 obj = new Leet231();
        boolean r = obj.isPowerOfTwo(num);
        if( r == true)
        System.out.println("A Power Of TWo");
        else
        System.out.println("Not a Power Of TWo");
    }
}