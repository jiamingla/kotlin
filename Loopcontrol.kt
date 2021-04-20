/*fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun main(args: Array<String>) {
    println("----while 使用-----")
    var x = 5
    while (x > 0) {
        println( x--)
    }
    println("----do...while 使用-----")
    var y = 5
    do {
        println(y--)
    } while(y>0)
}
返回和跳轉
Kotlin 有三種結構化跳轉表示式：

return。預設從最直接包圍它的函式或者匿名函式返回。
break。終止最直接包圍它的迴圈。
continue。繼續下一次最直接包圍它的迴圈。
在迴圈中 Kotlin 支援傳統的 break 和 continue 運算子。

fun main(args: Array<String>) {
    for (i in 1..10) {
        if (i==3) continue  //i 為 3 時跳過當前迴圈，繼續下一次迴圈
        println(i)
        if (i>5) break   //i 為 6 時 跳出迴圈
    }
}
在 Kotlin 中任何表示式都可以用標籤（label）來標記。 
標籤的格式為識別符號後跟 @ 符號，例如：abc@、fooBar@都是有效的標籤。 
要為一個表示式加標籤，我們只要在其前加標籤即可。
現在，我們可以用標籤限制 break 或者 continue：

fun main(args: Array<String>) {
loop@ for (i in 1..100) {
    for (j in 1..100) {
        if (j == 5) break@loop
        println(j)
    }
}
}
*/
fun main(args: Array<String>) {

}
