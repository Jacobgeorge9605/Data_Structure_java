import java.util.*;
class OddMat
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int matrix[][];
        int Oddsum=0;
        System.out.println("Enter row and coloumn of the matrix:- \t");
        int row = sc.nextInt();
        int col = sc.nextInt();
        matrix = new int[row][col];

        System.out.println("Enter The Matrix elements");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your entered matrix elements are");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println();
        }

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(matrix[i][j] %2 == 1)
                {
                    Oddsum = Oddsum + matrix[i][j];
                }
            }
        }

        System.out.println("The sum of odd elements in the matrix is : \t" +Oddsum);

    }
}