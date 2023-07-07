package com.oldboy.lesson_21

@Category(Librarian.class)
class DefaultLibrarianMethod {
    def getAndPrintInfo(){
        println "$firstName, $age"
    }
    static def anotherMethod(Librarian self, String value){
        println("$self, args: $value")
    }
}
