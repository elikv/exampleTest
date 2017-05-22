package mulThread.Runnable;

/**
 * 4个进程售票100张
 * @author elikv
 *
 */
public class ThreadDemo1{
	  public static void main(String[] args){
	    ThreadTest t = new ThreadTest();
	    new Thread(t).start();
	    new Thread(t).start();
	    new Thread(t).start();
	    new Thread(t).start();
	  }
	  
	  
	  static class ThreadTest implements Runnable{
		  private int tickets = 100;
		  public void run(){
		    while(true){
		      if(tickets > 0){
		        System.out.println(Thread.currentThread().getName() +
		          " is saling ticket " + tickets--);
		      }
		    }
		  }
		}
	  
	}
