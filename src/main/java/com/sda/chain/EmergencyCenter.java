package com.sda.chain;

import java.util.ArrayList;
import java.util.List;

public class EmergencyCenter {

    private List<ChainItem> items;

    public EmergencyCenter() {
        this.items = new ArrayList<>();
    }

    public EmergencyCenter(List<ChainItem> items) {
        this.items = items;
    }

    public void handleRequest(String value){
        for (ChainItem item : items) {
            if (item.test(value)){
                item.action(value);
            }
        }
    }
}


