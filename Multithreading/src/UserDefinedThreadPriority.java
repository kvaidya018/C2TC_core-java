public class UserDefinedThreadPriority extends Thread  
{    
    public void run()  
    {    
        System.out.println("running...");    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
        UserDefinedThreadPriority t1=new UserDefinedThreadPriority();    
       
        // set the priority  
         
        t1.setPriority(7);  
        // print the user defined priority   
   
        System.out.println("Priority of thread t1 is: " + t1.getPriority()); //7  
        // this will call the run() method  
        t1.start();  
    }  
}  