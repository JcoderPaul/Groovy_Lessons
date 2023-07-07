package com.oldboy.practice_3
/*
*** Task 3 ***
Реализовать механизм тестирования через BDD:
given {
    a = 2
    b = 4
}
when {
    result = a + b
}
then {
    result == 6
}

Теоретически решение может выглядеть как набор методов:
given(Closure{}).when(Closure{}).then(Closure{}) и это
могут быть вложенные друг в друга замыкания, например.
*/
class TaskThree {
    static void main(String[] args) {
        given {
            /*
            При обращении к 'a' и 'b' метод пытается обратиться к owner (this),
            а это TaskThree и тут ничего нет. Поэтому в методе *.given() создадим
            пустой MAP. А затем переопределим delegate, как эту MAP и тогда мы,
            как будто обращаемся к этой MAP и присваиваем его элементу значения:
            */
            a = 2 // map.a = 2, а это в свою очередь delegate propertyMissing -> map.put("a", 2)
            b = 4 // map.b = 4, а это в свою очередь delegate propertyMissing -> map.put("b", 2)
        } when {
            /* Тут логика та же что и выше, делегируем к элементам MAP для каждого closure */
            result = a + b
        } then {
            result == 6
        }
    }

    static def given(Closure giveClosure){
        def valueHolder = [:]
        giveClosure.delegate = valueHolder
        /*
        Определяем стратегию, где искать нужные свойства,
        т.е. обращаемся сразу и только к delegate
        */
        giveClosure.resolveStrategy = Closure.DELEGATE_ONLY
        giveClosure()
            ["when" : { Closure whenClosure -> {
                whenClosure.delegate = valueHolder
                whenClosure.resolveStrategy = Closure.DELEGATE_ONLY
                whenClosure()
                ["then": {Closure thenClosure -> {
                        thenClosure.delegate = valueHolder
                        thenClosure.resolveStrategy = Closure.DELEGATE_ONLY
                        assert thenClosure()
                    }
                }]
            }
        }]
    }
}
