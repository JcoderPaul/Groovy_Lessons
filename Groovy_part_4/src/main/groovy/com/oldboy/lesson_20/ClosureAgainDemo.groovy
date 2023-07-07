package com.oldboy.lesson_20

class ClosureAgainDemo {
    static void main(String[] args) {
        /* Создадим объект */
        Programmer bGat = new Programmer()
        bGat.fName = "William"
        bGat.secretName = "BilliBoy"
        bGat.age = 67
        bGat.experience = 234

        /* Предположим это замыкание принадлежит bGat */
        Closure secClosure = {
            secretName = "CunningBill"
            age = 341
        }
        /*
        У любого closure есть три основных поля:
        - у какого объекта вызвали (у нас это ClosureAgainDemo)
        - то объект где closure определен (это все еще ClosureAgainDemo)
        - default this - И ОН нужен для того, чтобы мы его переопределили при необходимости
        см. ниже
        */
        println(secClosure.thisObject) // class com.oldboy.lesson_20.ClosureAgainDemo
        println(secClosure.owner) // class com.oldboy.lesson_20.ClosureAgainDemo
        println(secClosure.delegate) // class com.oldboy.lesson_20.ClosureAgainDemo
        println("----------------------------------------------------------------------------")
        println(bGat) // com.oldboy.lesson_20.Programmer(William, BilliBoy, 67, 234)
        println("----------------------------------------------------------------------------")
        /* Переназначаем поле delegate нашего secClosure и снова выводим в консоль bGat */
        secClosure.delegate = bGat
        secClosure()
        println(bGat) // com.oldboy.lesson_20.Programmer(William, CunningBill, 341, 234)
        /*
        Так же строки:
        ***************************************************************************************
        secClosure.delegate = bGat
        secClosure()
        ***************************************************************************************

        можно заменить на:

        ***************************************************************************************
        bGat.with secClosure
        ***************************************************************************************

        !!! Тут используется паттерн делегирования !!!
        Т.е. все запросы пришедшие в наш closure мы через delegate
        Делегируем нашему классу (объекту класса Programmer)

        Теперь посмотрим на динамику ссылок внутри closure и как работает перенаправление на
        delegate:
        */
        println("----------------------------------------------------------------------------")
        def castor = new Programmer("Carlos","SpicesCary", 28, 18.3)
        println castor
        println("----------------------------------------------------------------------------")
        castor.getClosureInfo().call()
    }
}
