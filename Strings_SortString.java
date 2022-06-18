import java.util.*;
public class Main{
    public static void SortString(String s){
        char []arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String");
        String s = sc.next();
        
        SortString(s);
    } 
}
