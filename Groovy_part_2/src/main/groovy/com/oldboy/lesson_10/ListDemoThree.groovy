package com.oldboy.lesson_10
/* Работа со списками как с массивами, streams или таблицами баз данных*/

class ListDemoThree {
    static void main(String[] args) {
        /* Список-списков (массив массивов) */
        def firstList = [3, 15, [21, 8, 9], 91, 3, [18,32]]
        def secondList = [9, 3, 45, 21, 3, 8]
        def thirdList = [1, 5, 45, 61, 162, 84]

        println("----------- Flatten -----------")
        println "Before: " + firstList
        println "After flatten: " + firstList.flatten()

        println("----------- Revers -----------")
        println "Before: " + secondList // Before: [9, 3, 45, 21, 3, 8]
        println "After revers: " + secondList.reverse() // After revers: [8, 3, 21, 45, 3, 9]

        println("----------- Intersect -----------")
        /* Отображаем место пересечения двух множеств */
        println firstList.flatten().intersect(secondList) // [3, 21, 8, 9, 3]

        println("----------- Disjoint -----------")
        /* Возвращает true если у двух коллекций нет пересечений и false если есть */
        println firstList.flatten().disjoint(secondList) // false
        println firstList.flatten().disjoint(thirdList) // true
    }
}
