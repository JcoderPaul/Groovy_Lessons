package com.oldboy.lesson_3
/* Возможно явное приведение типов как в Java */
def result = (int) (3 / 2)
println result

/* Вариант приведения типов по Groovy */

def resultVarTwo =  (3 / 2) as Integer
println resultVarTwo

