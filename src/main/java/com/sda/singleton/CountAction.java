package com.sda.singleton;

public class CountAction implements Runnable {

    private CountService countService;

    public CountAction(CountService countService) {
        this.countService = countService;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100000 ; i++) {
            countService.increment();
        }
    }
}
