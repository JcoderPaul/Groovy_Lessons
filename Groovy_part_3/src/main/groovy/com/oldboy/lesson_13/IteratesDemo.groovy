package com.oldboy.lesson_13
/*
Универсальные методы применимые к объектам Groovy.
В Groovy любой объект может быть представлен в виде
коллекции из одного элемента. Отсюда масса методов,
которые применяются к объектам, как к коллекциям.
*/
class IteratesDemo {
    static void main(String[] args) {
        /* '*.any {closure}' - вернуть true/false при нахождении первого четного числа */
        def firstAnyEven = [2, 12, 31, 47, 15].any {it -> it % 2 == 0}
        println(firstAnyEven) // true

        /* '*.find {closure}' - вернуть true/false при нахождении первого четного числа */
        def firstFindEven = [2, 12, 31, 47, 15].find {it -> it % 2 == 0}
        println(firstFindEven) // 2

        /* '*.findAll {closure}' - вернуть true/false при нахождении первого четного числа */
        def firstFindAllNotEven = [2, 12, 31, 47, 15].findAll {it -> it % 2 != 0}
        println(firstFindAllNotEven) // [31, 47, 15]

        /* '*.collect()' - преобразует объект в коллекцию */
        def secondRange = (3..12)
        println(secondRange)
        println secondRange.collect() // 3 4 5 6 7 8 9 10 11 12

        /* '*.each()' - цикл */
        def driver = new Driver(15)
        driver.each {println(it)} // com.oldboy.lesson_13.Driver@2362f559

        /* '*.grep()' - своеобразный фильтр */
        /* негласный вызов isCase, находим совпадения */
        def resOfGrep = ["ase", "drf", "grd", "125ber", "qv23ufe"].grep(~/\w+\d+\w+/)
        println(resOfGrep) // [125er, qv23ufe]
        /* негласный вызов isCase, применяем closure */
        def resOfGrepTwo = ["ase", "drf", "grd", "125er", "qv23ufe"].grep { it.length() > 5 }
        println(resOfGrepTwo) // [qv23ufe]
    }
}
