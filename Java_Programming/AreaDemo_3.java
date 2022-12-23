// class Triangle
// {
//     int base;
//     int height;

//     /* default constructor (constructor having values)*/
//     Triangle()
//     {
//         base = 4;
//         height = 5;
//     }

//     /* parameterized constructor  (Constructor not having values) */

//     Triangle(int b ,int h)
//     {
//         base = b;
//         height = h;
//     }

//     double calcArea()
//     {
//         return 0.5*base*height;
//     }
// }

// class AreaDemo_3
// {
//     public static void main(String args[])
//     {
//         Triangle t1 = new Triangle();
//         System.out.println("Area (using Default constructor ) :- " + t1.calcArea());
//         Triangle t2 = new Triangle(8,5);
//         System.out.println("Area (using parameterised constructor ) :- " + t2.calcArea());
//     }
// }

class Circle
{
    int radius;
    Circle()
    {
        radius = 5;
    }
    Circle(int r)
    {
        radius= r;
    }
    double calcArea()
    {
        return 3.14*radius*radius;
    }
}

class AreaDemo_3
{
    public static void main(String args[])
    {
        Circle c1 = new Circle();
        System.out.println("Area1 = "+c1.calcArea());
        Circle c2 = new Circle(10);
        System.out.println("Area2 = "+c2.calcArea());
    }
}