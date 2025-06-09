class count
{
    int cnt;
    public synchronized void incre()
    {
        cnt++;
    }
    public void show()
    {
        System.out.println(cnt);
    }
    
}



public class synchro 
{
    public static void main(String[] args) throws InterruptedException {
    
        count c1 = new count();
        Runnable r1=new Runnable()
        {
            public void run()
            {
                for(int i=0;i<1000;i++)
                {
                    c1.incre();
                }
            }
        };

        Runnable r2=new Runnable()
        {
            public void run()
            {
                for(int i=0;i<1000;i++)
                {
                    c1.incre();
                }
            }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        c1.show();



    }
}
