package Threads;

class Customer{
    int amount =10000;

    synchronized public void withdraw(int amount1){
        System.out.println("enter into the withdraw");

        if(this.amount<amount1){
            System.out.println("less  amount:waiting for deposit...");

        try{
            wait();
        }
        catch(Exception e){
            System.out.println(e);
        }

            }
        System.out.println("withdraw sucessfull " +amount1);
        this.amount-=amount1;
        System.out.println("withdraw completed:leftover amount is " +amount );

    }
    synchronized public void deposit(int amount1){
        System.out.println("going to deposit");
        this.amount+=amount1;

        System.out.println("deposit completed" + amount1);
        notify();
    }
}

public class Simple_wait_Notify {
    public static void main(String[] args){
        Customer c1=new Customer();

        new Thread(){
            public void run(){
                c1.withdraw(5000);
            }
        }.start();

          new Thread() {
            public void run(){
                c1.withdraw(4000);
            }
        }.start();

        new Thread(){
            public void run(){
                c1.withdraw(10000);
            }
        }.start();

        new Thread(){
            public void run(){
                c1.deposit(20000);
            }
        }.start();

    }
}
