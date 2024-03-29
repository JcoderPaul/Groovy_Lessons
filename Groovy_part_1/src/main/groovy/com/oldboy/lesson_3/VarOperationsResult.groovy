package com.oldboy.lesson_3
/*
Если применяем assert то в случае ошибки
мы получим подробное описание оной, если
же таковой нет, то никаких сообщений не
будет */
assert 1 + 2 == 3 // 3
assert 1 - 2 == 1 // -1
/* Поймали ошибку и скрипт дальше не пойдет см. результат запуска */
assert 1 * 2 == 2 // 2
assert 10 % 3 == 1 // 1 (остаток от деления)
/* Особенности Groovy */
println("------------- Differences from JAVA -------------")
assert 3 / 2 == 1.5 // 1.5
assert 3 ** 4 == 90 // 81
assert 3.intdiv(2) == 1 // 1

