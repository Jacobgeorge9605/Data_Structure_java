class Operation
{
    static int mult(int x, int y)
    {
        return x*y;
    }
    static double divide(double x, double y)

    {
        return x/y;
    }
}
class Stat_Demo
{
    /// in static no need to create object of operation class 

    
   public static void main(String args[])
   {
   /*int x = Operation.mult(20,5);
   double y = Operation.divide(20.0,5.0);

   System.out.println("multiplication of x and y is : " +x);
   System.out.println("Division of two numbers are : " +y);*/
   System.out.println("multiplication of x and y is : " +Operation.mult(5,6));
   System.out.println("Division of two numbers are : " +Operation.divide(10,5));
   }
   

}