fun <T> operator(a: T, op: (T, T) -> T): (T) -> T = { b -> op(a, b) }

fun main(args: Array<String>) {
    val op10plus = operator(10) { a, b -> a + b }

    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = numberList.map { op10plus(it) }
    println(result)
}