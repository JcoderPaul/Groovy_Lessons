package com.oldboy.lesson_21

class CategoryDemo {
    static void main(String[] args) {
        def gerastrat = new Librarian("Gera", 21)
        /*
        Чтобы вызвать категорийный класс используем оператор use.
        Незримо все методы из класса аннотированного @Category
        добавляются в metaClass для всех объектов находящихся внутри
        closure. Далее после выхода из блока closure эти методы
        удаляются из metaClass
        */
        use(DefaultLibrarianMethod.class){
            gerastrat.getAndPrintInfo()
            gerastrat.anotherMethod("test data")
        }
        /*
        Если вызов происходит вне блока use идут броски исключений,
        но мы их перевели на метод *.methodMissing() см. консоль
        */
        println("------------- MissingMethod exception -------------")
        gerastrat.getAndPrintInfo()
    }
}
