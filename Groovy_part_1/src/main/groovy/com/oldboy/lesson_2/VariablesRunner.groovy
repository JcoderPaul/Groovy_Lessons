package com.oldboy.lesson_2

import java.sql.Date as SqlDate

/*
Типы в Groovy:
- byte, short, int, long, BigInteger
- float, double, BigDecimal
- char
- boolean
однако в Groovy все примитивы сразу автобоксируются.

Многие классы и библиотеки автоматически подгружаются
и не требуют специального import-a.

!!! Доступны псевдонимы или alias !!!
*/


class VariablesRunner {

    static void main(String[] args) {
        /* int five = 5 */
        Integer five = 5
        BigInteger valueBi = 42G
        BigDecimal valueBd = 5.1G
        /*
        Для избежания коллизий в названиях классов из разных библиотек (и самих библиотек)
        используют псевдонимы. Например, java.util и java.sql имеют класс с одинаковым
        названием - Date, импорт см. выше. Мы импортировали java.sql и применили псевдоним
        (alias) - SqlDate.
        */
        new SqlDate(2023, 11, 4)
    }
}
