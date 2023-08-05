// Printing Half Pyramid *

public class invertedHalfPyramid {
    public static void main(String[] args){
        int rows = 4;

        // for printing Rows
        for( int i=rows; i >= 1; i--)
        {
            // for printing Columns
            for( int j=1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}