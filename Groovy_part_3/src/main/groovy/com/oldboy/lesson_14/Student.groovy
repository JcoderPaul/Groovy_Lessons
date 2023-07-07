package com.oldboy.lesson_14

import groovy.transform.ToString
import groovy.transform.TupleConstructor

/*
В Groovy все поля private, а методы public, т.е. модификаторы можно и не указывать.
При этом у Groovy класса getter-ы и setter-ы уже существуют негласно.
*/
@ToString // аннотация Groovy для переопределения метода toString
@TupleConstructor // аннотация создает конструкторы "на все случаи жизни"
class Student {
    String firstName
    String lastName
    Integer age

    /*
    Переопределим метод *.getAt(), чтобы можно было проводить каскадное заполнение
    см. GroovyObjConstructor.groovy, в синтаксической последовательности:
    def (lastN, firstN) = princessIrulan
    */
    def getAt(Integer index){
        index == 0 ? firstName : lastName
    }
}