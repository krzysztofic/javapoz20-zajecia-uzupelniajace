package com.sda.singleton;

public class SingletonApplication {

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.push("Szymon");
        queue.push("Jan");
        queue.push("Damian");

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue.pop());
    }
}
