public class in1 {
    int a;
    int b;
    int sum;
    public void calc(int a,int b)
        {
        sum=a+b;
        }
        //method overloading
        public  void calc(String s)
        {
            System.out.println("the string is: "+s);
        }

        public void display()
        {
        System.out.println("the sum is"+sum);
        }
        public static void main(String args[])
        {
        in1 a= new in1();
        a.calc(10,20);
        a.calc("sss");
        a.display();
        //a.rr();
         }
}
        //inheritance
//class in2 extends in1 {
    //public  void rr()
    //{
     // System.out.println("the sum is calculated by a+b");
    //}
//}
    //Method ovverriding
    // public void display()
    //{
    //  System.out.println("the sum is ");
    //}
//}
