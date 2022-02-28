
public class NormPriorityThread extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
    	NormPriorityThread t1=new NormPriorityThread();    
        // print the maximum priority of this thread  
        t1.setPriority(Thread.NORM_PRIORITY);    
        // call the run() method  
        t1.start();    
    }    
}  