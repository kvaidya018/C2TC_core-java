
public class MinimumPriorityThread extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
    	MinimumPriorityThread t1=new MinimumPriorityThread();    
        // print the maximum priority of this thread  
        t1.setPriority(Thread.MIN_PRIORITY);    
        // call the run() method  
        t1.start();    
    }    
}  