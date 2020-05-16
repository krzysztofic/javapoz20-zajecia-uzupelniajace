package com.sda.singleton;

public class CountService {

    private static CountService instance;

    public static CountService instanceOf(){
        if(instance ==null){
            System.out.println("Creating Count Service");
            instance = new CountService();
        }
        return instance;
    }
    private Integer count = 0;

    private CountService(){
    }

    public synchronized void increment(){
        this.count = this.count + 1;
    }

    public  Integer getCount(){
        return count;
    }
}


