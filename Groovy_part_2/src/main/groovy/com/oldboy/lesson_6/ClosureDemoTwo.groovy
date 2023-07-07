package com.oldboy.lesson_6
/*
Closure (Замыкание) – это короткий анонимный блок кода.
Обычно он занимает несколько строк кода. Метод может
даже принять блок кода в качестве параметра. Они
анонимны по своей природе.
*/
import java.util.stream.Stream

class ClosureDemoTwo {

    static void main(String[] args) {
        /* Установим default значение на vol = 25, в случае если аргумент будет null */
        Closure myFirstClosure = { vol = 25 ->
            println "Argument: ${vol}" // Сначала выводим аргумент
            vol * 2
        }
        def closureRes = myFirstClosure(5) // 10
        println(closureRes)
        def closureResTwo = myFirstClosure() // 50
        println(closureResTwo)

        println("---------------------------------------------")
        Stream.of(1, 2, 3, 4).
        map(myFirstClosure). // 2, 4, 6, 8
        map(String::valueOf).
        forEach(System.out::println)
    }
}
