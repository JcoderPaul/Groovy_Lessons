package com.oldboy.practice_2
/* Прописываем необходимые методы для класса Integer */
@Category(Integer.class)
class IntegerUnifierMethods {
    def getCm(){
        this * 10 // 1 см = 10 мм
    }

    def getMm() {
        this // Миллиметры остаются без изменений
    }

    def getM(){
        getCm() * 100 // 1 метр. = 1000 мм
    }
}
