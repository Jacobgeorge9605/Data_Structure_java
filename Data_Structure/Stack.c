#include <stdio.h>
int A[50] , size;
int top =-1;

void push();
void pop();
void display();

void main()
{
    int choice,n;
    printf("Enter the size of the stack\n\t");
    scanf("%d",&size);

    do
    {
        printf("\n 1.Push The Element \n 2.Delete An Element \n 3.Dispaly An Element \n 4.Exit\n\t");
        printf("Enter your choice\n");
        scanf("%d",&choice);

        switch(choice)
        {
            case 1:
                printf("Enter the value to be inserted\n\t");
                scanf("%d",&n);
                push(n);
            break;

            case 2:
                pop();
            break;

            case 3:
                display();
                break;

            case 4:
                break;

            default:
                printf("It is invalid choice\n");

        }
    }
    while (choice != 4);
}
void push(int item)
{
    if(top == size -1)
    {
        printf("Stack is Full\n");
    }
    else
    {
        top = top+1;
        A[top] = item;
    }
}
void pop()
{
    if(top == -1)
    {
        printf("Stack is Empty");
    }
    else
    {
        printf("The poped element is %d\n\t",A[top]);
        top = top-1;
    }
}
void display()
{
    int i;
    if(top == -1)
    {
        printf("stack is empty");
    }
    else
    {
        for(i=0; i<=top; i++)
        {
            printf("%d\n\t",A[i]);
        }
    }
}