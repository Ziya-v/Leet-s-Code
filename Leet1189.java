import java.util.Scanner;

class Leet1189{
    public int maxNumberOfBalloons(String text) {
        String text1 = text.toLowerCase();
        int count =0;
        int b = 0, a = 0, o = 0, n = 0, l = 0;
        for( int  i = 0;i < text1.length();i++){
            char c = text1.charAt(i);
            if(c == 'b')
            b++;
            else if(c == 'a')
            a++;
            else if(c == 'o')
            o++;
            else if(c == 'l')
            l++;
            else if(c == 'n')
            n++;

        }
        count = (Math.min(Math.min(Math.min(l / 2 , o / 2),n),Math.min(a,b)));
        
        return count;
    }
     public static void main(String[] args) {
            Scanner ob =new Scanner(System.in);
            System.out.println("Enter the String");
            String s = ob.nextLine();
            Leet1189 obj = new Leet1189();
            System.out.println("The number of balloons are "+ obj.maxNumberOfBalloons(s));

     }
}