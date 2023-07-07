package com.oldboy.lesson_12

class RangeDemo {
    static void main(String[] args) {
        /* Создание диапазона */
        def myFirsRange = 2..9 // 2  3  4  5  6  7  8  9
        println(myFirsRange.getClass()) // class groovy.lang.IntRange
        println(myFirsRange) // 2..9
        println(myFirsRange.get(1)) // берем элемент с индексом 1 и это 3
        println(myFirsRange.contains(8)) // проверяем, есть ли в range элемент 8 и это true
        /* Знаки сравнения, как границы range - диапазона */
        def mySecRange = 2..<16 // значения int от 2 до 15 (16 не входит), шаг 1
        /* Цикл */
        mySecRange.forEach(it -> print(it + " "))
        /* или другой вариант */
        myFirsRange.each {print(it + " ")}
        println()
        println(mySecRange.contains(16)) // естественно false

    }
}
