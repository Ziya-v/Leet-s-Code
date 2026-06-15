import java.util.*;
class Leet171 {
    public int titleToNumber(String columnTitle) {
        String c = columnTitle.toUpperCase();
        int l = c.length();
       int val = 0;
            for(int i = 0; i <l; i++){
                char chr = c.charAt(i);
                int m = chr;
                if(l == 1){
                 if(chr >= 'A' && chr <= 'Z'){
                   
                    return m-64 ;
                    }}
                else{
                    int r = chr - 'A' + 1; 
                val = val*26 + r;
                     }

              
             
            }
            return val;
        }
        public static void main(String[] args) {
            Scanner ob =new Scanner(System.in);
            System.out.println("Enter the titlr column");
            String s = ob.next();
            Leet171 in = new Leet171();
            int value = in.titleToNumber(s);
            System.out.println(value);
        }
        
    }
