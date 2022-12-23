class A
{
    static void show()
    {
        System.out.println("Iam in A");
    }
}
class B extends A{
    static void show(){
        System.out.println("Iam in B");
    }
}

class OverRiding
{
    public static void main(String args[])
    {
        A a =new A();
        B b = new B();
        a.show();
        b.show();
    }
}