package Multithreading;

class myData {
    synchronized void display(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}

class myThread1 extends Thread {
    myData d;
    myThread1(myData dat) {
        d = dat;
    }
    public void run() {
        d.display("Hello World ");
    }
}

class myThread2 extends Thread {
    myData data;
    myThread2(myData dat) {
        data = dat;
    }
    public void run() {
        data.display("Welcome");
    }
}

public class monitor {
    public static void main(String arg[]) {
        myData d = new myData();
        myThread1 t1 = new myThread1(d);
        myThread2 t2 = new myThread2(d);
        t1.start();
        t2.start();
    }
}
