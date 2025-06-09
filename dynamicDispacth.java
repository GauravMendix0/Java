class demo
{
    public void show()
    {
        System.out.println("in demo show");
    }
}

class demo2 extends demo
{
    public void show()
    {
        System.out.println("In demo 2 show");
    }
}

public class dynamicDispacth 
{
    public static void main(String[] args) {
        
        demo d =new demo2();
        d.show();

    }
}
