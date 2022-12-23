#include<stdio.h>
void main()
{
    int mat[10][10],row,col,i,j;
    int zerocount;

    printf("Enter the number of rows and coloumns...\n");
    scanf("%d%d",&row,&col);
    mat[row][col];

    printf("Enter matrix elemnts\n");
    for(i=0; i<row; i++)
    {
        for(j=0; j<col; j++)
        {
            scanf("%d",&mat[i][j]);
        }
       
    }
    printf("Youur Entered matrix is..\n");
    for(i=0; i<row; i++)
    {
        for(j=0; j<col; j++)
        {
            printf("%d\t",mat[i][j]);
        }
        printf("\n");
       
    }
    for(i=0; i<row; i++)
    {
        for(j=0; j<col; j++)
        {
            if(mat[i][j] == 0)
            {
                zerocount++;
            }    
        }
    }

    if(zerocount > (row+col)/2)
    {
        printf("The given matrix is a sparce matrix..\n");
    }
    else
    {
        printf("The given matrix is not a sparce matrix....\n");
    }
}