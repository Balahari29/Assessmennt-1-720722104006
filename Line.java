import java.util.*;
public class Line {
    public static void main(String[] args) {
        System.out.println("Enter the line");
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        linerev(str);
       
    }
    static void linerev(String str){
        int i = str.length()-1;
        String num2 =""; 
        String res = "";
        for(int j=i;j>=0;j--){
            if(str.charAt(j) == ' ' && (str.charAt(j+1) != ' ' || j==i)){
                res = res + num2 + " "; 
                num2 = "";
            }
            
            else if (str.charAt(j)!=' '){
                num2 = str.charAt(j) +num2;
            }
        
        }
        res+=num2;
        System.out.print(res);
    }
}
