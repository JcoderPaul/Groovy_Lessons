/*
Пути к классам при текущем запуске:
"C:\Program Files\Java\jdk-17.0.2\bin\java.exe"
-Dgroovy.home=C:\Users\PaulWriter\.gradle\caches\modules-2\files-2.1\org.apache.groovy\groovy\4.0.2\56d3019114aea2658cb6bdbb1d9768feab9bccdd "
-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2\lib\idea_rt.jar=50047:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2\bin"
-Dfile.encoding=UTF-8 -classpath C:\Users\PaulWriter\.gradle\caches\modules-2\files-2.1\org.apache.groovy\groovy\4.0.2\56d3019114aea2658cb6bdbb1d9768feab9bccdd\groovy-4.0.2.jar

org.codehaus.groovy.tools.GroovyStarter
--main groovy.ui.GroovyMain
--classpath .;

H:\Groovy_Lessons\Groovy_Less_1\build\classes\groovy\main;
C:\Users\PaulWriter\.gradle\caches\modules-2\files-2.1\org.apache.groovy\groovy\4.0.2\56d3019114aea2658cb6bdbb1d9768feab9bccdd\groovy-4.0.2.jar
--encoding=UTF-8 H:\Groovy_Lessons\Groovy_Less_1\src\main\groovy\com\oldboy\FirstGroovyScript.groovy
*/
package com.oldboy.lesson_1

println "Hello world from FirstGroovyScript!"

println FirstGroovyScript.getClassLoader()
println FirstGroovyScript.getClassLoader().getParent()
println FirstGroovyScript.getClassLoader().getParent().getParent()