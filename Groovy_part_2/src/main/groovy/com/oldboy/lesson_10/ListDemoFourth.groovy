package com.oldboy.lesson_10
/* Добавление элементов в список и удаление их из списка */

class ListDemoFourth {
    static void main(String[] args) {
        /* Список-списков (массив массивов) */
        def firstList = [3, 15, [21, 8, 9], 91, 3, [18,32]]
        def secondList = [9, 3, 45, 21, 3, 8]
        def thirdList = [1, 5]

        /* МНОЖЕСТВЕННОЕ ПРИСВОЕНИЕ */
        println("----------- Multiple assignment ver.1-----------")
        /* Несложно заметить что переменных 3-и, а список из 4-х элементов и это работает */
        def (a, b, c) = [3, 4, 9, 5] // присвоим список [n, m, ...]
        println(a) // 3
        println(b) // 4
        println(c) // 9
        println("----------- Multiple assignment ver.2-----------")
        def (a2, b2, c2) = secondList // присвоим secondList список
        println(a2) // 9
        println(b2) // 3
        println(c2) // 45

        /* ОПЕРАТОР РАЗДЕЛЕНИЯ - СПРЕД ОПЕРАТОР */
        println("----------- Simple work -----------")
        /* В данном примере мы можем в нашу функцию поместить, как и положено две переменных */
        fun(23, 32) // и получить на экране 23 и 32
        println("----------- Spread operator ver.1 -----------")
        /* А можем загрузить массив или список из двух элементов */
        fun(*[4, 7]) // !!! но чтобы все заработало применяем значок '*' - или спред оператор
        println("----------- Spread operator ver.2 -----------")
        fun(*thirdList) // !!! но чтобы все заработало применяем значок '*' - или спред оператор
    }

    static def fun(def a, def b){
        println(a)
        println(b)
    }
}
