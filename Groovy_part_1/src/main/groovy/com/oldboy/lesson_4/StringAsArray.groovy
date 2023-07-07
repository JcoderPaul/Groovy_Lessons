package com.oldboy.lesson_4
/* В Groovy расширили и упростили работу со строками */
String arrName = "Velizariy"

print arrName[0]
print arrName[5]
print arrName[4]
println arrName[5]
/* Берем последний символ, не зная длинны слова или предложения */
println("-----------------------------")
println arrName[-1]
/* Берем подстроки */
println("-----------------------------")
println arrName[2..5]
/* Математика в строках */
println("-----------------------------")
println arrName * 3
println arrName - "ariy"
println arrName - "Vel"
println arrName - "liza"