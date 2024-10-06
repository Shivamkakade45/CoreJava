public class BitwiseOperator {

    public static void main(String[] args) {
        
        int p = 10, q = 15;
         
        // (&) Bitwise And operator.

        System.out.println(p & q);

        // (|) Bitwise OR operator.

        System.out.println(p|q);

        // Bitwise Exclusive OR operator.
        System.out.println(p^q);

        //Bitwise complement operator.

        System.out.println(~p);

        //Left shift.

        System.out.println(p<<1);
        System.out.println(p<<2);

        //Right shift.

        System.out.println(p>>1);
        System.out.println(p>>2);
    }
    
}
