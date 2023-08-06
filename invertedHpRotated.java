// Printing Inverted Half Pyramid (rotated 180deg) *

public class invertedHpRotated {
    public static void main(String[] args){
        int rows = 4;

        // Outer loop
        for( int i=1; i<=rows; i++)
        {
            // Inner loop --> space print
            for( int s=1; s<= rows-i; s++)
            {
                System.out.print(" ");
            }

            // Inner loop --> star* print
            for( int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}