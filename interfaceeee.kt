/*介面中的屬性
介面中的屬性只能是抽象的，
不允許初始化值，介面不會儲存屬性值，
實現介面時，必須重寫屬性： 


interface MyInterface {
    var name:String //name 屬性，抽象的
    fun bar()
    fun foo() {
        // 可選的方法體
        println("foo")
    }
}
class Child : MyInterface {
    override var name: String = "runoob" //重寫屬性
    override fun bar() {
        // 方法體
        println("bar")
    }
}
fun main(args: Array<String>) {
    val c =  Child()
    c.foo();
    c.bar();
    println(c.name)
 
}
*/

interface A {
    fun foo() { print("A") }   // 已實現
    fun bar()                  // 未實現，沒有方法體，是抽象的
}
 
interface B {
    fun foo() { print("B") }   // 已實現
    fun bar() { print("bar") } // 已實現
}
 
class C : A {
    override fun bar() { print("bar") }   // 重寫
}
 
class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }
 
    override fun bar() {
        super<B>.bar()
    }
}
 
fun main(args: Array<String>) {
    val d =  D()
    d.foo();
    d.bar();
}