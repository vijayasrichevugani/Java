import java.util.*;
public class Main{
    public static boolean isNumber(String n){
        for(int i=0;i<n.length();i++){
            if(Character.isDigit(n.charAt(i)) == false){
                return false;
            } 
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        
        if(isNumber(n)){
            System.out.println("Integer");
        }
        else{System.out.println("String");}
    } 
}
