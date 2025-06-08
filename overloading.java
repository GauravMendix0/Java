class demo
{
    int x=10;
    public void show()
    {
        System.out.println("In a show");
    }

    public void show(int num)
    {
        System.out.println("Now in show int");
    }
}

class demo2 extends demo
{
    public void show()
    {
        System.out.println("In the class demo2 show");
    }
}

public class overloading {
    public static void main(String[] args) {
        demo2 d=new demo2();

        d.show();

        //hello
    }
}
