package com.company;
class abcd implements Runnable{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("My child thread");
//            Thread.sleep(1000);
        }
    }
}
public class Multi_threding_implementingrunnableinterface {
    public static void main(String[] args) {
    abcd r = new abcd();
    Thread th = new Thread(r);
    th.start();
        for (int i=0;i<5;i++){
            System.out.println("main thread");
        }
    }
}

