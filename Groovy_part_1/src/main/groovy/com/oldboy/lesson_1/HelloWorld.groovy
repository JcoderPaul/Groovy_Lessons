package com.oldboy.lesson_1

class HelloWorld {
    /*
    Поля в отличие от методов имеют модификатор private.
    !!! Стоит обратить внимание на отсутствие знака ';'
    в конце строки (в IDE он подсвечен серым цветом как
    необязательный)
    */
    Integer value;
    /*
    По умолчанию все методы в Groovy public, но при желании мы можем дать
    методу другой модификатор доступа используя аннотацию @PackageScope.
    */
    static void main(String[] args) {
        println ("Hello World!")
        /*
        !!! В Groovy при использовании методов
        некоторых классов скобки необязательны !!!
        */
        println "Another 'Hello World' without hooks..."
        /* Каждый объект знает о классе к которому он относится */
        String value = "Get name of your class"
        Class<String> clazz = value.getClass();
        println(clazz)
        /* И они вещь в себе - singleton */
        if (clazz == String.class){
            println(true)
        }


    }
}
