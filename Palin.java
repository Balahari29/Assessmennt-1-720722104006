import java.util.*;
public class Palin {
    public static void main(String[] args) {
        System.out.println("Enter the palindrome");
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        Builder(str);
        builtin(str);
        withoutbuiltin(str);
        buffer(str);
        substr(str);
        subbuild(str);
        subbuffer(str);
    }
    static void Builder (String str){
        StringBuilder sb = new StringBuilder(str);
       StringBuilder  d = new StringBuilder(sb.reverse());
        String rev = d.toString();
        if(str.equals(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    static void withoutbuiltin   (String str){
        int i=str.length()-1;
        boolean flag = true;
      for(int j=0;j<i;j++){
        
        if(str.charAt(i) != str.charAt(j)){
            flag = false;   
            break;
        }
    
        i--;
      } 
      if(flag){
          System.out.println("Yes");
      }
      else{
          System.out.println("No");
      }
    }


static void buffer(String str){
    StringBuffer sb = new StringBuffer(str);
    StringBuffer d = new StringBuffer(sb.reverse());
    String rev = d.toString();
    if(str.equals(rev)){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
}

static void builtin(String str){
    StringBuffer ve = new StringBuffer(str);
    StringBuffer d = new StringBuffer(ve.reverse());
    String rev = d.toString();
    if(str.equals(rev)){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
}
}
static void substr(String str){
    String obj = str.substring(2,str.length()-1);
    System.out.println(obj);
}
static void subbuild(String str){
    StringBuilder bd =new StringBuilder(str);
    String obj = bd.substring(2,bd.length()-2);
    System.out.println(obj);
}
static void subbuffer(String str){
    StringBuffer bf = new StringBuffer(str);
    String obj = bf.substring(2,bf.length()-3);
    System.out.println(obj);
}
}    
