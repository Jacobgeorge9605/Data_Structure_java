/*#include <stdio.h>
void main()
{
    int arr[10],Usernum,n,low,high,mid,i;
    printf("Enter the limit for array");
    scanf("%d",&n);
    arr[n];
    printf("Enter the array elements");
    for(i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }
    low = 0, high  = n-1 ,mid=(low + high)/2;
    printf("Enter the elements to want to search");
    scanf("%d",&Usernum);

    while(low <= high)
    {
        if(Usernum == arr[mid])
        {
            printf("%d is found at the location of %d",Usernum,mid+1);
            break;
        }
        else if(Usernum > arr[mid])
        {
            high = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
        mid=(low +high)/2;
    }
    if(low > high)
    {
        ("Sorry the element is npt found");
    }




}
#include <stdio.h>
void main()
{
int a[10],i,n,item,flag=0,low,high,mid;
printf("enter the size of the array:-\n");
scanf("%d",&n);
printf("Element in ascending order:-\n");
    for(i=0;i<n;i++)
    {
  		 scanf("%d",&a[i]);
    }
    printf("Enter the element to search:-\n");
    scanf("%d",&item);
    low=0,high=n-1;
    while(low<=high)
    {
    mid=(low+high)/2;
    if(item==a[mid])
    {
    flag=1;
    break;
    }
    else if(item<a[mid])
    {
    high=mid-1;
    }
    else
    low=mid+1;
    }
 	if(flag==0)
 	printf("the number is not found\n");
 	else
 	printf("The number is found and its position is %d \n",mid+1);
}
*/
#include <stdio.h>
void main()
{
    int arr[10],n,i,Usernum,mid,high,low,flag =0;
    printf("Enter the limit of the array");
    scanf("%d",&n);
    arr[n];
    printf("Enter the array elements");
    for(i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the array elament that you want to search");
    scanf("%d",Usernum);
    low =0,high = n-1;
    while(low <= high)
    {
        mid = (low+high)/2;
        if(Usernum == arr[mid])
        {
            flag =1;
            break;
        }
        else if(Usernum <arr[mid])
        {
            high = mid -1;

        }
        else
        {
            low = mid+1;
        }
    }
    if(flag ==0 )
    {
        printf("%d is found at the location %d",Usernum,mid+1);
    }
    else
    {
        printf("The array element is not present");
    }

}