
import java.util.*;
class Complex
{
	int real;
	int img;
	Complex()
	{
		real = 0;
		img = 0;
	}
	Complex(int real,int img)
	{
		this.real = real;
		this.img = img;
	}
	void displayComplex()
	{
		System.out.println("\t" +real+ "+i" +img);
	
	}
	Complex AddComplex(Complex C)
	{

		Complex res=new Complex();
		res.real=this.real+C.real;
		res.img=this.img+C.img;
		return res;

	}
}
class ComplexSum
{
	public static void main(String args[])
	{
		Complex C1=new Complex(5,4);
		Complex C2=new Complex(6,2);
		Complex C3=C1.AddComplex(C2);
		
		C1.displayComplex();
		C2.displayComplex();
		C3.displayComplex();
	}
}