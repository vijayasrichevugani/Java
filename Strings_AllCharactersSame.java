import java.util.*;
public class Main{
    public static boolean allCharactersSame(String n){
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) != n.charAt(0)){
                return false;
            } 
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String");
        String n = sc.next();
        
        if(allCharactersSame(n)){
            System.out.println("All Characters are Same in the String");
        }
        else{System.out.println("All Characters are not Same in the String");}
    } 
}
