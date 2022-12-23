import java.util.*;
class Matrix
{
    int row;
    int colomn;
    int a[][];
    Matrix(int row, int colomn)
    {
        this.row=row;
        this.colomn=colomn;
        a = new int[row][colomn];
    }

    void AddElements()
    {
        System.out.println("Enter matrix Elaments");
        Scanner sc = new Scanner(system.in);
        for (int i=0; i<row; i++)
        {
            for (int j=0; j<colomn; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
    }
    Matrix MultiMat(Matrix M)
    {
        int r =this.row;
        int c =this.colomn;
        Matrix result = new Matrix(r,c);
        if (this.colomn == M.row)
        {
            int sum;
            for (int i=0; i<r; i++)
            {
                for (int j=0; j<c; j++)
                {   
                    sum =0;
                    for(int k =0; k<M.row;k++)
                    {
                        sum += ((this.a[i][k])*(M.a[k][j]));
                    }
                    result.a[i][j] = sum;
            
                }   
            }
        }
        else
        {
            System.out.println("sorry its error");
        }
        return result;
    } 
    void displayMat()
    {
        for (int i=0; i<row; i++)
        {
            for (int j=0; j<colomn; j++)
            {
                System.out.println(a[i][j] +"\t");
            }
            System.out.println();
    }
}

class Matmult
{
    public static void main(String args[])
    {
        Matrix M1 = new Matrix(3,4);
        M1.AddElements();
        Matrix M2 = new Matrix(2,2);
        M2.AddElements();
        Matrix M3 = M1.MultiMat(M2);
        M3.displayMat();
    }
}