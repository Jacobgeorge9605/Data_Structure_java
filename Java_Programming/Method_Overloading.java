class Room
{
    int length;
    int breadth;
    Room(int x , int y) //// cobstrucor 1
    {
        length = x;
        breadth = y;
    }
    Room(int x) /// constructor 2
    {
        length = breadth =x;
    }
    double calcArea()
    {
        return length *breadth;
    }
}
class Method_Overloading
{
    public static void main(String args[])
    {
        Room r1 = new Room(10,20);
        System.out.println("Area of rectangle is \n\t" +r1.calcArea());
        Room r2 = new Room(5);
        System.out.println("Area of squre is \n\t " +r2.calcArea());
    }
}