interface A
{
    abstract void show();
}

 interface D 
{
    void abc();
    
}

interface C extends A,D
{
    abstract void show3();
}


class B implements C
{    
    public void show()
    {
        System.out.println("In B show ");
    }
    
    public void show3()
    {
        System.out.println("in show3 ok");
    }

    public void bclass()
    {
        System.out.println("In b class");
    }
    public void abc()
    {
        
    }

   
}

 class interfaceex
{
    public static void main(String[] args) {
        C c = new B();

        c.show3();
        c.show();

        A a =(A)c;
        a.show();

        B b =(B) a;
        b.bclass();
        b.show();
        b.show3();


    }
}