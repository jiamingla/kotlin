/*
class Person {

    var lastName: String = "zhang"
        get() = field.toUpperCase()   // 將變數賦值後轉換為大寫
        set

    var no: Int = 100
        get() = field                // 後端變數
        set(value) {
            if (value < 10) {       // 如果傳入的值小於 10 返回該值
                field = value
            } else {
                field = -1         // 如果傳入的值大於等於 10 返回 -1
            }
        }

    var height: Float = 145.4f
        private set
}

// 測試
fun main(args: Array<String>) {
    var person: Person = Person()

    person.lastName = "wang"

    println("lastName:${person.lastName}")

    person.no = 9
    println("no:${person.no}")

    person.no = 20
    println("no:${person.no}")
    println("height:${person.height}")
}

class Runoob  constructor(name: String) {  // 類名為 Runoob
    // 大括號內是類體構成
    var url: String = "http://www.runoob.com"
    var country: String = "CN"
    var siteName = name

    init {
        println("初始化網站名: ${name}")
    }

    fun printTest() {
        println("我是類的函式")
    }
}

fun main(args: Array<String>) {
    val runoob =  Runoob("菜鳥教程")
    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)
    runoob.printTest()
}

class Runoob  constructor(name: String) {  // 類名為 Runoob
    // 大括號內是類體構成
    var url: String = "http://www.runoob.com"
    var country: String = "CN"
    var siteName = name

    init {
        println("初始化網站名: ${name}")
    }
    // 次建構函式
    constructor (name: String, alexa: Int) : this(name) {
        println("Alexa 排名 $alexa")
    }

    fun printTest() {
        println("我是類的函式")
    }
}

fun main(args: Array<String>) {
    val runoob =  Runoob("菜鳥教程", 10000)
    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)
    runoob.printTest()
}
 */
class Test {
    var v = "成員屬性"

    fun setInterFace(test: TestInterFace) {
        test.test()
    }
}

/**
 * 定義介面
 */
interface TestInterFace {
    fun test()
}

fun main(args: Array<String>) {
    var test = Test()

    /**
     * 採用物件表示式來建立介面物件，即匿名內部類的例項。
     */
    test.setInterFace(object : TestInterFace {
        override fun test() {
            println("物件表示式建立匿名內部類的例項")
        }
    })
}