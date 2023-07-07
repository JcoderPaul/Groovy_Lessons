package com.oldboy.lesson_15

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Teacher implements WithId {
    String fName
    String lName
    Integer age

    def getAt(Integer index){
        index == 0 ? fName : lName
    }
}
