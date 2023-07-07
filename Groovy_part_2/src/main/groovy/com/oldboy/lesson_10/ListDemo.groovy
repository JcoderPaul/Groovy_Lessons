package com.oldboy.lesson_10
/* Обращение к элементам списка */
class ListDemo {
    static void main(String[] args) {
        def firstList = [3, 5, 23, 8, 9]
        println firstList.getClass() == ArrayList
        /* Обращение к элементам списка */
        println firstList[2] // 23
        println firstList.get(2) // 23
        /* Обращение к последнему элементу списка */
        println firstList[-1] // firstList.get(firstList.size() - 1), вернет пятый элемент списка 9
        /* Получение подсписка */
        println(firstList[1..3]) // [5, 23, 8]
        /* Возможность работать с несуществующими элементами списка, при их вызове */
        println(firstList[21]) // тут неявно применяется firstList?[21] и мы получаем null

    }
}
