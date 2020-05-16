package com.sda.singleton;

import java.util.LinkedList;
import java.util.List;

public class Queue {

    private static Queue instance;

    public static Queue instanceOf(){
        if (instance == null) {
            instance = new Queue();
        }
        return instance;
    }

    private List<String> names;

    private Queue(){
        this.names = new LinkedList<String>();

    }

    public void push (String name){
        this.names.add(name);
    }

    public String pop(){
        if (this.names.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        String value = this.names.get(0);
        this.names.remove(0);
        return value;

    }
}
