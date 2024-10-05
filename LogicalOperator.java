public class LogicalOperator {

    public static void main(String[] args) {
        
        int p =10, q = 15,r = 5;
      
        //And Operator (&&)

        System.out.println((p>r) && (q>p));
        System.out.println( (p>q) && (r>q));

        // OR Operator (||)

        System.out.println((p>r) || (p>q));
        System.out.println((p<r) || (p>q));

        //Not equal to  (!=)


        System.out.println(!(p==q));
    }
    
}
