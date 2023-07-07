package com.oldboy.lesson_11

class SpreadWithAddToMap {
    static void main(String[] args) {
        def myMap = ["a1": 243, "b2": 434, "c3": 332, "d4": 2341]
        /* Используя знак '*' мы можем сразу в новый МАР добавить, например, существующий */
        def myNextMap = [w2:223, z4: 4432, *:myMap]
        println(myNextMap) // [w2:223, z4:4432, a1:243, b2:434, c3:332, d4:2341]
    }
}
