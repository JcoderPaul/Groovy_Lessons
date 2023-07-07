package com.oldboy.lesson_9
/* В Groovy есть классические циклы for и while */
class LoopsDemoTwo {

    static void main(String[] args) {
        def list = [1, 3, 5, 7, 6, 3, 8]
        /* Метод *.times() и closure */
        list.size().times { it -> print " ${list[it]}"}
        println()
        println("---------------------------------------")
        /*
        Метод *.step(Number self, Number to, Number stepNumber, Closure closure)
        От числа '0' до числа '8' массива с шагом '2'
        */
        0.step(8, 2) {it -> print " ${list[it]}" }
    }
}
