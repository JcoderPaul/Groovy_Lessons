package com.oldboy.lesson_18

import org.codehaus.groovy.runtime.DefaultGroovyMethods

class MyMetaClassRunner {
    static void main(String[] args) {
        def firstCustomMetaClass = new MyCustomMetaClass()
        /*
        В нашем кастомном метоклассе нет метода println, добавим его!
        Чтобы нам его не писать извлечем его из DefaultGroovyMethods
        */
        def loadMethodPrn =
                DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)
        /* Положим извлеченный метод в наш метакласс */
        firstCustomMetaClass.methods.put("myPrintLn", loadMethodPrn)
        /* Используем наш метакласс - извлечем наш метод myPrintLn */
        def myPrintlnMethod = firstCustomMetaClass.methods.get("myPrintLn")
        def mmcr = new MyMetaClassRunner()
        /* Вызываем наш метод из текущего класса */
        myPrintlnMethod.invoke(mmcr, mmcr, "HELLO WOLD FROM MY META CLASS!!!")
        /* А можем из любого другого, например из ... */
        String someString = new String()
        myPrintlnMethod.invoke(someString,
                         someString,
                                "IN THE String.class WE HAVE NO myPrintlnMethod METHOD!!!")
        /*
        1. MetaClassIml - основная реализация класса default см. вывод на консоль
        */
        println(mmcr.metaClass)
        println(someString.metaClass)
        println("---------------------------------------------------------------------------")
        /*
        2. ExpandoMetaClass - метакласс позволяющий добавлять поля и методы налету - динамически.
        Если смотреть в консоли, на свойства метакласса, то можно заметить смену 'риторики'
        */
        mmcr.metaClass.exp_prop = "Test property"
        mmcr.metaClass.exp_meth = {
            println "ExpandoMetaClass add method"
        }
        println("---------------------------------------------------------------------------")
        mmcr.exp_meth()
        println("---------------------------------------------------------------------------")
        println(mmcr.metaClass) // ... groovy.lang.ExpandoMetaClass@2e222612 ...
        println("---------------------------------------------------------------------------")
        /*
        Мы можем передавать параметры в методах !!! при этом ПОМНИМ О ДИНАМИКЕ у объектов
        созданных до внедрения нового метода нет возможности вызвать этот метод БЕЗ ВЫБРОСА
        ОШИБКИ !!! Т.е. для новых объектов все будет ОК. НО МЕТОД ВНЕДРЯЕТСЯ В КЛАСС.
        */
        mmcr.class.metaClass.exp_meth_with_param = { int val ->
            println "ExpandoMetaClass add method: $val"
        }
        new MyMetaClassRunner().exp_meth_with_param(777)
        /*
        3. ProxyMetaClass - используется редко.
        */
    }
}
