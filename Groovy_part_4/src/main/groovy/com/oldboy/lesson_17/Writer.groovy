package com.oldboy.lesson_17
/* См. док. https://docs.groovy-lang.org/next/html/gapi/groovy/transform/ */

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder

@ToString // Переопределяем метод toString
@TupleConstructor // Конструкторы 'условно' на все случаи жизни
@EqualsAndHashCode // Переопределение методов Equals и HashCode
/*
@Canonical - Включает в себя комбинацию аннотаций
@ToString, @TupleConstructor и @EqualsAndHashCode .

@Immutable - Поля делает final
*/
@Builder // Классическое применение билдера см. AnnotationsDemo.groovy
class Writer {
    String fName
    String lName
    Integer age
}