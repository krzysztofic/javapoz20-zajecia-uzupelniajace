package com.sda.factory;

public abstract  class BaseMonster {
    private Integer attack;
    private Integer defend;

    public BaseMonster(Integer attack, Integer defend) {
        this.attack = attack;
        this.defend = defend;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefend() {
        return defend;
    }

}
