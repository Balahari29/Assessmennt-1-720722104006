import java.util.*;
public class Aplhanumeric {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
        alpha(str);
        sc.close();
    }
    static void alpha(String str){
        String s ="";
        int n =0;
        String ch ="";
        for(int i=0;i<=str.length()-1;i++){
            
            if(Character.isLetter(str.charAt(i))){
                ch = ch + str.charAt(i);
            }
            
            else{
                n = str.charAt(i) - '0';
                for (int j = 0; j < n; j++){
                    s= s+ch;
                }
                ch = "";
            }
            
        }
        s+=ch;
        System.out.println(s);  
    }
}


