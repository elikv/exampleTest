package mulThread.Runnable;

/**
 * 多线程runnable
 * @author elikv
 *
 */
    public  class RunnableTest1   
    {   
        public static void main(String []args)   
        {   
            ThreadTest test=new ThreadTest();   
            new Thread(test).start();   
            new Thread(test).start();   
            new Thread(test).start();   
            new Thread(test).start();   
        }   
    }   
    class ThreadTest implements Runnable   
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