package com.sda.prototype;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class QueuePrototype {

    private static List<QueuePrototype> instances = new ArrayList<QueuePrototype>() {{
        this.add(null);
        this.add(null);
        this.add(null);
    }};

    public static QueuePrototype instanceOf(int index) {
        if (index > 2 || index < 0) {
            return null;
        }

        QueuePrototype queuePrototype = instances.get(index);
        if (queuePrototype == null) {
            QueuePrototype element = new QueuePrototype();
            instances.add(index, element);
            return element;
        }
        return queuePrototype;
    }

    private List<String> names;

    private QueuePrototype(){
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