package Multithreading;

class MyData {
    int value = 0;
    boolean flag = true; // true-producer & false-consumer

    synchronized public void set(int v) {
        while(flag != true) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        value = v;
        flag = false;
        notify();
    }

    synchronized public int get() {
        int x = 0;
        while (flag != false) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    MyData d;

    Producer(MyData d) {
        this.d = d;
    }

    int i = 1;

    public void run() {
        while (true) {
            d.set(i);
            System.out.println("Produced : " + i);
            i++;
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}

class Consumer extends Thread {
    MyData d;

    Consumer(MyData d) {
        this.d = d;
    }

    public void run() {
        while (true) {
            System.out.println("Consumed : " + d.get());
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String arg[]) {
        MyData d = new MyData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }
}
