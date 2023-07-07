package com.oldboy.practice_2

class TaskTwoVarTwo {
    static void main(String[] args) {
        /* В отличии от первого решения изменения внесены в мета класс и доступны всем класса */
        Integer.metaClass.getCm = {
        /* this - относится к объекту TaskTwoVarTwo, по этому нужно вызвать delegate */
            delegate * 10
        }
        Integer.metaClass.getM = {
            delegate.cm * 100
        }
        Integer.metaClass.getMm = {
            delegate
        }

        /*
        Однако наиболее верным будет создание через closure:
        Integer.metaClass {
            getCm = { delegate * 10 }
            getM = { delegate.cm * 100 }
            getMm = { delegate }
        }
        результат тот же, а кода меньше.
        */

        def resultOfCount = 3.cm + 1.m - 25.mm
        assert resultOfCount == 1005
        println(resultOfCount)
    }
}
