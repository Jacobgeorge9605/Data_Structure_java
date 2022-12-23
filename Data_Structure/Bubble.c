#include <stdio.h>
void main()
{
    int arr[10];
    int i,n,j;
    printf("---Enter the limit for n--- \n");
    scanf("%d",&n);
    arr[n];
    printf("---Enter the array elements--- \n");
    for(i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0; i<n-1; i++)
    
    {
        for(j=0; j<n-i-1; j++)
        {
            if(arr[j] > arr[j+1])
            {
                int temp;
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    printf("Your Bubble soarted array is \n");
    for(i=0; i<n; i++)
    {
        printf("%d\n",arr[i]);
    }
}