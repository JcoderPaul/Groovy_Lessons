package com.oldboy.lesson_4
/* Пример вызова функции в строке */

def str_name = "Lito"
def str_1 = """Hello your excellency ${getWithPrefixName(str_name)}"""

def getWithPrefixName(String str_name){
    "duke - " + str_name
}

println str_1
