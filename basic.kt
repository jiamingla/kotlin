//Kotlin 檔案以 .kt 為字尾。
//程式碼檔案的開頭一般為包的宣告：
package com.runoob.main

//import java.util.*

fun main(args: Array<String>){  
    //println(sum(6,6));
    //printSum(5,6)
    //vars(1,2,3,4,5)  // 輸出 12345
    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
    //println(sumLambda(1,2))  // 輸出 3
    /*
    var a = 1
    // 模板中的簡單名稱：
    val s1 = "a is $a" 

    a = 2
    // 模板中的任意表達式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s1)
    println(s2)
    */
    // 型別後面加？表示可為空
    //var age: String? = null
    // 丟擲空指標異常
    //val ages = age!!.toInt()
    // 不做處理返回 null
    //val ages1 = age?.toInt()
    //age 為空返回 - 1
    //val ages2 = age?.toInt() ?: -1
    //println(age)
    //println(ages2)
    /*
    if (args.size < 2) {
        print("Two integers expected")
        return
    }
    val x = parseInt(args[0])
    val y = parseInt(args[1])
    // 直接使用 `x * y` 會導致錯誤，因為它們可能為 null.
    if (x != null && y != null) {
        // 在進行過 null 值檢查之後，x 和 y 的型別會被自動轉換為非 null 變數
        print(x * y)
    }
     */
    //println(getStringLength("我今天留在學校三個小時韻成姊不知道何時會回覆"))
    //for (i in 1..4) print(i) // 輸出 “1234”
    //for (i in 4..1) print(i) // 什麼都不輸出
    //var i :Int 
    //if (i in 1..10) { // 等同於 1 <= i && i <= 10
    //    println(i)
    //}
    // 使用 step 指定步長
    //for (i in 1..4 step 2) print(i) // 輸出 “13”
    //for (i in 4 downTo 1 step 2) print(i) // 輸出 “42”
    // 使用 until 函式排除結束元素
    //for (i in 1 until 10) {   //i in [1, 10) 排除了 10
    //    println(i)
    //}
    print("迴圈輸出：")
    for (i in 1..4) print(i) // 輸出 “1234”
    println("\n----------------")
    print("設定步長：")
    for (i in 1..4 step 2) print(i) // 輸出 “13”
    println("\n----------------")
    print("使用 downTo：")
    for (i in 4 downTo 1 step 2) print(i) // 輸出 “42”
    println("\n----------------")
    print("使用 until：")
    // 使用 until 函式排除結束元素
    for (i in 1 until 4) {   //i in [1, 4) 排除了 4
        print(i)
    }
    println("\n----------------")


}

fun parseInt(str: String): Int? {
    return(str.toInt())
}

class Runoob {}
/*
fun sum(a: Int,b: Int): Int { //Int 引數，返回值 Int
    return a + b
}
 */
//fun sum(a: Int, b: Int) = a + b
public fun sum(a: Int, b: Int): Int = a + b   
//public 方法則必須明確寫出返回型別
/*
fun printSum(a: Int, b: Int): Unit { 
    print(a + b)
}
 */
// 如果是返回 Unit 型別，則可以省略 (對於 public 方法也是這樣)：
public fun printSum(a: Int, b: Int) { 
    print(a + b)
}

fun vars(vararg v:Int){
    for(vt in v){
        print(vt)
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
      // 做過型別判斷以後，obj 會被系統自動轉換為 String 型別
      return obj.length 
    }
  
    // 在這裡還有一種方法，與 Java 中 instanceof 不同，使用！is
    // if (obj !is String){
    //   // XXX
    // }
  
    // 這裡的 obj 仍然是 Any 型別的引用
    return null
  }