package com.sda.factory;

public enum Level {
    NORMAL(1), NIGHTMARE(15), HELL(100);

    private Integer value;

    Level(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
