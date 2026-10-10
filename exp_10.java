class Buffer {
    private int data;
    private boolean available = false;

    synchronized void produce(int value)
            throws InterruptedException {

        while (available) {
            wait();
        }

        data = value;
        available = true;

        System.out.println("Produced: " + data);
        notifyAll();
    }

    synchronized int consume()
            throws InterruptedException {

        while (!available) {
            wait();
        }

        int value = data;
        available = false;

        System.out.println("Consumed: " + value);
        notifyAll();

        return value;
    }
}

class Producer extends Thread {
    private Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class exp_10 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
