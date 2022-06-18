import java.util.*;
public class Main{
    public static void ReverseWords(String st[]){
        String res="";
        for(int i=st.length-1;i>=0;i--){
            res += st[i]+" ";
        }
        System.out.println(res.substring(0,res.length()-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String");
        String s = sc.nextLine();
        
        String st[] = s.split(" ");
        System.out.println("array "+st.length);
        
        ReverseWords(st);
    } 
}
