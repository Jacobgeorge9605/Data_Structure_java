import java.util.*;
class RevAry
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of the aray");
        int n = sc.nextInt();
        int i;
        int arr[];
         arr = new int[n];
        System.out.println("Enter array elements..");
        for(i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array elements is..");
        for( i =0;i<n; i++)
        {
            System.out.println(arr[i] +"\t");
        }
        System.out.println();

       
        for( i=0; i<n/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
         System.out.println("Your reversed array is");
         for(i=0; i<n; i++)
         {
            System.out.println(arr[i] +"\t");
         }
         System.out.println();
    }
}