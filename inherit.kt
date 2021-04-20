/*
open class Person(var name : String, var age : Int){// 基類

}

class Student(name : String, age : Int, var no : String, var score : Int) : Person(name, age) {
//子物件已有的變數就不用上var的宣告了欸
}

// 測試
fun main(args: Array<String>) {
    val s =  Student("Runoob", 18, "S12346", 89)
    println("學生名： ${s.name}")
    println("年齡： ${s.age}")
    println("學生號： ${s.no}")
    println("成績： ${s.score}")
}

 使用者基類 

open class Person(name:String){
     次級建構函式 
    constructor(name:String,age:Int):this(name){
        // 初始化
        println("------- 基類次級建構函式 ---------")
    }
}

 子類繼承 Person 類 
class Student:Person{

     次級建構函式 
    constructor(name:String,age:Int,no:String,score:Int):super(name,age){
        println("------- 繼承類次級建構函式 ---------")
        println("學生名： ${name}")
        println("年齡： ${age}")
        println("學生號： ${no}")
        println("成績： ${score}")
    }
}

fun main(args: Array<String>) {
    var s =  Student("Runoob", 18, "S12345", 89)
}
*/
open class A {
    open fun f () { print("A") }
    fun a() { print("a") }
}

interface B {
    fun f() { print("B") } // 介面的成員變數預設是 open 的
    fun b() { print("b") }
}

class C() : A() , B{
    override fun f() {
        super<A>.f()// 呼叫 A.f ()
        super<B>.f()// 呼叫 B.f ()
    }
}

fun main(args: Array<String>) {
    val c =  C()
    c.f();

}