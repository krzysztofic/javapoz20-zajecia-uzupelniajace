package com.sda.prototype;

public class PrototypeApplication {

    public static void main(String[] args) {

        QueuePrototypeEnum.A.push("one");
        QueuePrototypeEnum.A.push("two");
        QueuePrototypeEnum.A.push("three");

        QueuePrototypeEnum.A.pop();

        QueuePrototypeEnum.B.push("one-b");
    }
}
