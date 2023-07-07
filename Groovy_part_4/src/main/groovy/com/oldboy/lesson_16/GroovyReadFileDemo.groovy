package com.oldboy.lesson_16
/* Примеры записи и чтения файлов в Groovy см. DOC/GroovyIOFile.txt */
class GroovyReadFileDemo {
    static void main(String[] args) {
        /* Обращаемся к существующему файлу */
        def myFirsFile = new File("DOC/GroovyIOFile.txt")
        /* Читаем его и сразу выводим в консоль - единой строкой с переносами */
        println(myFirsFile.text)
        println("================================================================================")
        def mySecFile = new File("src\\main\\resources\\FileForReadTest.txt")
        println(mySecFile.size())
        println("================================================================================")
        /* Чтение файла построчно, в случае отсутствия файла, ловим ошибку */
        mySecFile.each(it -> println it)
        println("================================================================================")
        /* Так же мы можем использовать InputStream */
        mySecFile.withInputStream {
            def allText = new String(it.readAllBytes())
            println(allText)
        }
    }
}
