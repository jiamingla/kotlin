/*Kotlin 中沒有基礎資料型別，只有封裝的數字型別，
你每定義的一個變數，其實 Kotlin 幫你封裝了一個物件，
這樣可以保證不會出現空指標。
數字型別也一樣，所以在比較兩個數字的時候，
就有比較資料大小和比較兩個物件是否相同的區別了。

在 Kotlin 中，三個等號 === 表示比較物件地址，
兩個 == 表示比較兩個值大小。
 */
fun main(args: Array<String>) {
    /*val a: Int = 10000
    println(a === a) //true，值相等，物件地址相等

    // 經過了裝箱，建立了兩個不同的物件
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    // 雖然經過了裝箱，但是值是相等的，都是 10000
    println(boxedA === anotherBoxedA) //  false，值相等，物件地址不一樣
    println(boxedA == anotherBoxedA) //true，值相等
    
    //[1,2,3]
    val a = arrayOf(1, 2, 3)
    //[0,2,4]
    val b = Array(3, { i -> (i * 2) })

    // 讀取陣列內容
    println(a[0])    // 輸出結果：1
    println(b[1])    // 輸出結果：2
    val text = """
    | 多行字串
    | 菜鳥教程
    | 多行字串
    |Runoob
    """.trimMargin()
    println(text)    // 前置空格刪除了
    
    val s = "runoob"
    val str = "$s.length is ${s.length}" // 求值結果為 "runoob.length is 6"
    println(str)
*/
    val price = """
    ${'$'}9.99
    """.trimMargin()
    println(price)  // 求值結果為 $9.99
}
/*
toByte(): Byte
toShort(): Short
toInt(): Int
toLong(): Long
toFloat(): Float
toDouble(): Double
toChar(): Char
和 Java 不一樣，Kotlin 中的 Char 不能直接和數字操作，
Char 必需是單引號 ' 包含起來的。比如普通字元 '0'，'a'。
預設 | 用作邊界字首，
但你可以選擇其他字元並作為引數傳入，比如 trimMargin (">")。
 */