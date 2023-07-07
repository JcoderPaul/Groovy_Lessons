package com.oldboy.lesson_19

class MissingMethodDemo {
    static void main(String[] args) {
        def gendolfGrey = new MagicMaster()
        /*
        Вызовем метод и поле которого нет у класса MagicMaster,
        естественно выбросится groovy.lang.MissingMethodException,
        но мы можем переопределить метод метакласса methodMissing
        в нашем классе MagicMaster.groovy.

        После переопределения метода *.methodMissing() в консоли
        мы получили:
        *************************************************************
        MissingMethod killTheTroll is invoked with arg: [15]
        *************************************************************
        */
        gendolfGrey.killTheTroll(15)
        /* Теперь нам нужно переопределить метод *.propertyMissing() */
        println gendolfGrey.age
        /*
        Теперь бросков исключений нет и на экране видим:
        *************************************************************
        MissingMethod killTheTroll is invoked with arg: [15]
        property missing 'age' is not available
        *************************************************************

        Теперь чуть сложнее. Допустим у нас есть некая база данных Эльфов,
        а нужного метода в классе нет.
        */
        println("----------------------------------------------------------------------")
        new Elf().findByAge(345)
    }
}
