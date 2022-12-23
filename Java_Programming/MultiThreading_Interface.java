import java.lang.Exception;
class A implements Runnable
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("From A :-" +i);
        }
    }
    
}
class B extends Thread
{
    public void run()
    {
        for(int i=0; i<10; i=i+2)
        {
            System.out.println("From B:-" +i);
        }
    }
}
class MultiThreading_Interface
{
    public static void main(String args[])
    {
        A a =new A();
        B b =new B();

        a.start();
        b.start();
    }
}