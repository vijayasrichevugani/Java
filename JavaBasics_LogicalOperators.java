public class {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 20, d = 0;
 
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
        
        /*Using AND Operator*/

        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
        
        /*Using OR Operator*/
        
        if (a > b || c == d)
            System.out.println("One or both"
                               + " the conditions are true");
        else
            System.out.println("Both the"
                               + " conditions are false");
        
        /*Using NOT Operator*/

        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
        
    }
}
