#include <stdio.h>
void main()
{
    int arr[50],i,j,min,n;

    printf("Enter the limit of the array");
    scanf("%d",&n);
    arr[n];

    printf("Enter the element that you want to sort");
    for(i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }
    
    for(i=0; i<n-1; i++)
    {
        min = i;
        for(j=i+1; j<n; j++)
        {
            if(arr[j] < arr[min])
            {
            min =j;
            }
        }
        if(i != min)
        {
            int temp;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

       
    }
     printf("Your Soarted array is:-  \n\t");
        for(i=0;i<n;i++)
        {
            printf("%d\n \t",arr[i]);
        }
}