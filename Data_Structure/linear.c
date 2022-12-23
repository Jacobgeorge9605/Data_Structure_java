#include <stdio.h>
void main()
{
    int num[10],i,n,usernum,found;
    printf("Enter the limit \n");
    scanf("%d",&n);
    num[n];

    printf("Enter %d elements \n",n);
    for(i=0; i<n; i++)
    {
        scanf("%d",&num[i]);
    }

    printf("Enter a element that you are find in the array \n");
    scanf("%d",&usernum);

    for(i=0; i<n; i++)
    {
        if(num[i] == usernum)
        {
           found=1;
           break;
        }

    }
    if(found == 1)
    {
        printf("\n %d foud at the position %d ", usernum , i+1);
    }
    else
    {
        printf("%d is not found ", usernum);
    }
}