import java.util.*;

public class UnaryOperators {
    public static void main(String[] args){
        int x= 10;
        System.out.println(" ~ operator "+ ~x);
        System.out.println(" ! operator "+ !(x>100));
        System.out.println(" ++x operator "+ (++x));
        System.out.println(" x++ operator "+ (x++));
        System.out.println(" --x operator "+ (--x));
        System.out.println(" x-- operator "+ (x--));
        System.out.println(" Bitwise complement of "+x+" is " +(~x));
    }
}
