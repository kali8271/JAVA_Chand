class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                Thread.yield();
            }
            System.out.println("i : " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            if (j == 4) {
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) 
                {
                     System.out.println(e);
                }
            }
            System.out.println("J : " + j);
        }
    }
}

class C extends Thread
{
    public void run()
    {
        for (int k = 1; k <= 5; k++) 
        {
            if(k == 2)
            {
                try 
                {
                    Thread.sleep(1000);
                } catch (Exception e) 
                {
                    System.out.println(e);
                }
            }
            System.out.println("K : "+k);
        }
        
    }
}

public class MT 
{
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        C t3 = new C();

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main Thread");
    }
}
