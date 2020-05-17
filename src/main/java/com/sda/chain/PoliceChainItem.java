package com.sda.chain;

public class PoliceChainItem implements ChainItem {

    @Override
    public boolean test(String value) {
        return value.contains("police");
    }

    @Override
    public void action(String value) {
        System.out.println("Calling to nearest police station");
    }
}
