/*
class Box<T>(t : T) {
    var value = t
}

fun main(args: Array<String>) {
    var boxInt = Box<Int>(10)
    var boxString = Box<String>("Runoob")

    println(boxInt.value)
    println(boxString.value)
}

fun main(args: Array<String>) {
    val age = 23
    val name = "runoob"
    val bool = true

    doPrintln(age)    // 整型
    doPrintln(name)   // 字串
    doPrintln(bool)   // 布林型
}

fun <T> doPrintln(content: T) {

    when (content) {
        is Int -> println("整型數字為 $content")
        is String -> println("字串轉換為大寫：${content.toUpperCase ()}")
        else -> println("T 不是整型，也不是字串")
    }
}
*/
// 定義一個支援協變的類
class Runoob<out A>(val a: A) {
    fun foo(): A {
        return a
    }
}

fun main(args: Array<String>) {
    var strCo: Runoob<String> = Runoob("a")
    var anyCo: Runoob<Any> = Runoob<Any>("b")
    anyCo = strCo
    println(anyCo.foo())   // 輸出 a
}