package com.oldboy.lesson_6

class ClosureAsArgument {

    static void main(String[] args) {
        def x = 10
        /*
        Если некое булево выражение true, то должно выполниться Closure
        в нашем случае в блок closure передана функция печати переменной.
        !!! Мы имеем возможность изменять переменную внутри 'замыкания' -
        closure !!!
        */
        checkCondition(x > 9, { println (++x) }) // На экране - 11 в случае true
        /*
        Если closure идет последним параметром в нашем методе (как в данном примере),
        то синтаксис вызова можно изменить на:
        -----------------------------------------------------------------------------
        checkCondition(x > 9) { println (++x) }
        -----------------------------------------------------------------------------
        */
        checkCondition(x > 0) { println (--x) }
    }
    /*
    Создаем метод в котором Closure передается как аргумент,
    условие верное - работает closure, нет выходит сообщение
    о состоянии условия.
    */
    static def checkCondition(boolean condition, Closure closure){
        if (condition){
            closure()
        } else {
            println(condition)
        }
    }
}