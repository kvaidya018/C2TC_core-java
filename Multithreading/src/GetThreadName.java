public class GetThreadName extends Thread  
{    
    public void run()  
    {    
        System.out.println("Thread is running...");    
    }    
    public static void main(String args[])  
    {   
        // creating two threads   
    	GetThreadName t1=new GetThreadName();    
    	GetThreadName t2=new GetThreadName();    
        // return the name of threads  
        System.out.println("Name of t1: "+ t1.getName());    
        System.out.println("Name of t2: "+t2.getName());    
        // start t1  and t2 threads   
        t1.start();    
        t2.start();    
    }    
}  