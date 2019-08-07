
public abstract class Myclass {
    int x;
    int y;

    Myclass()
    {
       x = 10;
       y = 20;
       System.out.println("inside constructor");
    }
    public void finalize()
    {
        System.out.println("inside destructor");
    }
    abstract void display();
     //{
      //System.out.println("the x value is "+x);
     //System.out.println("the y value is"+y);
     //}
     public static void main(String[] args)
     {
         Myclass a = new newMyclass();
         a.display();
         a.finalize();
     }
}
class newMyclass extends Myclass{
     void display()
     {
         System.out.println("the x value is "+x);
         System.out.println("the y value is"+y);
     }
}

