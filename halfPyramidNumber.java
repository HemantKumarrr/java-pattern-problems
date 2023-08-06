// Printing Half Pyramid with Number's *

public class halfPyramidNumber {
    public static void main(String[] args){
        int rows = 5;

        // Outer loop
        for( int i=1; i<=rows; i++)
        {
            // Inner loop
            for( int j=1; j<=i; j++)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}