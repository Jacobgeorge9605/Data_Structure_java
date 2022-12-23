class Rectangle
{
    int length;
    int breadth;
    /* contructor used */
    Rectangle()
    {
        length = 5;
        breadth = 8;
    }

    /* Parameterised constructor is used */
    
    Rectangle(int x, int y)
    {
        length = x;
        breadth = y;
    }

    int calcArea()
    {
        return length*breadth;
    }
}

class ConstructorDemo
{
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.calcArea());
        Rectangle r2 = new Rectangle(5,5);
        System.out.println("Area is" +r2.calcArea());

    }

}