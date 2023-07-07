package com.oldboy.lesson_8;

public class Person {
    private final int id;

    public Person(int id) {
        this.id = id;
    }
    /* Данный метод будет неявно вызван в операторе switch */
    public boolean isCase(Object switchValue){
        System.out.println("invoke isCase -> " + switchValue);
        return false;
    }

    public int getId() {
        return id;
    }
}
