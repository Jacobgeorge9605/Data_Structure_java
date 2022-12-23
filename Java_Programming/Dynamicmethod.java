import java.util.*;
class Animal
{
	void makesound()
	{
		System.out.println("Unknown sound\n");
	}
}
class cat extends Animal
{
	void makesound()
	{
		System.out.println("Meouw\n");
	}
}

class dog extends Animal
{
	void makesound()
	{
		System.out.println("bow bow\n");
	}
}

class giraffe extends Animal
{
	void makesound()
	{
		System.out.println("No sound\n");
	}
}

class Dynamicmethod
{
	public static void main(String args[])
	{
		Animal ref;
		cat c1 = new cat();
		dog d1 = new dog();
		giraffe g1 = new giraffe();
		ref = c1;
		ref.makesound();
		ref = d1;
		ref.makesound();
		ref = g1;
		ref.makesound();
	}
}