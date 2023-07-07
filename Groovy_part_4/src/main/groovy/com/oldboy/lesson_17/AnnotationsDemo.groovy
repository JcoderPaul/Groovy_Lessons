package com.oldboy.lesson_17
/* См. док. https://docs.groovy-lang.org/next/html/gapi/groovy/transform/ */

class AnnotationsDemo {
    static void main(String[] args) {
        def pushkinAs = Writer.builder().
                fName("Aleksandr").
                lName("Pushkin").
                age(225).
                build()

       println(pushkinAs) // com.oldboy.lesson_17.Writer(Aleksandr, Pushkin, 225)
    }
}
