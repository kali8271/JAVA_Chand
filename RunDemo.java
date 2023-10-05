class Logic implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(i +" by" + Thread.currentThread().getName());    
        }   
    }
    
}
public class RunDemo {
    public static void main(String[] args) {
        Thread pb = Thread.currentThread();
        System.out.println("Main Method = "+pb.getName());
        System.out.println("Main Priority = "+pb.getPriority());
        pb.setPriority(8);
        System.out.println("Now = "+pb.getPriority());

        Logic obj = new Logic();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();
    }
}
