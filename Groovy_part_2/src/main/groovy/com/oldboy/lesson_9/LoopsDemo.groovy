package com.oldboy.lesson_9
/* В Groovy есть классические циклы for и while */
class LoopsDemo {
    static void main(String[] args) {
        def list = [1, 3, 5, 7]
        /* Классический вариант:
        -------------------------------------------
        for (int i = 0; i < list.size(); i++){
            some code
        }
        -------------------------------------------
        в groovy превращается в:
        */
        for (i in 0..<list.size()) // синтаксис '0..<list.size()' называется range - диапазон
        {
            print " " + list[i]
        }
        println()
        println("---------------------------------------")
        /* Знак сравнения тоже не обязателен - просто задаем диапазон вывода по индексу массива */
        for (i in 1..list.size()/2) {
            print " " + list[i]
        }
        println()
        println("---------------------------------------")
        /* Цикл for-each тоже есть:
        -------------------------------------------
        for(Integer prn : list){
            print(prn + " ")
        }
        -------------------------------------------
        и так же имеет чуть упрощенный синтаксис
        */
        for(valueForPrn in list) {
            print(" ${valueForPrn}")
        }
        println()
        println("---------------------------------------")
        /*
        И естественно, мы можем использовать closure - замыкание в цикле.
        Поскольку начальный элемент 0 это Integer, то доступны многие методы,
        например *.upto(Number self, Number to, Closure closure). Это от нуля
        до выбранного значения "вверх"
        */
        0.upto(list.size() - 1) { vol -> print(" ${list.get(vol)}") }
        println()
        println("---------------------------------------")
        /* Можно и "вниз"*/
        (list.size() - 1).downto(0) { it -> print " " + list.get(it)}
    }
}
