package com.oldboy.lesson_14
/* Хотя явно мы не создавали конструкторы в классе Student их мы можем использовать */
class GroovyObjConstructor {
    static void main(String[] args) {
        def vladHarkonen = new Student(firstName: "Vladimir", lastName: "Harkonen", age: 167)
        println(vladHarkonen)

        /*
        Вариант создания объекта через присваивание элементов массива,
        т.е. нечто обратное, если объект можно представить, как массив,
        то его элементы (поля) можно заполнить 'одним ударом'
        */
        Student princessIrulan = ['Irulan', 'Corrino', 18]
        println(princessIrulan)
        println("--------------------------------------------------------------")
        def (lastN, firstN) = princessIrulan
        println(lastN)
        println(firstN)
        println("--------------------------------------------------------------")
        /* Оператор *.collect() и знак '*' */
        def nameCollect = [vladHarkonen, princessIrulan].collect {it.firstName}
        println(nameCollect)
        println("--------------------------------------------------------------")
        /* Второй вариант синтаксиса */
        def lastNameCollect = [vladHarkonen, princessIrulan]*.lastName
        println(lastNameCollect)
    }
}
