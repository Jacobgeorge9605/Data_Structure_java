import java.util.*;
class SparceMatrixException extends Exception
{
    SparceMatrixException()
    {
        super();
    }
}

class SparceTransExp
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the row and coloumn of the matrix");
        int Mat[][];
        int MatTrans[][];
        int ZeroCount = 0,i,j;
        int row = sc.nextInt();
        int col = sc.nextInt();
         Mat = new int[row][col];
         MatTrans = new int[col][row];
        System.out.println("Enter matrix elements..");

        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                Mat[i][j] = sc.nextInt();

                if(Mat[i][j] == 0)
                {
                    ZeroCount++;
                }
            }
        }
        try
        {
            if(ZeroCount >(row*col)/2)
            {
                throw new SparceMatrixException();
            }
            else
            {
                System.out.println("Transpose of the matrix is..");
                for(i=0; i<row; i++)
                {
                    for(j=0; j<col; j++)
                    {
                        MatTrans[i][j] = Mat[j][i];
                        System.out.print(MatTrans[i][j] +"\t");
                    }
                    System.out.println();
                }
            }
        
        }
        catch(SparceMatrixException e)
            {
                System.out.println("Sorry It is a sparce matrix");
            }
        finally
        {
            System.out.println("Thank you for using ...");
        }

                
                    
                

    }
}