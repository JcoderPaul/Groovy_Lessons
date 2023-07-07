package com.oldboy.lesson_15

class Fighter {
    /* Хотя mixin в groovy уже deprecate, но их можно использовать */
    static def printSrtFromMixin(Teacher self){
        println("Print from mixin -> $self")
    }
}
