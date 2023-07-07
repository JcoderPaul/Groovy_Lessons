package com.oldboy.practice_2
/*
*** Task 2 ***
Добавить возможность складывать различные единицы измерения.
Например: 3.cm + 1.m -25.mm = 1005 (mm)

Решим данную задачу через аннотацию '@Category' и статический
метод класса DefaultGroovyMethods - 'use' см. урок lesson_21.
*/
class TaskTwo {
    static void main(String[] args) {
        /* В данном случае все изменения доступны, только внутри блока use {....} */
        use(IntegerUnifierMethods) {
            def result = 3.cm + 1.m - 25.mm
            assert result == 1005 // Проверяем на эквивалентность
            println(result) // Выводим на экран
        }
    }
}
