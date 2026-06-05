import java.util.Scanner;
class Leet09{
    public static boolean isPalindrome(int x) {
        if(x>Integer.MIN_VALUE && x<Integer.MAX_VALUE){
            int xabs=Math.abs(x);
            if(x==xabs){
                int num=x;
                int sum=0;
                while(num!=0){
                    int d=num%10;
                    sum=sum*10+d;
                    num=num/10;

                }
                if(sum==x)
                return true;
                else 
                return false;

            }
            else
            return false;

        }
        else
        return false;
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int xyz=obj.nextInt();
        Leet09 ob=new Leet09();
        boolean result=isPalindrome(xyz);
        if(result==true)
        System.out.println("Yes Palindrome");
        else
        System.out.println("No Palindrome");
    }
}