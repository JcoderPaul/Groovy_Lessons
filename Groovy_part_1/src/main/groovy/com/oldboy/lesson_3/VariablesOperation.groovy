package com.oldboy.lesson_3
/*
В отличие от java в Groovy добавили:
- intdiv() - целочисленное деление;
- ** - возведение в степень (нет обращения к math);
*/
class VariablesOperation {
    static void main(String[] args) {
        println 1 + 2 // 3
        println 1 - 2 // -1
        println 1 * 2 // 2
        println 10 % 3 // 1 (остаток от деления)
        /* Особенности Groovy */
        println("------------- Differences from JAVA -------------")
        println 3 / 2 // 1.5
        println 3 ** 4 // 81
        println 3.intdiv(2) // 1
    }
}
