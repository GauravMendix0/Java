
class Hello implements Runnable
{
    public void run()
    {
        for(int i=0;i<1000;i++)
        {
            System.out.println("\n Hello");
        }
    } 

}

class Hi implements Runnable
{
    public void run()
    {
        for(int i=0;i<1000;i++)
        {
            System.out.println("\n Hi");
        }
    } 

}

public class threads {
    public static void main(String[] args) {
        
        Runnable r1=new Runnable() {
            public void run()
    {
        for(int i=0;i<1000;i++)
        {
            System.out.println("\n Hello");
        }
    } 
        };
        Runnable r2=new Hi();

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();


    }
}
