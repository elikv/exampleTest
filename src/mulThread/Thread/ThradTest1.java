package mulThread.Thread;
/**
 * 多线程thread 不推荐
 * @author elikv
 *
 */
public  class ThradTest1   
{   
    public static void main(String []args)   
    {   
        new ThreadTest().start();   
        new ThreadTest().start();   
        new ThreadTest().start();   
        new ThreadTest().start();   
    }   
}   
class ThreadTest extends Thread   
{   
    private int count=10;   
    public void run()   
    {   
        while(count>0)   
        {   
            System.out.println(Thread.currentThread().getName()+"   "+count--);   
        }   
    }   
} 
