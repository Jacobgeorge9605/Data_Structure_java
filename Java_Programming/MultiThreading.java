class A extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("From A" +i);
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int j=0; j<5; j++)
        {
            System.out.println("From B "+j);
        }
    }
}

class MultiThreading
{
    public static void main(String args[])
    {
        A a = new A();
        a.start(); //run method will be executed
        B b = new B();
        b.start();
    }
}