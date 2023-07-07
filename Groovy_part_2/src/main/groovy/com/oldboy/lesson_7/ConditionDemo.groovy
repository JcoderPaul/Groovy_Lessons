package com.oldboy.lesson_7
/*
В условный оператор можно сразу передавать без
специальной проверки следующие типы, если они:

boolean - is true
Collection/Map - is not empty (true)
Matcher - has match (true)
String/GString - is not empty (true)
Number/Char - != 0 (true)
reference - != 0 (true)

*/
class ConditionDemo {
    static void main(String[] args) {
        int x = 0
        if(x){
            println("X equals = ${x}")
        }
        if(++x){
            println("X equals = " + x)
        }
        /*
        Класс Teacher не имеет метода asBoolean() и поскольку
        он reference и не null то его id будет на экране.
        */
        def myTeacher = new Teacher(7);
        if(myTeacher) {
            println(myTeacher.getId())
        }
        /*
        Класс Student имеет метода asBoolean() и поскольку
        он reference и не null то его id должен быть на
        экране, однако, метод asBoolean() вернет false т.к.
        id переданный через конструктор не больше 10 и мы
        ничего не увидим - метод asBoolean() вызывается не
        явно.

        !!! Данный метод определяет boolean состояние объекта
        и если явно задан, то в работу идет именно его результат !!!
        */
        def myStudent = new Student(6);
        if(myStudent) {
            println(myStudent.getId())
        }

        /*
        Если ранее мы всегда проверяли на null состояние объекта,
        чтобы не словить исключение:
        --------------------------------------------------------
        if (myTeacher != null){
            myTeacher.getId()
        }
        --------------------------------------------------------
        то разработчики Groovy подсыпали сахарку и теперь можно так:
        */
        myTeacher?.getId()
        /* При этом такую сейф цепочку можно продолжать */
        myTeacher?.getId()?.println("Teacher ID is -> ${myTeacher.id}")
        /* Классический тернарный оператор */
        def res = x != null ? x : 1
        println(res)
        /*
        Еще более короткая его версия:
        Если х != 0 или это эквивалентно - true, то в переменную 'result'
        уходит значение 'x', если же x = 0, то это - false и в переменную
        'result' уйдет 1
        */
        def result = x ?:1
        println(result)
    }
}
