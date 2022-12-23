class Room
{
    int length;
    int breadth;
    Room(int x , int y)
    {
        length = x;
        breadth = y;
    }
    double calcArea()
    {
        return length*breadth;
    }
}
class Bedroom extends Room
{
    int height;
    Bedroom(int x, int y, int z)
    {
        super(x,y);
        height = z;
    }
    double calcVolume()
    {
        return length*breadth*height;
    }
}
class InheritanceDemo
{
    public static void main(String args[])
    {
        Room r1 = new Room(5,4);
        System.out.println("Area of the Room is" +r1.calcArea());
        Bedroom b1 = new Bedroom(2,5,8);
        System.out.println("Volume of the bedroom is " +b1.calcVolume());
    }
}