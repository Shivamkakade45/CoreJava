public class UnaryOperator {

    public static void main(String[] args) {
        
       int p = 5, q = 5;

       //post-increment
       System.out.println(p++);
       System.out.println(p);

       //pre-increment

       System.out.println(++q);
       System.out.println(q);

       int x = p++;
       int y = ++q;

      System.out.println(x);
      System.out.println(y);
    }
    
}
