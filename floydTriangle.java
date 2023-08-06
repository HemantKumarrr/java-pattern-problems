// Printing Floyd's Triangle

public class floydTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int num = 1;
        // Outer loop
        for( int i=1; i <= rows; i++)
        {
            // Inner loop
            for( int j=1; j <= i; j++)
            {
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}