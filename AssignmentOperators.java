import java.util.*;

public class AssignmentOperators{
    public static void main(String[] args) {
        String a = "Hello";
        int x = 100;
        System.out.println("String "+a);
        System.out.println("Integer "+x);
        System.out.println("+= Operator "+ (x+=5));
        System.out.println("-= Operator "+ (x-=5));
        System.out.println("*= Operator "+ (x*=5));
        System.out.println("/= Operator "+ (x/=5));
        System.out.println("%= Operator "+ (x%=5));

    }
}