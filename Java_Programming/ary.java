import java.util.Scanner;
import java.util.*;
class ary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[];
        System.out.println("Enter the size");
        int n = sc.nextInt();
        a=new int[n];
        System.out.println("Enter elements to the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         System.out.println("Array is");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        int small=a[0];
        int large=a[0];
        int i;
        for( i=0;i<n;i++)
        {
            if(a[i]<small)
            {
                small=a[i];
            }
            else if(a[i]>large)
            {
                large=a[i];
            }
        }
        if(small==a[i])
        {
            System.out.println("Smallest element in the array is " +small);
        }
        else 
        {
            System.out.println("largest element in the array is " +large);
        }
        

    }

}