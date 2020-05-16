package com.sda.singleton;

public class CountService {

    private static CountService instance;

    public static CountService instanceOf(){
        if(instance ==null){
            instance = new CountService();
        }
        return instance;
    }
    private Integer count = 0;

    private CountService(){
    }

    public void increment(){
        this.count = this.count + 1;
    }

    public Integer getCount(){
        return count;
    }
}


