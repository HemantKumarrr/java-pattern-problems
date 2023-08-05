// Printing Hollow Rectangle *

public class hollowRectangle{
    public static void main(String[] args){
        int rows = 4;
        int columns = 5;

        // for printing Rows
        for( int i=1; i <= rows; i++)
        {
            // for printing Columns
            for( int j=1; j <= columns; j++)
            {
                if( i==1 || j==1 || i==rows || j==columns)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}