package com.oldboy.lesson_7;

public class Student {

    private final Integer id;

    public Student(Integer id) {
        this.id = id;
    }

    public boolean asBoolean(){
        return id > 10;
    }

    public Integer getId() {
        return id;
    }
}
