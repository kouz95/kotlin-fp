import java.util.*

typealias Converter<T> = (T) -> T

fun <T> convert(value: T, converter: Converter<T>): T = converter(value)

fun <T> add(a: T, b: T, op: (T, T) -> T): T = op(a, b)

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val value = input.nextDouble()
    println(convert(value) { it * 10 })

    val result = add(10, 20) { a, b -> a + b }
}