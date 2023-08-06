// Printing Floyd's Triangle

public class zeroOneTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int num = 1;
        // Outer loop
        for( int i=1; i <= rows; i++)
        {
            // Inner loop
            for( int j=1; j <= i; j++)
            {
                int sum = i + j;
                if( sum % 2 == 0) // Even
                {
                    System.out.print("1 "); 
                }else{                          // Odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}