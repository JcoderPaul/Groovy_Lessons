package com.oldboy.lesson_20

import groovy.transform.Canonical

@Canonical
class Programmer {
    String fName
    String secretName
    Integer age
    BigDecimal experience

    /*
    Посмотрим, как происходит эволюция трех полей
    (thisObject, owner, delegate) в closure при его
    вызове. Для этого создадим один closure внутри
    другого
    */
    def getClosureInfo(){
        Closure gInfo = {
            println thisObject
            println owner
            println delegate
                Closure innerClosure = {
                    println thisObject
                    println owner
                    println delegate
                }
                /* Выводим инф. в консоль из innerClosure */
                innerClosure()
        }
        /* Выводим инф. в консоль из gInfo */
        gInfo
    }
}
