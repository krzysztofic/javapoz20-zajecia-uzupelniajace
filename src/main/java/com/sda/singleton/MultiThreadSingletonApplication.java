package com.sda.singleton;

import static java.lang.Thread.sleep;

public class MultiThreadSingletonApplication {

    public static void main(String[] args) throws InterruptedException {

        CountAction countAction = new CountAction();
        CountAction countAction2 = new CountAction();
        CountAction countAction3 = new CountAction();
        CountAction countAction4 = new CountAction();

        Thread thread = new Thread(countAction);
        Thread thread2 = new Thread(countAction2);
        Thread thread3 = new Thread(countAction3);
        Thread thread4 = new Thread(countAction4);

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();

        sleep(100);

        System.out.println(CountService.instanceOf().getCount());

    }
}
