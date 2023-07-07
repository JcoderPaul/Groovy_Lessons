package com.oldboy.lesson_8
/*
При работе с оператором switch в Groovy можно передать:
byte, short, int, char, String, enum и т.д.
*/
class SwitchDemo {

    static void main(String[] args) {
        int x = 12
        switch (x) {
            case String: // String.class isInstance
                println 0
                break
            case 5:      // equals или ===
                println 1
                break
            case new Person(43): // хотя мы в конструкторе передали 43, будет вызван метод person.isCase(x), а х == 12
                println 5
                break
            case ~/\d+/:  // regEx паттерн, который под капотом: pattern.matcher(12.toString()).matches()
                println 2
                break
            case { it % 5 == 0 }:   // замыкание (closure), если 'х' или оно же 'it' делится без остатка на 5, то ...
                println 3
                break
            case [1, 3, 5, 9]:  // Если х входит в состав коллекции, это true и ... и тут list.isCase(12), как и в случае с Person
                println 4
                break
            default:
                println "NONE"
                break
        }
        println "----------------------------------------"
        /*
        Пример неявного вызова isCase(). Если х == 12
        содержится в массиве, то печатаем это число.
        Используется оператор - in
        */
        if (x in [3, 8, 12, 54]){
            println(x)
        }

    }
}
