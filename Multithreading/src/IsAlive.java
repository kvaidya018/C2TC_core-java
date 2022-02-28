public class IsAlive extends Thread   
{  
    public void run()  
    {  
        try   
        {  
            Thread.sleep(300);  
            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());  
        }  
        catch (InterruptedException ie) {  
        }  
    }  
    public static void main(String[] args)  
    {  
        IsAlive t1 = new IsAlive();  
        System.out.println("before starting thread isAlive: "+t1.isAlive());  
        t1.start();  
        System.out.println("after starting thread isAlive: "+t1.isAlive());  
    }  
}  