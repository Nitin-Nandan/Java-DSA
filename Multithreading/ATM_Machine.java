package Multithreading;

class ATM {
    public void checkBalance(String name) {
        System.out.println("Mr/Mrs " + name + " is checking Balance.");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("Balance");
        }
    }

    public void withdrawBalance(String name, int amt) {
        System.out.println("Mr/Mrs " + name + " is withdrawing amount " + amt);
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("Amount");
        }
    }
}

class Customer extends Thread {
    ATM atm;
    String name;
    int amount;
    
    public Customer(ATM atm, String name, int amount) {
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }
    
    public void useATM() {
        atm.checkBalance(name);
        atm.withdrawBalance(name, amount);
    }

    public void run() {
        synchronized(atm) {
            useATM();
        }
    }
}

public class ATM_Machine {
    public static void main(String arg[]) {
        ATM atm = new ATM();
        Customer cust1 = new Customer(atm, "Sahil", 2000);
        Customer cust2 = new Customer(atm, "Nitin", 3000);
        cust1.start();
        cust2.start();
    }
}