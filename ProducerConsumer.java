class Logic {
    int data; 
    boolean available = false; 

    synchronized void consume() {
        while (available == false) 
        {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        available = false; 
        System.out.println("Consumer consumed= " + data);
        notify();
    }

    synchronized void produce(int value) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        data = value;
        available = true;
        System.out.println("Producer produced item number= " + data);
        notify();
    }
}

class Consumer extends Thread {
    Logic obj = null; 
    int limit;

    Consumer(Logic c, int n) {
        obj = c;
        limit = n;
    }

    public void run() {
        for (int i = 1; i <= limit; i++) {
            obj.consume();
        }
    }
}


class Producer extends Thread {
    Logic obj = null; 
    int limit;

    Producer(Logic c, int n)
    {
        obj = c;
        limit = n;
    }

    public void run() {
        for (int i = 1; i <= limit; i++) {
            obj.produce(i);
        }
    }
}

class ProducerConsumer {
    public static void main(String[] args) {
        int num = 5;
        Logic obj = new Logic();
        Producer p = new Producer(obj, num);
        p.start();
        Consumer c = new Consumer(obj, num);
        c.start();
    }
}