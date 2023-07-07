package com.oldboy.lesson_4

/* Формирование строк в Groovy возможно несколькими способами */

def str_1 = "Paul"
/*
При таком варианте формирования формирования строк
нет возможности их интерполяции как в см. ниже
def str_7 = "Hello $str_1"
*/
def str_2 = 'Vladimir'
def str_3 = """Raban"""
/*
При таком варианте формирования строк нет возможности
их интерполяции, как и при варианте с ' '
*/
def str_4 = '''FeidRauta'''
/* Последние два способа формирования строк удобны в регулярных выражениях */
def str_5 = /Alia/
def str_6 = $/Chani/$

println str_1
println str_2
println str_3
println str_4
println str_5
println str_6

println("------ After concat difference from JAVA ------")

def str_7 = "Hello $str_1"
println str_7

/* Перенос строк - использование """ """ */

def str_8 = """
SELECT *
FROM
table_nabe
WHERE
field_name = $str_2
"""
println str_8
