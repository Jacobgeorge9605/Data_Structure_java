
import java.util.*;

class mat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][];
        System.out.println("Enter rows amd colomns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        a = new int[row][col];
        System.out.println("Enter matrix elements");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
           
        }

        System.out.println("Entered matrix is");
        System.out.println();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                // System.out.println();
                
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println();
        // int sum=0,i,j;
        // for( i=0;i<row;i++)
        // {
        //     for( j=0;j<col;j++)
        //     {
        //         if((a[i][j]%2)!=0)
        //         {
        //             sum=sum+a[i][j];
        //         }
        //     }

        // }
        // System.out.println("Sum of odd elements is "+sum);



        


    }
}

