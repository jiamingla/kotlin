/*
class User(var name:String)

 擴充套件函式 
fun User.Print(){
    print("使用者名稱 $name")
}

fun main(arg:Array<String>){
    var user = User("Runoob")
    user.Print()
}
 
// 擴充套件函式 swap, 調換不同位置的值
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]     //  this 對應該列表
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(args: Array<String>) {

    val l = mutableListOf(1, 2, 3)
    // 位置 0 和 2 的值做了互換
    l.swap(0, 2) // 'swap ()' 函式內的 'this' 將指向 'l' 的值

    println(l.toString())
}

open class C

class D: C()

fun C.foo() = "c"   // 擴充套件函式 foo

fun D.foo() = "d"   // 擴充套件函式 foo

fun printFoo(c: C) {
    println(c.foo())  // 型別是 C 類
}

fun main(arg:Array<String>){
    printFoo(D())
}

class C {
    fun foo() { println("成員函式") }
}

fun C.foo() { println("擴充套件函式") }

fun main(arg:Array<String>){
    var c = C()
    c.foo()
}

fun Any?.toString(): String {
    if (this == null) return "null"
    // 空檢測之後，“this” 會自動轉換為非空型別，所以下面的 toString ()
    // 解析為 Any 類的成員函式
    return toString()
}
fun main(arg:Array<String>){
    var t = "??"
    println(t.toString())
}

class MyClass {
    companion object { }  // 將被稱為 "Companion"
}

fun MyClass.Companion.foo() {
    println("伴隨物件的擴充套件函式")
}

val MyClass.Companion.no: Int
    get() = 10

fun main(args: Array<String>) {
    println("no:${MyClass.no}")
    MyClass.foo()
}

class D {
    fun bar() { println("D bar") }
}

class C {
    fun baz() { println("C baz") }

    fun D.foo() {
        bar()   // 呼叫 D.bar
        baz()   // 呼叫 C.baz
    }

    fun caller(d: D) {
        d.foo()   // 呼叫擴充套件函式
    }
}

fun main(args: Array<String>) {
    val c: C = C()
    val d: D = D()
    c.caller(d)

}

class D {
    fun bar() { println("D bar") }
}

class C {
    fun bar() { println("C bar") }  // 與 D 類 的 bar 同名

    fun D.foo() {
        bar()         // 呼叫 D.bar ()，擴充套件接收者優先
        this@C.bar()  // 呼叫 C.bar ()
    }

    fun caller(d: D) {
        d.foo()   // 呼叫擴充套件函式
    }
}

fun main(args: Array<String>) {
    val c: C = C()
    val d: D = D()
    c.caller(d)

}
*/
open class D {
}

class D1 : D() {
}

open class C {
    open fun D.foo() {
        println("D.foo in C")
    }

    open fun D1.foo() {
        println("D1.foo in C")
    }

    fun caller(d: D) {
        d.foo()   // 呼叫擴充套件函式
    }
}

class C1 : C() {
    override fun D.foo() {
        println("D.foo in C1")
    }

    override fun D1.foo() {
        println("D1.foo in C1")
    }
}


fun main(args: Array<String>) {
    C().caller(D())   // 輸出 "D.foo in C"
    C1().caller(D())  // 輸出 "D.foo in C1" —— 分發接收者虛擬解析
    C().caller(D1())  // 輸出 "D.foo in C" —— 擴充套件接收者靜態解析

}