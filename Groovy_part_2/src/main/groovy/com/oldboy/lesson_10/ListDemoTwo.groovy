package com.oldboy.lesson_10
/* Добавление элементов в список и удаление их из списка */

class ListDemoTwo {
    static void main(String[] args) {
        println("----------- Add elements -----------")
        /* ДОБАВЛЕНИЕ ЭЛЕМЕНТОВ */

        def firstList = [3, 15, 15, 8, 9, 91, 3, 9]
        /* Добавим элемент в конец списка методом += */
        firstList += 32
        println firstList
        /* Добавим элемент в список методом << */
        firstList << 27
        /* или */
        firstList << 17 << 3 << 9 << 73 << 15 << 3
        println firstList

        println("----------- Delete elements -----------")
        /* УДАЛЕНИЕ ЭЛЕМЕНТОВ */

        /* Мы хотим удалить все 9 из списка, используем схему -= */
        firstList -= 9
        println(firstList)
        /*
        Удаляем подсписок элементов из списка, в данном примере будут
        удалены все элементы со значениями 3 и 15 независимо от их
        местоположения в списке.
        */
        firstList -= [15, 3]
        println(firstList)

        println("----------- Increase list elements -----------")
        /* УВЕЛИЧЕНИЕ РАЗМЕРА ЛИСТА В N РАЗ */

        println("Size was: " + firstList.size()) // текущий размер
        /* Увеличиваем размер списка дублированием элементов */
        firstList *= 3 // размер в 3-и раза больше
        println("Size become: " + firstList.size())
        /* Структура теперь */
        println(firstList)

        /* СПИСОК КАК ОЧЕРЕДЬ */
        println("----------- List as queue -----------")
        firstList.push(342) // добавляем элемент в голову списка, как в начало очереди
        println(firstList)

        firstList.pop() // удаляем элемент из головы списка как из очереди
        println(firstList)

        println(firstList.head()) // получаем только головной элемент
        println(firstList.tail()) // получаем весь хвост списка, т.е. все элементы без головного
        println(firstList.last()) // получаем весь хвост списка, т.е. все элементы без головного
    }
}
