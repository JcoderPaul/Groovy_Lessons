package com.oldboy.lesson_12

class TextAnCharRangeDemo {
    static void main(String[] args) {
        /* Варианты строковых диапазонов - range */
        def charRange = 'd'..'n'
        /* Так же итерируются */
        charRange.each {print(it + " ") }
        println()
        /* Итерировать в Groovy можно практически любой объект, например ENUM */
        def workingDay = WeekDay.MO..WeekDay.FR
        println("------- Forward -------")
        workingDay.each {println(it)}
        /* Так же многие методы применимые к массивам и спискам тут тоже работают, например REVERS */
        println("------- Revers -------")
        (workingDay.reverse()).each {println(it)}
        /* Причем мы не обязаны использовать метод *.revers(), достаточно перевернуть диапазон range */
        def reversWorkDayOfWeek = WeekDay.FR..WeekDay.MO
        println("------- 'Manual Range' revers -------")
        reversWorkDayOfWeek.forEach(it -> print(it.toString() + " "))

    }
}
