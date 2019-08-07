
interface sample
{
    int a = 10;
    void display();
}

class MyClass1 implements sample
{
    public void display()
    {
        System.out.println("the value is");
    }

    public static void main (String[] args)
    {
        MyClass1 t = new MyClass1();
        t.display();
        System.out.println(a);
    }
}