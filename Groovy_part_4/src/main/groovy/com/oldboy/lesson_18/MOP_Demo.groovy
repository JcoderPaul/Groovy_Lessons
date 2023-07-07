package com.oldboy.lesson_18
/*
Несложно заметить, что в данном классе нет никаких методов кроме 'main', однако
мы легко запускаем 'println'.

Если зайти в метод 'println', то мы найдем кому он принадлежит - DefaultGroovyMethods
Т.е. все его методы есть и будут во всех созданных нами классах (это незримая работа
Groovy), значит у всех объектов Groovy (они проксируются см. DOC/MOP_Scheme.jpg и
DOC/CompileScheme.jpg, а не вызываются напрямую, как в JAVA)

А вот как выглядит часть кода в MOP_Demo.class см. в
build/classes/groovy/main/com/oldboy/lesson_18/MOP_Demo.class :
************************************************************
  public static void main(String... args) {
        CallSite[] var1 = $getCallSiteArray();
        var1[0].callStatic(MOP_Demo.class, "Hello");
    }
************************************************************

Проблема любого динамического языка в том, что многие ошибки можно отловить только в RunTime
*/
class MOP_Demo {
    static void main(String[] args) {
        println("Hello")
    }
}
