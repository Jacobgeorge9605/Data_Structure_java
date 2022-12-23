class Complex
{
    int real;
    int img;
    Complex()
    {
        real = 0;
        img = 0;
    }
    Complex AddComplex(Complex c)
    {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.img = this.img + c.img;
        return result;
    }
    void displaycomplex()
    {
        System.out.println(real + " +i" +img);
    }
}

class ComplexDemo
{
    public static void main(String args[])
    {
        Complex c1 = new Complex(10,5);
        Complex c2 = new Complex(10,2);
        Complex c3 = c1.AddComplex(c2);

        c1.diaplaycomplex();
        c2.displaycomplex();
        c3.displaycomplex();
    }
}