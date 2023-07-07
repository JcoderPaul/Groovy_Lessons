package com.oldboy.lesson_19

import groovy.transform.Canonical

@Canonical
class MagicMaster {
    String name
    String magicSpeciality
    Integer magicLevel

    /*
    Первый параметр это название метода вызвавшего missing процесс
    (т.е. название метода которого не нашли в массиве методов Groovy)
    второй это массив аргументов который мы можем передать в наш
    переопределенный метод
    */
    def methodMissing(String name, Object arguments){
        println "MissingMethod $name is invoked with arg: $arguments"
    }
    /*
    Переопределяем метод реагирующий на missing процесс при обращении
    к несуществующим полям данного класса.
    */
    def propertyMissing(String propertyName) {
        "property missing '$propertyName' is not available"
    }
}
