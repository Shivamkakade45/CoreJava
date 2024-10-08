public class numberpattern4 {
    public static void main(String[] args) {
        
       int m = 5;
        int sum = 0;
       for(int i=1;i<5;i++){
        for(int j=1;j<=i;j++){
            sum = i+j;

            if(sum%2==0)
            System.out.print(0);
            else
            System.out.print(1);
        }
        System.out.println();
       }

    }
}
