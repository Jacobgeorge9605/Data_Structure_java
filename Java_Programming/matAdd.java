import java.util.*;
class matAdd
{
    public static void main(String args[])
    {
    int matrix[][],i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("rows");
    int row = sc.nextInt();
    System.out.println("Columns");
    int col = sc.nextInt();

    matrix = new int[row][col];

    System.out.println("Rnter the Matrix elemenets");
    for(i=0; i<row; i++)    {
        for( j=0; j<col; j++)
        {
            matrix[i][j] = sc.nextInt();
        }
    }
