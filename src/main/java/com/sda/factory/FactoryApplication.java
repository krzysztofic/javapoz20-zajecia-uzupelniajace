package com.sda.factory;

import java.util.List;

public class FactoryApplication {

    public static void main(String[] args) {

        MonstersFactory monstersFactory = new MonstersFactory(Level.NORMAL);

        List<Monster> monsters = monstersFactory.chapterOne();
        List<Monster> monsters1 = monstersFactory.chapterTwo();


        MonstersFactory monstersFactory1 = new MonstersFactory(Level.HELL);

        List<Monster> monsters2 = monstersFactory1.chapterTwo();
    }
}
