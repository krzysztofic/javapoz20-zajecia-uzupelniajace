package com.sda.chain;

public class AmbulanceChainItem implements ChainItem {


    @Override
    public boolean test(String value) {
        return value.contains("ambulance");
    }

    @Override
    public void action(String value) {
        System.out.println("Calling to nearest hospital for an ambulance");

    }
}
