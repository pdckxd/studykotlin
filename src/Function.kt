

fun max(a: Int, b: Int): Int {
    if(a > b) {
        return a
    } else {
        return b
    }
}

fun max2(a: Int, b: Int): Int = if (a > b) a else b


fun main(args: Array<String>) {

    val result1 = max(1, 2)
    val result2 = max2(99, 10)
    println("call function max(1, 2)=$result1")
    println("call function max2(99, 10)=$result2")

}