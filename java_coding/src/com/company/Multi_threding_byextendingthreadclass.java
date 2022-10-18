package com.company;
class abc extends Thread{
    @Override

    public void run() {
       try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("pavan");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException i){}
    }
}

public class Multi_threding_byextendingthreadclass {
    public static void main(String[] args) throws InterruptedException{
    abc th = new abc();
    th.start();
    for (int i=0;i<=5;i++){
        System.out.println("summer");
        Thread.sleep(1000);
    }
    }
}
