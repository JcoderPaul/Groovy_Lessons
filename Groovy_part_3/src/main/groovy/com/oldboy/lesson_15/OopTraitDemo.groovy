package com.oldboy.lesson_15

class OopTraitDemo {
    static void main(String[] args) {
        def firstTech = new Teacher(fName:"Sufir", lName:"Havat", age:168, id:231)
        firstTech.each {println(it.fName + " " + it.lName + " " + it.age + " " + it.id)}
        Teacher secTeach = ["Gurnee","Haleck", 145]
        println(secTeach)
        println("---------------------------------------------------------------------")
        firstTech.properties.each {println(it)} // свойства объекта
        println("---------------------------------------------------------------------")
        /*
        Хотя применение mixin-ов практически сошло на нет, и аннотации
        deprecated - устарел о них нужно знать и уметь применять.
        */
        Teacher.mixin(Fighter.class)
        Teacher thirdTeach = ["Shaddam","Korino", 234]
        thirdTeach.printSrtFromMixin()
    }
}
