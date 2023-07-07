package com.oldboy.lesson_21

import groovy.transform.Canonical

@Canonical
class Librarian {
    String firstName
    Integer age

    def methodMissing(String name, Object arguments){
        println "MissingMethod $name is invoked with arg: $arguments"
    }

    def propertyMissing(String propertyName) {
        "Property missing '$propertyName' is not available"
    }
}
