package com.oldboy.lesson_5

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegExDemoInGroovy {
    static void main(String[] args) {
        /* ПРИМЕНЕНИЕ РЕГУЛЯРНЫХ ВЫРАЖЕНИЙ В GROOVY */
        def strForPars = "one 1 two 22 three 333"
        /* Ищем группу:
        - \w - Любой символ буква или цифра [a-zA-Z_0-9]
        - \d - Символ цифра [0-9]
        знак + означает любое количество, ограничители ()
        означает разделение на группы. Мы ищем по группам,
        т.е. сначала паттерн целиком - (текст + цифры),
        затем паттерн только текст, затем паттерн только
        цифры.
        */
        def regEx = /(\w+) (\d+)/
        /*
        ------------------------------------------
        Pattern pattern = Pattern.compile(regEx)
        Matcher matcher = pattern.matcher(strForPars)
        ------------------------------------------
        Первое верхнее выражение можно заменить на:
        ------------------------------------------
        Pattern pattern = ~regEx
        ------------------------------------------
        и такой паттерн тоже будет работать. Так же
        можно пойти еще дальше, превратить две строки
        в одну:
        */
        Matcher matcher = strForPars =~regEx
        /*
        Ищем полное совпадение. Наконец верхнее выражение
        можно тоже убрать, а нижнюю строку изменить на:
        ------------------------------------------
        boolean result = strForPars =~regEx
        ------------------------------------------
        */
        boolean result = matcher.matches()
        /*
        И результат, что при классическом варианте применения
        Matcher и Pattern, что при сокращенном будет тем же.
        */
        println(result)
        println("-------------------")
        /* Ищем группы */
        while (matcher.find()){
            println(matcher.group(0))
            println(matcher.group(1))
            println(matcher.group(2))
            println("____________________")
        }
        /*
        *** MATCHER КАК МАССИВ ***
        С Matcher-ом можно работать как с массивом */
        println matcher[0] // [one 1, one, 1]
        println matcher[1] // [two 22, two, 22]
        println matcher[2] // [three 333, three, 333]
        /* И конечно мы можем брать подгруппы т.е. элемент массива */
        println matcher[1][1] //two
        println("-------------------")
        /* Создание слитого массива (или слияние подтекстов) */
        println matcher[1..2]
        /*
        *** ПРИМЕНЕНИЕ ФУНКЦИОНАЛЬНОГО СТИЛЯ ***
        Использование цикла и лямбда выражения для вывода Matcher-a на экран */
        println("-------------------")
        matcher.each(group -> println group)
        /* Замена цикла while */
        println("-------------------")
        matcher.each((group, group1, group2) -> {
            println group
            println group1
            println group2
        })
    }
}
