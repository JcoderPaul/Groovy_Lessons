package com.oldboy.lesson_6
/*
Closure (Замыкание) – это короткий анонимный блок кода.
Обычно он занимает несколько строк кода. Метод может
даже принять блок кода в качестве параметра. Они
анонимны по своей природе.
*/
import java.util.function.Function
import java.util.stream.Stream

class ClosureDemo {
    static void main(String[] args) {
        Function<Integer, Integer> myFun = val -> val * 2
        def resultOfFun = myFun.apply(5) // 10
        println(resultOfFun)
        println("---------------------------------------------")
        /*
        Теперь нашу строку Function<Integer, Integer> myFun = val -> val * 2
        мы можем представить в виде Closure см. ниже и применить метод *.call()
        передав в него параметры.
        */
        Closure myFirstClosure = val -> val * 2
        /*
        В groovy синтаксис сlosure-замыкания выглядит так:
        Closure myFirstClosure = { val -> val * 2 }
        */
        def closureRes = myFirstClosure.call(5) // 10
        /*
        При этом верхнюю строку можно переписать (опуская явный
        вызов метода *.call()) как:
        -------------------------------------------------
        def closureRes = myFirstClosure(5)
        -------------------------------------------------
        */
        println(closureRes)
        println("---------------------------------------------")
        Stream.of(1, 2, 3, 4).
        map(myFirstClosure). // 2, 4, 6, 8
        map(String::valueOf).
        forEach(System.out::println)

    }
}
