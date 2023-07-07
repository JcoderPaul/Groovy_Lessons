package com.oldboy.practice_1
/*
*** TASK 1 ***
Добавить метод инициализации "make" для создания объектов любых классов.
Метод должен проксировать вызовы на соответствующий конструктор.

Например, у нас есть желание создать HashSet и передать в него в качестве
параметров массив [1, 3, 4, 5, 5] если делать это стандартным образом, то
это выглядит так:

***************************************************************************
def arrHash = new HashSet<>([1, 3, 4, 5, 5])
***************************************************************************

а нам бы хотелось так:

***************************************************************************
def arrHash = HashSet.make([1, 3, 4, 5, 5])
***************************************************************************

тоже самое для любого другого класса, например, наш Student через *.Make():

***************************************************************************
def studPaul = Student.make("Paul","Muaddib", 19)
***************************************************************************
*/
class TaskOne {
    static void main(String[] args) {
        /*
        Поскольку в Groovy все методы находятся в массиве методов класса Class, то
        нам необходимо добавить в него еще один с требуемым именем и функционалом.
        Для этого применим знания из урока lesson_20 - про работу со свойствами
        thisObject, owner, delegate.
        */
        Class.metaClass.make = { Object[] val ->
            /* Демонстрация последовательности вызова объектов */
            println owner
            println thisObject
            println delegate
            /*
            Вызывает конструктор для заданных аргументов. Метакласс
            попытается выбрать лучший аргумент, который соответствует
            типам объектов, переданных в массиве аргументов.

            Параметры: arguments – аргументы конструктора
            Возвращает: Экземпляр класса java.lang.Class, к которому
                        применяется этот объект MetaObjectProtocol.

            Т.е. если вызвать метод *.make() у String, то он примениться
            к экземпляру класса String, если применить к HashMap, то
            примениться к классу HashMap и т.д.
            */
            delegate.metaClass.invokeConstructor(val)
        }
        /*
        Теперь наш метод внедрится во все классы и самое главное исходя из
        архитектуры классов в Groovy, будет вызываться, так как и было задано.
        */
        println "-----------------------------------------------------------------"
        def hashSetWithMake = HashSet.make([2, 3, 5, 6, 6])
        println(hashSetWithMake)
        println "-----------------------------------------------------------------"
        def studOne = Student.make("Arya","Stark", 18)
        println(studOne)
        println "-----------------------------------------------------------------"
        def studTwo = Student.make()
        println(studTwo)
        println "-----------------------------------------------------------------"
        println String.make("Print this")

    }
}
