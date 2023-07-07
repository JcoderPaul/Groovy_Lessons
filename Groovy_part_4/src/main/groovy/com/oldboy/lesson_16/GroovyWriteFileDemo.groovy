package com.oldboy.lesson_16
/* Примеры записи и чтения файлов в Groovy см. DOC/GroovyIOFile.txt */
import groovy.io.FileType

class GroovyWriteFileDemo {
    static void main(String[] args) {
        /* Если такого файла нет он будет автоматически создан */
        def fileToWrite = new File("src\\main\\resources\\FileToTestWrite.txt")
        /*
        Простая запись единой строкой с переносами, и это видно если открыть файл в NOTEPAD.
        У данного метода есть недостаток, при повторном обращении к нему он затирает строку
        и пишет новую поверх старой, обойти этот недостаток можно следующим образом см. ниже
        */
        fileToWrite.text = """
        Евгений Евтушенко
        
        Женщина особенное море
        
        Женщина всегда чуть-чуть как море,
        Море в чем-то женщина чуть-чуть
        Ходят волны где-нибудь в каморке
        спрятанные в худенькую грудь.
        
        Это волны чувств или предчувствий.
        Будто то надо бездной роковой,
        завитки причёсочки причудной
        чайками кричат над головой.
        
        Женщина от пошлых пятен жирных
        штормом очищается сама,
        и под кожей в беззащитных жилках
        закипают с грохотом шторма.
        
        Там, на дне у памяти, сокрыты
        столькие обломки — хоть кричи,
        а надежды — радужные рыбы —
        снова попадают на крючки.
        
        Женщина, как море, так взывает,
        но мужчины, словно корабли,
        только сверху душу задевают —
        глубиной они пренебрегли.
        
        Женщина, как море, небо молит,
        если штиль, послать хоть что-нибудь.
        Женщина — особенное море,
        то, что в море может утонуть.
        """
        /*
        Чтобы дописать еще строки к существующим в данном файле, нужно использовать оператор '<<'
        Причем, данный оператор можно использовать и при записи и при чтении данных.
        */
        fileToWrite << """
        Евгений Евтушенко
        Годы жизни: 18 июля 1932 — 01 апреля 2017
        Страна рождения: СССР
        Сфера деятельности: Общественный деятель, Режиссер, Сценарист, Писатель, Поэт
        """
        /* Чтение структуры каталогов */
        def srcDir = new File("src")
        /* Рекурсивный обход всех каталогов в каталоге /src */
        srcDir.eachDirRecurse {println(it)}
        println("================================================================================")
        /* Перебор файлов в том же каталоге, что и ранее */
        srcDir.eachFileRecurse(FileType.FILES) {println(it)}
    }
}
