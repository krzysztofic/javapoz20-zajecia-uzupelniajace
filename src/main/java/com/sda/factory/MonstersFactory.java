package com.sda.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonstersFactory {
    private Level level;

    public MonstersFactory(Level level) {
        this.level = level;
    }

    public List<Monster> chapterOne(){
        List<Monster> zombies = Arrays.asList(new Zombie(level.getValue() * 2,5), new Zombie(level.getValue() * 4,6));
        List<Archer> archers = Arrays.asList(new Archer(level.getValue() * 15,11));
        List<Sorcerer> sorcerers = Arrays.asList(new Sorcerer(level.getValue() * 50,2));

        List<Monster> monsters= new ArrayList<>();

        monsters.addAll(zombies);
        monsters.addAll(archers);
        monsters.addAll(sorcerers);

        return monsters;
    }

    public List<Monster> chapterTwo(){
        return Arrays.asList(
                new Sorcerer(50,level.getValue() * 2),
                new Sorcerer(100,level.getValue() * 2),
                new Sorcerer(500,level.getValue() * 100)

        );
    }

}
