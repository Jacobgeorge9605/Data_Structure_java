import java.util.Scanner;
import java.util.*;
class PerCent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter maths mark");
        int sub1=sc.nextInt();
        System.out.println("Enter physics mark");
        int sub2=sc.nextInt();
        System.out.println("Enter chemistry mark");
        int sub3=sc.nextInt();
        System.out.println("Enter biology mark");
        int sub4=sc.nextInt();
        System.out.println("Enter social mark");
        int sub5=sc.nextInt();
        
        float a=((sub1+sub2+sub3+sub4+sub5)/500);
        float perc=(a*100);
         System.out.println("Overall percentage in 5 subject is:-  " +perc + "  percentage " );
        //System.out.println(a);


    }
}
