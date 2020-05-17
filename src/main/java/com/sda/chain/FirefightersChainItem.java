package com.sda.chain;

public class FirefightersChainItem implements ChainItem{

    @Override
    public boolean test(String value) {
        return value.toLowerCase().contains("firefighters");
    }

    @Override
    public void action(String value) {
        System.out.println("Colling the nearest fireFighters station");

    }
}
