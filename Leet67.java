import java.util.*;
public class Leet67{
   
        public String addBinary(String a,String b){
            String sum="";int n;int carry=0; char ca,cb;

            int la=a.length();
            int lb=b.length();
            if(la>lb){
            n= la;}
            else{
            n=lb;

            }
            int diff=Math.abs(la-lb);
            for(int i=n-1;i>=0;i--){
                ca = a.charAt(i);
                cb=b.charAt(i-diff);
             if(ca == '1' && cb == '1'){
                carry=1;
             }

                if(ca!= cb && carry==0){
                sum=sum+"0";
            } 
                else if(ca!= cb && carry==1){
                    sum=sum+"1";

                }
            }
              return sum;
        }
            
            public static void main(String[] args){
                Scanner ob = new Scanner(System.in);
                System.out.println("Enter two binary String");
                System.out.println("Enter first binary String");
                String s1= ob.nextLine();
                System.out.println("Enter second binary String");
                String s2= ob.nextLine();
                Leet67 obj = new Leet67();
                System.out.println("The sum is " + obj.addBinary(s1,s2));



            }


        }
    