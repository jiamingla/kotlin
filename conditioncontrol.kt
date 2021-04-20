fun main(args: Array<String>) {
    var x = 0
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // 注意這個塊
            println("x 不是 1 ，也不是 2")
        }
    }

    when (x) {
        in 0..10 -> println("x 在該區間範圍內")
        else -> println("x 不在該區間範圍內")
    }
}