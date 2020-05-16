package com.sda.singleton;

public class CountAction implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 100000 ; i++) {
            CountService.instanceOf().increment();
        }
    }
}
