abstract class A
{
    abstract int show();
}

class B extends A
{
    @Override
    int show()
    {
        return 1;
    }
}


public class abstractex {

    public static void main(String[] args) {
        A a=new B();

        int n=a.show();
        System.out.println(n);
    }
    
}
