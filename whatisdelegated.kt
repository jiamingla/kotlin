/*
// 建立介面
interface Base {   
    fun print()
}

// 實現此介面的被委託的類
class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

// 透過關鍵字 by 建立委託類
class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).print() // 輸出 10
}

import kotlin.reflect.KProperty
// 定義包含屬性委託的類
class Example {
    var p: String by Delegate()
}

// 委託的類
class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, 這裡委託了 ${property.name} 屬性"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef 的 ${property.name} 屬性賦值為 $value")
    }
}
fun main(args: Array<String>) {
    val e = Example()
    println(e.p)     // 訪問該屬性，呼叫 getValue () 函式

    e.p = "Runoob"   // 呼叫 setValue () 函式
    println(e.p)
}

val lazyValue: String by lazy {
    println("computed!")     // 第一次呼叫輸出，第二次呼叫不執行
    "Hello"
}

fun main(args: Array<String>) {
    println(lazyValue)   // 第一次執行，執行兩次輸出表達式
    println(lazyValue)   // 第二次執行，只輸出返回值
}

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("初始值") {
        prop, old, new ->
        println("舊值：$old -> 新值：$new")
    }
}

fun main(args: Array<String>) {
    val user = User()
    user.name = "第一次賦值"
    user.name = "第二次賦值"
}

class Site(val map: Map<String, Any?>) {
    val name: String by map
    val url: String  by map
}

fun main(args: Array<String>) {
    // 建構函式接受一個對映引數
    val site = Site(mapOf(
        "name" to "菜鳥教程",
        "url"  to "www.runoob.com"
    ))
    
    // 讀取對映值
    println(site.name)
    println(site.url)
}
*/

class Site(val map: MutableMap<String, Any?>) {
    val name: String by map
    val url: String by map
}

fun main(args: Array<String>) {

    var map:MutableMap<String, Any?> = mutableMapOf(
            "name" to "菜鳥教程",
            "url" to "www.runoob.com"
    )

    val site = Site(map)

    println(site.name)
    println(site.url)

    println("--------------")
    map.put("name", "Google")
    map.put("url", "www.google.com")

    println(site.name)
    println(site.url)

}