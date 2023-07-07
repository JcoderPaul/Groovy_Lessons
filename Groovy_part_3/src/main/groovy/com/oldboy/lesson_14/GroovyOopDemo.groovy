package com.oldboy.lesson_14
/* Работа с полями объектов очень похожа применение Lombok */
class GroovyOopDemo {
    static void main(String[] args) {
        def myStudPaul = new Student()
        myStudPaul.firstName = "Paul" // скрытый *.setFirstName()
        myStudPaul.lastName = "Atrides" // скрытый *.setLastName()
        myStudPaul.age = 18 // скрытый *.setAge()

        myStudPaul.each {println(it.getFirstName() + " " + it.getLastName() + " - " + it.getAge())}
        /* Как и при работе со списками или массивами, вариантов обращения к полям несколько */
        println "---------------------------------------------------------------------------"
        println(myStudPaul.firstName)
        println(myStudPaul['firstName'])
        println(myStudPaul["firstName"])
        println(myStudPaul."firstName")
        println "---------------------------------------------------------------------------"
        /* Обращение к полю непосредственно, в обход getter-ов */
        println myStudPaul.@lastName // !!! NOT RECOMMENDED !!!
    }
}
