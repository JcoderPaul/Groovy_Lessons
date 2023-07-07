package com.oldboy.lesson_18

import java.lang.reflect.Field
import java.lang.reflect.Method

/*
Мета класс содержит набор полей и методов.
Естественно полную реализацию мы не приведем,
но принцип будет понятен.
*/
class MyCustomMetaClass {
    Map<String, Method> methods = new HashMap<>()
    Map<String, Field> fields = new HashMap<>()
}
