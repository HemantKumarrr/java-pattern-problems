// Printing Inverted Half Pyramid with Number's *

public class invrtHpNumber {
    public static void main(String[] args){
        int rows = 5;

        // Outer loop
        for( int i=rows; i >= 1; i--)
        {
            // Inner loop
            for( int j=1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}