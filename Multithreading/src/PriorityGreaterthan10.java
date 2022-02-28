public class PriorityGreaterthan10 extends Thread  
{    
    public void run()  
    {    
        System.out.println("running...");    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
    	PriorityGreaterthan10 t1=new PriorityGreaterthan10();    
    	PriorityGreaterthan10 t2=new PriorityGreaterthan10();  
        // set the priority  
        t1.setPriority(12);  
        t2.setPriority(7);  
        // print exception because priority of t1 is greater than 10  
        System.out.println("Priority of thread t1 is: " + t1.getPriority());   
        System.out.println("Priority of thread t2 is: " + t2.getPriority());   
        // call the run() method  
        t1.start();  
    }  
}  