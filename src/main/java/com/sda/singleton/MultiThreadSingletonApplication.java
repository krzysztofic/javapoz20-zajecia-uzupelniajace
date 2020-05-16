package com.sda.singleton;

import static java.lang.Thread.sleep;

public class MultiThreadSingletonApplication {

    public static void main(String[] args) throws InterruptedException {

        CountService countService = CountService.instanceOf();

        CountAction countAction = new CountAction(countService);
        CountAction countAction2 = new CountAction(countService);
        CountAction countAction3 = new CountAction(countService);
        CountAction countAction4 = new CountAction(countService);

        Thread thread = new Thread(countAction);
        Thread thread2 = new Thread(countAction2);
        Thread thread3 = new Thread(countAction3);
        Thread thread4 = new Thread(countAction4);

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();

        sleep(100);

        System.out.println(countService.getCount());

    }
}
