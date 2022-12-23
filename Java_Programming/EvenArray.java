import java.util.*;
class EvenArray
{
	public static void main(String args[])
	{
		int a[],i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : \t");
	        int n=sc.nextInt();
	        a= new int[n];
	        System.out.println("Enter the Array elements : \t");
	        for(i=0;i<n;i++)
	        {
	        	a[i]=sc.nextInt();
	        
	        }
	         System.out.println("....The even numbers are.... \t\n");
	         
	        for(i=0;i<n;i++)
	        {
	        	if(a[i]%2==0)
	        	System.out.println(a[i]);
	        	
	        }
	        
	        
	}


}