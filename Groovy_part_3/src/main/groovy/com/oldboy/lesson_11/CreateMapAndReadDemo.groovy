package com.oldboy.lesson_11
/* Работа в Groovy с MAP */
class CreateMapAndReadDemo {
    static void main(String[] args) {
        /* Так создаются списки и массивы */
        def myList = [23, 34, 45, 56] // ArrayList<Integer>
        /* Пустой список можно создать так: */
        def myEmptyList = []
        println(myList)
        def Integer[] myArray = [12, 32, 43, 54] // Массив
        println(myArray)

        /* СОЗДАНИЕ MAP */
        def myMap = ["one": 11, "two": 22, "three": 33] // LinkedHashMap<Str, Int>
        def myMapTwo= [one: 111, two: 222, three: 333]
        println(myMap.getClass()) // class java.util.LinkedHashMap
        /* Пустой ассоциативный массив можно создать используя синтаксис: */
        def myEmptyMap = [:]

        /* ЧТЕНИЕ ИЗ MAP */
        println(myMap.get("one")) // обращение к ключу
        println(myMap["one"]) // обращение к ключу, как к индексу массива
        println(myMap.two) // обращение к ключу, как к public полю
        println myMap."two" // обращение к ключу, как к свойству
        /* ЧТЕНИЕ НЕСУЩЕСТВУЮЩЕГО ЭЛЕМЕНТА ИСПОЛЬЗОВАНИЕ DEFAULT ЗНАЧЕНИЙ */
        println(myMapTwo.get("twenty three", 232323)) // Такого ключа у нас нет, метод вернет default = 232323

    }
}
