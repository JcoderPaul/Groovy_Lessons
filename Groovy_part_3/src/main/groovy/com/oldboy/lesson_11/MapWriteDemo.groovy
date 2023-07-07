package com.oldboy.lesson_11
/* Работа в Groovy с MAP */

class MapWriteDemo {
    static void main(String[] args) {
        /* СОЗДАНИЕ MAP */
        def myMap = ["a1": 243, "b2": 434, "c3": 332, "d4": 2341] // LinkedHashMap<Str, Int>

        /* ЗАПИСЬ В MAP */
        println("Before change (a1): " + myMap.a1)
        myMap.a1 = 555 // перезаписали 243 на 555
        println("After change (a1): " + myMap.a1)
        println("-----------------------------------------")
        println("Before change (b2): " + myMap."b2")
        myMap."b2" = 666 // перезаписали 434 на 666
        println("After change (b2): " + myMap."b2")
        println("-----------------------------------------")
        println("Before change (c3): " + myMap["c3"])
        myMap["c3"] = 777 // перезаписали 332 на 777
        println("After change (c3): " + myMap["c3"])
        println("-----------------------------------------")
        println("Before change (d4): " + myMap["d4"])
        myMap.put("d4", 999) // перезаписали 2341 на 999
        println("After change (d4): " + myMap["d4"])

        /* ПОЛУЧЕНИЕ ПОДМАССИВА МАР ПО ЗАДАННЫМ КЛЮЧАМ */
        println("-----------------------------------------")
        println(myMap.subMap("b2", "d4"))


    }
}
