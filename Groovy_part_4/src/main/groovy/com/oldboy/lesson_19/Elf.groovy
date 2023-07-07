package com.oldboy.lesson_19

import groovy.transform.Canonical

@Canonical
class Elf {
    String name
    Integer age

    /* Используя переопределение метода мы формируем динамический запрос к БД */
    def methodMissing(String name, Object arguments){
        println "MissingMethod $name is invoked with arg: $arguments"
        def field = name - 'findBy'
        println "SELECT * FROM Elf WHERE $field = ${arguments[0]}"
    }
}
